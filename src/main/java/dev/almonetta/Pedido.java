package dev.almonetta;

public class Pedido {
    String producto;
    double precio;
    String ruta;
    int tiempodeespera;


    public  Pedido(String producto, double precio, String ruta, int tiempodeespera){}


    public boolean deciciontomapedido(){return true;}
    public void seleccion(){System.out.print("Selecciona el producto a pedir:");}
    public void escogerMedioPago (){System.out.print("¿paga onilne o efectivo?");}
}
//no se tomo encuenta el tipo de aplicacion ni la direcciones de destino del pedido.