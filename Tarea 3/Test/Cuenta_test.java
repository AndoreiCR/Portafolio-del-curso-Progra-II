package Test;

import jorg.

import javax.swing.JOptionPane;

public class Cuenta_est extends Persona {

    private String numCuenta = "CR95781531798562";
    private String tipoCuenta = "Ahorros";
    private String moneda = "Colones";
    private int estadoCuena, monto;

    public Cuenta() {

    }

    public void desplegarMenu() {
        int opc = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Ingrese la opcion a realizar\n" + "1. Depositar\n" + "2. Retiro"));
        acciones(opc);
    }

    protected void acciones(int opcion) {
        switch(opcion){
            case 1: monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Deposito a Realizar\n"+"Ingrese el monto"));
        }
    }

}

