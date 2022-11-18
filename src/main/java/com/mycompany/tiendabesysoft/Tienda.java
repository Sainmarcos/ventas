package com.mycompany.tiendabesysoft;

import java.util.Vector;

public class Tienda {
    private Vector<Producto> cProductos;
    private Vector<Vendedor> cVendedores;
    
    public Tienda(){
        this.cProductos = new Vector ();
        this.cVendedores = new Vector ();
    }
    
    void agregarVendedor(Vendedor vendedor){
        for (Vendedor vend : cVendedores){
            if(vend.getCodigo() == vendedor.getCodigo()){
                System.out.println("ERROR: El código " + vendedor.getCodigo() + " que intenta cargar ya corresponde a un vendedor");
                return;
            }
        }
        cVendedores.add(vendedor);
    }
    
    void mostrarVendedores(){
        if(cVendedores.isEmpty()){
            System.out.println("No existen vendedores cargados");
        }
        for(Vendedor vend : cVendedores){
            System.out.println("Codigo: " + vend.getCodigo());
            System.out.println("Nombre: " + vend.getNombre());
            System.out.println("Sueldo: $" + vend.getSueldo());
            System.out.println();
        }
    }
    
    void comisiones (){
        for(Vendedor vend : cVendedores){
            System.out.println(
                    "Comision vendedor " + vend.getCodigo() 
                            + " " + vend.getNombre() + " $" + vend.comision());
        }
    }
    
    void agregarProducto(Producto producto){
        for (Producto prod : cProductos){
            if(prod.getCodigo() == producto.getCodigo()){
                System.out.println("ERROR: El código de producto que intenta cargar ya corresponde a un articulo");
                return;
            }
        }
        cProductos.add(producto);
    }
    
    void mostrarProductos(){
        if(cProductos.isEmpty()){
            System.out.println("No existen productos cargados");
        }
        for(Producto prod : cProductos){
            System.out.println("Codigo: " + prod.getCodigo());
            System.out.println("Nombre: " + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());
            System.out.println("Categoria: " + prod.getCategoria());
            System.out.println();
        }
    }
    
    void productosCategoria (String categoria){
        System.out.println("Productos de la categoria: " + categoria);
        Integer i = 0;
        for(Producto prod : cProductos){
            if(prod.getCategoria() == categoria){
                i++;
                System.out.println("Nombre: " + prod.getNombre());
            }
        }
        if(i==0){
            System.out.println("No existe ningun producto para esta categoria");
        }
    }
    
    void buscarCodigo (String cod){
        System.out.println("Producto de codigo: " + cod);
        Integer i = 0;
        for(Producto prod : cProductos){
            if(prod.getCodigo() == cod){
                i++;
                System.out.println("Nombre: " + prod.getNombre());
            }
        }
        if(i==0){
            System.out.println("No existe ningun producto con ese codigo");
        }
    }
    
    void buscarNombre (String nombre){
        System.out.println("Producto de nombre: " + nombre);
        Integer i = 0;
        for(Producto prod : cProductos){
            if(prod.getNombre() == nombre){
                i++;
                System.out.println("Nombre: " + prod.getNombre());
            }
        }
        if(i==0){
            System.out.println("No existe ningun producto con ese codigo");
        }
    }
    
    void productosPrecio(Integer menorMayor, float precio){
        Integer i = 0;
        if(menorMayor == 0){
            System.out.println("Productos de menor precio que: $" + precio);
            for(Producto prod : cProductos){
                if(prod.getPrecio() < precio){
                    i++;
                    System.out.println("Nombre: " + prod.getNombre());
                }
            }
        }else{
            if(menorMayor == 1){
                System.out.println("Productos de mayor precio que: $" + precio);
                for(Producto prod : cProductos){
                    if(prod.getPrecio() > precio){
                        i++;
                        System.out.println("Nombre: " + prod.getNombre());
                    }
                }
            }else{
                System.out.println("Campo mayor/menor invalido");
                return;
            }
        }
        if(i==0){
            System.out.println("No existe ningun producto que coincida con la busqueda");
        }
    }
}
