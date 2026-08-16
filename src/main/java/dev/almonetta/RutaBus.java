package dev.almonetta;

public class RutaBus {
    String destino;
    int asiento;
    String ruta;
    double preciopasaje;


    public RutaBus(String destino, int asiento, String ruta, double preciopasaje){}


    public double pagopasaje(){System.out.print("Ingrese el monto a pagar: ");return 3000;}
    public void metododepago(){System.out.print("Desea pagar con efectivo o tarjeta");}
    public boolean decicion (){System.out.print("¿Deseas asistir al viaje?");return true;}
}
//no se tomo encuenta la plataforma de compra, el tipo de bus y el tipo de asiento.