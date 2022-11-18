package com.mycompany.tiendabesysoft;

import java.util.Vector;


//Clase vendedor, se modela un vendedor con los atributos indicados en el enunciado
//y ademas un vector con todas las ventas realizadas por este. Se agrega ademas de los
//getters y setters normales una función para agragar una nueva venta y una funcion
//que calcula la comision del mismo recorriendo el vector de ventas y calculando a
//cada venta el porcentaje adecuado.

public class Vendedor {
    private String codigo;
    private String nombre;
    private float sueldo;
    private Vector<Venta> cVentas;
    
    public Vendedor(String codigo, String nombre, float sueldo){
        this.codigo = codigo;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.cVentas = new Vector ();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    void addVenta(Venta venta) {
        this.cVentas.add(venta);
    }
    
    public float comision(){
        float total = 0;
        for(Venta venta : cVentas){
            if(venta.totalArticulos()>2){
                total += (venta.totalPrecio()*0.1);
            }else{
                total += (venta.totalPrecio()*0.05);
            }
        }
        
        return total;
        
    }

    
    
}
