package dev.almonetta;

public class Producto {
    String color;
    String forma;
    int tamano;
    String categoria;

    public Producto (String color, String forma, int tamano, String categoria){

    }

    public boolean decisionComprar(){
        return true;
    }

    public void tipoObjeto(){System.out.println("Escribe el objeto seleccionado");}


    public double precioProducto(){
        return 0;
    }



}