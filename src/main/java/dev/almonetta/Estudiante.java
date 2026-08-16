package dev.almonetta;

public class Estudiante {
    String nombre;
    int edad;
    String genero;
    String curso;

    public Estudiante(String nombre, int edad, String genero, String curso){}

    public void nombre(){System.out.print("Ingresa el nombre del estudiante.");}
    public void edad (){System.out.print("Ingresa la edad del estudiante");}
    public void genero(){System.out.print("Ingresa el genero del estudiante");}

}
//no se considero el tipo de colegio ni el estractoeconomico del estudiante, solo se enfoco en las caracteristicas personales.