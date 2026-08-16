package dev.almonetta;

public class CuentaBancaria {
    int monto;
    float interesacumulado;
    String tipodecuenta;
    int horaregistrada;

    public CuentaBancaria(int monto, float interesacumulado,String tipodecuenta, int horaregistrada){}


    public void tipocuenta(){System.out.print("Que cuenta quiere usar?");
    }
    public float interes(){return 0;}
    public boolean decicionuso(){return true;}
}
