package dev.almonetta;
//no se decidio usar el tamaño y no se definio el objeto ya que se deja a critero del usuario
public class Producto {
    String color;
    String forma;
    String categoria;
    int precio;

    public Producto (String color, String forma, int precio, String categoria){

    }

    public boolean DecisionCompra(){return true;}
    public void tipoObjeto(){System.out.println("Escribe el objeto seleccionado");}
    public double precioProducto(){
        return this.precio;
    }



}