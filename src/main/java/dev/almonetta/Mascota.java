package dev.almonetta;

public class Mascota {
    String perro;
    String gato;
    String conejo;
    String raton;


    public Mascota(String perro, String gato, String conejo, String raton){}

    public void vacunas(){System.out.print("Ingrese el total de vacunas que tiene el animal.");}
    public int peso(){System.out.print("Ingese el peso del animal"); return 0;}
    public void control(){System.out.print("Ingrese los controles que le faltan a la mascota.");}
}
// no se tomo encuenta ni el precio ni el tipo de vacuna ni el tipo de contro que le falta.