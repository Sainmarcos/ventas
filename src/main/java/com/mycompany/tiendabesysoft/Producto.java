package com.mycompany.tiendabesysoft;


//Clase producto, se modela un producto con los atributos indicadas en el enunciado.

public class Producto {
    private String codigo;
    private String nombre;
    private float precio;
    private String categoria;
    
    public Producto(String codigo, String nombre, float precio, String categoria){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
    
}
