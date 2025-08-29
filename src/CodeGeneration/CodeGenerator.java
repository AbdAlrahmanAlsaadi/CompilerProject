package CodeGeneration;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CodeGenerator {

    private FileWriter htmlWriter;
    private FileWriter cssWriter;
    private FileWriter jsWriter;

    private boolean initialized = false;

    public CodeGenerator() {
    }

    private FileWriter createFileIfNotExists(String filename) {
        try {
            File file = new File(filename);
            if (file.exists()) {
                return null; // ✅ إذا الملف موجود، ما نفتح للكتابة
            } else {
                return new FileWriter(file, false);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String generateStore() {
        return "let products = [];\n" +
                "function addProduct(product) {\n" +
                "  products.push(product);\n" +
                "  renderProductList();\n" +
                "}\n" +
                "function deleteProduct(index) {\n" +
                "  products.splice(index, 1);\n" +
                "  renderProductList();\n" +
                "}\n" +
                "function getProduct(index) {\n" +
                "  return products[index];\n" +
                "}\n";
    }

    public String generateAddProductPage() {
        return "function renderAddProduct() {\n" +
                "  const app = document.getElementById('app');\n" +
                "  app.innerHTML = `\n" +
                "    <h1>Add Product</h1>\n" +
                "    <form onsubmit=\"handleAddProduct(event)\">\n" +
                "      <input type='text' id='pname' placeholder='Product Name' required />\n" +
                "      <input type='text' id='pdesc' placeholder='Description' required />\n" +
                "      <input type='number' id='pprice' placeholder='Price' required />\n" +
                "      <input type='file' id='pimg' accept='image/*' required />\n" +   // ← رفع صورة
                "      <button type='submit'>Add</button>\n" +
                "    </form>`;\n" +
                "}\n" +

                "function handleAddProduct(e) {\n" +
                "  e.preventDefault();\n" +
                "  const fileInput = document.getElementById('pimg');\n" +
                "  const reader = new FileReader();\n" +
                "  reader.onload = function(evt) {\n" +
                "    const product = {\n" +
                "      name: document.getElementById('pname').value,\n" +
                "      desc: document.getElementById('pdesc').value,\n" +
                "      price: document.getElementById('pprice').value,\n" +
                "      img: evt.target.result\n" +
                "    };\n" +
                "    addProduct(product);\n" +
                "    navigateTo('/list');\n" +
                "  };\n" +
                "  reader.readAsDataURL(fileInput.files[0]);\n" +
                "}\n";
    }

    public String generateListPage() {
        return "function renderProductList() {\n" +
                "  const app = document.getElementById('app');\n" +
                "  app.innerHTML = '<h1>Product List</h1><div class=\"grid\"></div>';\n" +
                "  const grid = app.querySelector('.grid');\n" +
                "  products.forEach((p, index) => {\n" +
                "    const card = document.createElement('div');\n" +
                "    card.className = 'card';\n" +
                "    card.innerHTML = `\n" +
                "      <img src='${p.img}' class='thumb'/>\n" +
                "      <div class='info'>\n" +
                "        <h2><i class='fas fa-box'></i> ${p.name}</h2>\n" +
                "        <p><i class='fas fa-align-left'></i> ${p.desc}</p>\n" +
                "        <span class='price'><i class='fas fa-tag'></i> ${p.price}$</span>\n" +
                "      </div>\n" +
                "      <div class='actions'>\n" +
                "        <button class='details' onclick=\"navigateTo('/detail/${index}')\"><i class='fas fa-info-circle'></i> Details</button>\n" +
                "        <button class='delete' onclick=\"deleteProduct(${index})\"><i class='fas fa-trash'></i> Delete</button>\n" +
                "      </div>\n" +
                "    `;\n" +
                "    grid.appendChild(card);\n" +
                "  });\n" +
                "  app.innerHTML += `<button onclick=\\\"navigateTo('/add')\\\" class='add-btn'><i class='fas fa-plus'></i> Add Product</button>`;\n" +
                "}\n";
    }


    public String generateDetailPage() {
        return "function renderDetail(id) {\n" +
                "  const product = getProduct(id);\n" +
                "  const app = document.getElementById('app');\n" +
                "  app.innerHTML = `\n" +
                "  <div class='detail'>\n" +
                "    <img src='${product.img}' class='detail-img' />\n" +
                "    <h1><i class='fas fa-box'></i> ${product.name}</h1>\n" +
                "    <p><i class='fas fa-align-left'></i> ${product.desc}</p>\n" +
                "    <span class='price'><i class='fas fa-tag'></i> ${product.price}$</span>\n" +
                "    <button onclick=\\\"navigateTo('/list')\\\" class='details'>⬅ Back to List</button>\n" +
                "  </div>`;\n" +
                "}\n";
    }



    public String generateRouter() {
        return "function router() {\n" +
                "  const path = window.location.hash.replace('#', '');\n" +
                "  if (path === '/add') renderAddProduct();\n" +
                "  else if (path === '/list') renderProductList();\n" +
                "  else if (path.startsWith('/detail/')) {\n" +
                "    const id = path.split('/')[2];\n" +
                "    renderDetail(id);\n" +
                "  } else {\n" +
                "    navigateTo('/list');\n" +
                "  }\n" +
                "}\n" +

                "function navigateTo(route) {\n" +
                "  window.location.hash = route;\n" +
                "}\n" +

                "window.addEventListener('load', router);\n" +
                "window.addEventListener('hashchange', router);\n";
    }

    public void writeHTML(String code) {
        try {
            if (htmlWriter != null) {
                htmlWriter.write(code + System.lineSeparator());
                htmlWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeCSS(String code) {
        try {
            if (cssWriter != null) {
                cssWriter.write(code + System.lineSeparator());
                cssWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeJS(String code) {
        try {
            if (jsWriter != null) {
                jsWriter.write(code + System.lineSeparator());
                jsWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String generateHead(String title) {
        return "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "  <title>" + title + "</title>\n" +
                "  <link rel=\"stylesheet\" href=\"style.css\">\n" +
                "  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\">\n" +  // ✅ أيقونات
                "</head>\n" +
                "<body>\n" +
                "<div id=\"app\"></div>\n" +
                "<script src=\"output.js\"></script>\n";
    }

    public String generateFooter() {
        return "</body>\n</html>";
    }


    public String generateCSS() {
        return "body { font-family: 'Segoe UI', sans-serif; margin: 0; padding: 0; background: #f2f2f9; }\n" +
                "h1 {\n" +
                "  color: #333; \n" +
                "  text-align:center; \n" +
                "  margin: 20px 0; \n" +
                "  font-size: 28px; \n" +
                "  font-weight: 700; \n" +
                "  letter-spacing: 1px;\n" +
                "}\n" +

                /* Grid and Cards */
                ".grid { display: grid; grid-template-columns: repeat(auto-fill, minmax(250px, 1fr)); gap: 20px; padding: 20px; }\n" +
                ".card { background: #fff; border-radius: 12px; box-shadow: 0 4px 12px rgba(0,0,0,0.1); overflow: hidden; text-align:center; padding: 15px; transition: transform .2s; }\n" +
                ".card:hover { transform: scale(1.03); }\n" +
                ".thumb { width: 100%; height: 180px; object-fit: cover; border-radius: 8px; }\n" +
                ".info { padding: 10px 0; }\n" +
                ".info h2 { font-size: 18px; margin: 10px 0 5px; color:#222; }\n" +
                ".info p { font-size: 14px; color: #666; margin: 5px 0; }\n" +
                ".price { font-weight: bold; color: #007bff; margin: 10px 0; font-size:16px; }\n" +

                /* Actions (buttons inside cards) */
                ".actions { margin-top: 10px; display:flex; justify-content:center; gap: 10px; }\n" +
                "button { padding: 8px 14px; border: none; border-radius: 6px; cursor: pointer; font-weight: bold; transition: 0.2s; }\n" +
                "button.details { background: linear-gradient(45deg,#4facfe,#007bff); color:white; }\n" +
                "button.details:hover { background: linear-gradient(45deg,#007bff,#4facfe); }\n" +
                "button.delete { background: #ff4d4d; color:white; }\n" +
                "button.delete:hover { background: #cc0000; }\n" +

                /* Add button (global) */
                "button.add-btn { margin: 20px auto; display:block; background: linear-gradient(45deg,#6a11cb,#2575fc); color:white; padding:12px 20px; font-size:16px; }\n" +
                "button.add-btn:hover { background: linear-gradient(45deg,#2575fc,#6a11cb); }\n" +

                /* Detail page */
                ".detail { max-width: 600px; margin: 40px auto; background: #fff; padding:20px; border-radius:12px; box-shadow: 0 4px 12px rgba(0,0,0,0.1); text-align:center; }\n" +
                ".detail h1 { margin-bottom:15px; }\n" +
                ".detail p { color:#555; margin-bottom:10px; }\n" +
                ".detail .price { font-size:20px; color:#007bff; margin-bottom:20px; display:block; }\n" +
                ".detail-img { max-width:100%; border-radius: 12px; margin-bottom:20px; }\n" +

                /* Form styling */
                "form { max-width: 400px; margin: 20px auto; background:#fff; padding:20px; border-radius:12px; box-shadow:0 4px 12px rgba(0,0,0,0.1); display:flex; flex-direction:column; gap:15px; }\n" +
                "form input { padding:10px; border:1px solid #ccc; border-radius:8px; font-size:14px; }\n" +
                "form button { \n" +
                "  background: linear-gradient(45deg,#4facfe,#007bff); \n" +
                "  color:white; \n" +
                "  font-size:16px; \n" +
                "  font-weight: bold;\n" +
                "  border-radius: 8px;\n" +
                "  padding: 12px 20px;\n" +
                "  transition: 0.2s;\n" +
                "}\n" +
                "form button:hover { \n" +
                "  background: linear-gradient(45deg,#007bff,#4facfe); \n" +
                "}\n" +
                "form button:hover { background: linear-gradient(45deg,#38ef7d,#11998e); }\n";
    }

    public void generateApp() {
        try {
            htmlWriter = new FileWriter("output.html", false);
            cssWriter = new FileWriter("style.css", false);
            jsWriter = new FileWriter("output.js", false);

            htmlWriter.write(generateHead("Generated App"));
            htmlWriter.write(generateFooter());
            htmlWriter.close();

            cssWriter.write(generateCSS());
            cssWriter.close();

            jsWriter.write(generateStore());
            jsWriter.write(generateAddProductPage());
            jsWriter.write(generateListPage());
            jsWriter.write(generateDetailPage());
            jsWriter.write(generateRouter());
            jsWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}