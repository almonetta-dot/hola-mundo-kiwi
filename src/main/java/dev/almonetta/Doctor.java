package dev.almonetta;

public class Doctor {
    String especialidad;
    String Nombre;
    int Horasdeatencion;
    String genero;

    public Doctor(String especialidad, String nombre, int horasdeatencion, String genero){}

    public boolean decicionIrMedico(){return true;}
    public void eleccion(){System.out.print("Escoge la especialidad:");}
    public void registrohora(){System.out.print("Selecciona las horas disponibles.");}

}
//no se tomo encuenta el valor de la hora y los tipos de especialidades, a demas de no mencionar si querian telemedicina o medicina precencial.