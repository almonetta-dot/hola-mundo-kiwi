package dev.almonetta;

public class MesaRestaurant {
    int cantidadXpersonas;
    String tipodemesa;
    int horareservada;
    String colormantel;


    public MesaRestaurant(int cantidadXpersonas, String tipodemesa, int horareservada, String colormantel){}


    public int cantidad(){System.out.print("¿Cuantas personas usaran la mesa?");return 6;}
    public void tipo(){System.out.print("Ingresa la forma de la mesa");}
    public int reserva(){System.out.print("¿Cuanta horas se reservara la mesa?");return 2;}
}
//no se considero el lugar de la mesa ni los tipos de plato o utencilios sobre ella.