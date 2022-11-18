package com.mycompany.tiendabesysoft;


public class TiendaBesysoft {

    public static void main(String[] args) {
        Tienda miTienda = new Tienda();
        
        Producto cocaCola = new Producto("prod001","Coca Cola 1.5", 390, "Gaseosa");
        Producto lays = new Producto("prod002","Lays 94g", 390, "Snack");
        Producto block = new Producto("prod003","block 170g", 890, "Chocolate");
        Producto milka = new Producto("prod004","Milka 170g", 710, "Chocolate");
        Producto shot = new Producto("prod005","shot 170g", 1000, "Chocolate");
        
        miTienda.agregarProducto(cocaCola);
        miTienda.agregarProducto(lays);
        miTienda.agregarProducto(block);
        miTienda.agregarProducto(milka);
        miTienda.agregarProducto(shot);
        
        //miTienda.mostrarProductos(); //Muestra todos los productos.
        //miTienda.productosCategoria("Chocolate"); //Muestra los productos de la categoria especificada.
        //miTienda.buscarCodigo("prod003"); //Muestra el producto que coincida con el codigo especificado.
        //miTienda.buscarNombre("block 170g"); //Muestra el producto que coincida con el nombre especificado.
        //miTienda.productosPrecio(1, 800); //El primer campo indica si el precio es menor (0) o mayor (1) al segundo campo que es un precio.


        
       Vendedor vendedor1 = new Vendedor("vend001", "Sain Marcos", 80000);
       Vendedor vendedor2 = new Vendedor("vend002", "Gonzalez Rodrigo", 90000);
        
       miTienda.agregarVendedor(vendedor1);
       miTienda.agregarVendedor(vendedor2);
       
       miTienda.mostrarVendedores();
       
       Item item1 = new Item(cocaCola, 1);
       Item item2 = new Item(lays, 2);
        
       Venta venta1 = new Venta(vendedor1);
       venta1.agregarItem(item1);
       venta1.agregarItem(item2);
       
       miTienda.comisiones();
       
        
    }
}
