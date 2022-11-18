package com.mycompany.tiendabesysoft;

import java.util.Vector;


//Clase venta, se modela la clase con un vector de items, donde cada item corresponde
//a un producto y su respectiva cantidad y el vendedor que realiza la venta. Una función
//para agregar items a la venta y dos funciones para calcular tanto el total de productos
//de la venta y el precio total.

public class Venta {
    private Vector<Item> cItem;
    private Vendedor vendedor;
    
    public Venta(Vendedor vendedor){
        this.cItem = new Vector<Item> ();
        this.vendedor = vendedor;
        this.vendedor.addVenta(this);
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    
    public void agregarItem(Item item){
        this.cItem.add(item);
    }
    
    public Integer totalArticulos(){
        Integer total = 0;
        for (Item item : cItem){
            total += item.getCantidad();
        }
        return total;
    }
    
    public float totalPrecio(){
        float total = 0;
        for (Item item : cItem){
            total += item.getTotal();
        }
        return total;
    }
    
}
