package dev.almonetta;

public class Vehiculo {
    String modelo;
    int anos;
    String color;
    double precio;


    public Vehiculo(String modelo,int anos, String color, double precio){}

    public void usoauto(){System.out.print("El auto es nuevo, semi nuevo, usado");}
    public void seguro(){System.out.print("¿El auto posee seguro?");}
    public void modelo(){System.out.print("Ingresa el modelo del auto a buscar:");}
}
//no se considero el tipo de rueda, la traccion del vehiculo, si es automarico o manual.