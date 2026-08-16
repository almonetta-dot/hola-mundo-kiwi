package dev.almonetta;

public class EntradaCine {
    String NombrePelicula;
    boolean deciciondeir;
    int pagoentrada;
    String seleccionpuesto;

    public EntradaCine(String nombrePelicula, boolean deciciondeir, int pagoentrada, String seleccionpuesto){}

    public boolean decicion(){return true;}
    public void genero(){System.out.print("Seleccione el genero a ver:");}
    public void asiento(){System.out.print("seleccione los asientos");}
}
//no se concidero el tipo de pelicula o sea tradicional, 3d, 2d, ETC.