package dev.almonetta;

public class CitaMedica {

    int hora;
    double preciocita;
    String nombredoctor;
    float tasaprecio;


    public CitaMedica(int hora, double preciocita, String nombredoctor, float tasaprecio){

    }

    public boolean decicionir(){return true;}
    public void enfermedadregistada(){System.out.print("Ingresa el tipo de consulta.");}
    public double pagocita (){return 0;}

}
// no se tomo encuenta caracteristicas como el tipo de hostpital o recinto medico ni las caracteristicas del paciente.