package dev.almonetta;

public class Peliculas {
    String nombre;
    String genero;
    int duracion;
    String plataforma;


    public  Peliculas(String nombre, String genero, int duracion, String plataforma){}

    public boolean decicionVerPelicula(){return true;}
    public void seleccion(){System.out.print("¿Que pelicula quieres ver?");}
    public void tipo(){System.out.print("¿Que genero quieres buscar?");}
}
//no se tomo en cuenta el reparto de la pelicula ni el precio por ver la pelicula.