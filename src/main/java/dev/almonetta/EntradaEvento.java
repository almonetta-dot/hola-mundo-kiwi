package dev.almonetta;

public class EntradaEvento {
    String Nombreevento;
    int horadeinicio;
    String lugardelevento;
    int precioentrada;

    public EntradaEvento(String nombreevento, int horadeinicio, String lugardelevento, int precioentrada){}


    public boolean decicionir(){return true;}
    public void compraentrada(){System.out.print("¿Deseas comprar la entrada de 1 dia o completo?");}
    public int pagoentrada(){return  0;}

}
//no se considero el lugar del evento ni el tipo de evento.