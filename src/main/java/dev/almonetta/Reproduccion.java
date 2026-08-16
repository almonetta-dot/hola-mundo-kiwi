package dev.almonetta;

public class Reproduccion {
    boolean estado;
    int fecha;
    String obvservacion;
    String avance;


    public Reproduccion(boolean estado,int fecha,String obvservacion, String avance){}


    public boolean estado(){System.out.print("Disponible/no disponible");return true;}
    public void observaion(){System.out.print("Escriba algun comentario o duda:");}
    public void fecha (){System.out.print("Ingrese la fecha de lanzamiento:");}

}
//no se tomo encuenta el tipo de plataforma, el nombre de la reproduccion o la categoria ya se pelicula, musica, etc.