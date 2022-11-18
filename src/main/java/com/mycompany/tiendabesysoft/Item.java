package com.mycompany.tiendabesysoft;


//Clase item, esta clase corresponde a un producto y su cantidad en cada venta. 
//Contiene el producto y su cantidad como tambien una funcion para calcular el total.

class Item {
    private Producto producto;
    private Integer cantidad;
    
    public Item(Producto producto, Integer cantidad){
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    public float getTotal() {
        return this.producto.getPrecio() * this.cantidad;
    }
}
