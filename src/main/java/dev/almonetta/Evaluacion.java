package dev.almonetta;

public class Evaluacion {
    String nombreasignatura;
    int nota;
    float ponderacion;
    int horadeevaluacion;

    public  Evaluacion(String nombreasignatura, int nota, float ponderacion, int horadeevaluacion){}

    public void nombre(){System.out.print("Ingrese el nombre del ramo de la evaluacion");}
    public int notafinal(){System.out.print("Ingrese la nota de la evaluacion");return 0;}
    public boolean pasodecurso(){System.out.print("El estudiante paso de curso?");return true;}

}
