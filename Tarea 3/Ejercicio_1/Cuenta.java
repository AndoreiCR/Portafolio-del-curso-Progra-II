package Ejercicio_1;


public class Cuenta extends Persona implements Depositar{

    private String Dueño = getNombre();
    private int numCuenta;
    private String tipoCuenta;
    private String moneda;
    private int monto;

    public Cuenta(){
        
    }

    @Override
    public void deposito(){

    }


}
