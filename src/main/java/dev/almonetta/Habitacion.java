package dev.almonetta;

public class Habitacion {
    String tipo;
    double precio;
    int tiempodeuso;
    int cantidadDePersonas;


    public Habitacion(String tipo, double precio,int tiempodeuso, int cantidadDePersonas){}

    public void cantidad(){System.out.print("Cuantas personas que quieren hospedar");}
    public double precio (){System.out.print("Ingresa el precio por habitacion."); return 0;}
    public void tipo(){System.out.print("Ingrese el tipo de habitacion.");}
}
//no se considero el lugar del reciento ni el numero total de habitaciones.