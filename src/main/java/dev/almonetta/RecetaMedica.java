package dev.almonetta;

public class RecetaMedica {
    String obvservacion;
    String medicamento;
    int fecha;
    String nombrepaciente;

    public RecetaMedica(String obvservacion, String medicamento, int fecha, String nombrepaciente){}


    public void obvservacion(){System.out.print("Ingrese la obvservacion del paciente:");}
    public void nombre (){System.out.print("Ingrese el nombre del remedio solicitado:");}
    public int fecha(){System.out.print("Ingresa la fecha emitida:");return 20/10/26;}
}
//no se considero el nombre del doctor ni el nombre del centro medico de la emicion de la receta medica.