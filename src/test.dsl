entity Product {
   name string
   desc string
   price number
   img url
}

store products Product[]

actions {
   addProduct(Product)
   deleteProduct(Product)
}

page Add {
   form Product
   onSubmit addProduct go List
}

page List {
   list products
   addButton Add
}

page Detail {
   detail products by id
   actionButtons editPage=Add deleteAction=deleteProduct
}
