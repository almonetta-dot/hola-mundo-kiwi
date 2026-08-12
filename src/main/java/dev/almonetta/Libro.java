package dev.almonetta;

public class Libro {
    //atributos
    String titulo;
    int anios;
    String autor;
    String genero;

    public Libro(String titulo, int anios, String autor, String genero){

    }
    //metodos
    public void leer(){
        System.out.print("lee el titulo del libro.");
    }
    public void meditar(){
        System.out.print("piensa en lo que leiste.");
    }
    public void obvservar(){
        System.out.print("Observa las imagenes del libro.");
    }
}

