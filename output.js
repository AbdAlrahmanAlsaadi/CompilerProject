let products = [];
function addProduct(product) {
  products.push(product);
  renderProductList();
}
function deleteProduct(index) {
  products.splice(index, 1);
  renderProductList();
}
function getProduct(index) {
  return products[index];
}
function renderAddProduct() {
  const app = document.getElementById('app');
  app.innerHTML = `
    <h1>Add Product</h1>
    <form onsubmit="handleAddProduct(event)">
      <input type='text' id='pname' placeholder='Product Name' required />
      <input type='text' id='pdesc' placeholder='Description' required />
      <input type='number' id='pprice' placeholder='Price' required />
      <input type='file' id='pimg' accept='image/*' required />
      <button type='submit'>Add</button>
    </form>`;
}
function handleAddProduct(e) {
  e.preventDefault();
  const fileInput = document.getElementById('pimg');
  const reader = new FileReader();
  reader.onload = function(evt) {
    const product = {
      name: document.getElementById('pname').value,
      desc: document.getElementById('pdesc').value,
      price: document.getElementById('pprice').value,
      img: evt.target.result
    };
    addProduct(product);
    navigateTo('/list');
  };
  reader.readAsDataURL(fileInput.files[0]);
}
function renderProductList() {
  const app = document.getElementById('app');
  app.innerHTML = '<h1>Product List</h1><div class="grid"></div>';
  const grid = app.querySelector('.grid');
  products.forEach((p, index) => {
    const card = document.createElement('div');
    card.className = 'card';
    card.innerHTML = `
      <img src='${p.img}' class='thumb'/>
      <div class='info'>
        <h2><i class='fas fa-box'></i> ${p.name}</h2>
        <p><i class='fas fa-align-left'></i> ${p.desc}</p>
        <span class='price'><i class='fas fa-tag'></i> ${p.price}$</span>
      </div>
      <div class='actions'>
        <button class='details' onclick="navigateTo('/detail/${index}')"><i class='fas fa-info-circle'></i> Details</button>
        <button class='delete' onclick="deleteProduct(${index})"><i class='fas fa-trash'></i> Delete</button>
      </div>
    `;
    grid.appendChild(card);
  });
  app.innerHTML += `<button onclick=\"navigateTo('/add')\" class='add-btn'><i class='fas fa-plus'></i> Add Product</button>`;
}
function renderDetail(id) {
  const product = getProduct(id);
  const app = document.getElementById('app');
  app.innerHTML = `
  <div class='detail'>
    <img src='${product.img}' class='detail-img' />
    <h1><i class='fas fa-box'></i> ${product.name}</h1>
    <p><i class='fas fa-align-left'></i> ${product.desc}</p>
    <span class='price'><i class='fas fa-tag'></i> ${product.price}$</span>
    <button onclick=\"navigateTo('/list')\" class='details'>⬅ Back to List</button>
  </div>`;
}
function router() {
  const path = window.location.pathname;
  if (path === '/add') renderAddProduct();
  else if (path === '/list') renderProductList();
  else if (path.startsWith('/detail/')) {
    const id = path.split('/')[2];
    renderDetail(id);
  } else {
    navigateTo('/list');
  }
}
function navigateTo(route) {
  history.pushState(null, null, route);
  router();
}
window.addEventListener('popstate', router);
window.addEventListener('load', router);
