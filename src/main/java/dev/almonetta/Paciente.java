package dev.almonetta;

public class Paciente {
    String nombre;
    int edad;
    String genero;
    String afeccion;


    public Paciente(String nombre, int edad, String genero, String afeccion){}


    public boolean decicion(){return true;}
    public void tipoenfermedad(){System.out.print("Ingresa el tipo de dolencia del paciente");}
    public int edad(){System.out.print("Ingresa la edad del paciente");return 28;}

}
//no se tomo encuenta donde iria el paciente ni que dolor que podria tener.