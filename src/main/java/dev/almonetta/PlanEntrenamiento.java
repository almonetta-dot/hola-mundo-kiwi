package dev.almonetta;

public class PlanEntrenamiento {
    String tipoPlan;
    String TipoDeEjercicio;
    int duracionEjercicio;
    boolean conEntrenador;

    public PlanEntrenamiento(String tipoPlan, String tipoDeEjercicio, int duracionEjercicio, boolean conEntrenador){}

    public boolean entrenador(){System.out.print("¿Quieres algun entrenador?");return true;}
    public void dondehacerejercicio(){System.out.print("¿Deseas hacer ejercicio en exterior o interior?");}
    public int duracion(){System.out.print("Cuanto tiempo quieres entrenar;");return 30;}

}
//no se menciono el tipo de entrenamiento y si sera personalizado o con mas publico.