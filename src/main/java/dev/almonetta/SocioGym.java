package dev.almonetta;

public class SocioGym {
    String nombreGYM;
    String tipoplan;
    float cuotasapagar;
    boolean incluirentrenador;


    public SocioGym(String nombreGYM, String tipoplan, float cuotasapagar, boolean incluirentrenador){}

    public void metododepago(){System.out.print("Como quiere pagar en efectivo o tarjeta:");}
    public boolean isIncluirentrenador(){System.out.print("¿Quieres incluir un entrenador personal?");return true;}
    public double montoapagar(){System.out.print("El monto por ser socio es de 40.000 pesos mensuales.");return 40000;}
}
//no se considero la direccion ni las posibles ventajas que podria contener el socio del gym.