package dev.almonetta;

public class Profesor {
    String nombre;
    String materia;
    String genero;
    int edad;


    public Profesor (String nombre, String materia,String genero, int edad){}


    public void materia(){System.out.print("Ingresa la materia que imparte:");}
    public void tomanota(){System.out.print("Ingrese las notas de los estudiantes");}
    public int duracionClase(){System.out.print("Ingrese el tiempo que su clase:"); return 2;}

}
// no se tomo encuenta en donde trabaja, la trayectoria que tiene el profesor ni la experiencia laboral de este mismo.