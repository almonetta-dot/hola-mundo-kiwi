package dev.almonetta;
//no se uso el tiempo de paga del prestamos ni la recepcion del dinero

public class Prestamo {
    String fechaprestamo;
    int montoprestamo;
    float tasapresio;
    int cuotas;

    public Prestamo(String fechaprestamo, int montoprestamo, float tasapresio, int cuotas){

    }



    public boolean solicitar(){
        return true;
    }

    public int pagarcuota(int cuotas){
        return 0;
    }

    public boolean terminarprestamo(){
        return true;
    }
}

