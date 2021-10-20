package Test;

import org.junit.Test;

import Ejercicio_1.*;

import javax.swing.JOptionPane;

public class movimientos_Test extends Cuenta{

    public int estadoCuenta;
    private int monto;
    int salir = 1;

    public movimientos_Test() {

    }

    @Test
    public void desplegarMenu() {
        int opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese la opcion a realizar\n" + "1. Depositar\n" + "2. Retiro\n" + "0. Salir"));
        transacciones(opc);
    }

    protected void transacciones(int opcion) {
        switch (opcion) {
            case 0:
                JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro sistema");
                break;
            case 1:
                monto = Integer
                        .parseInt(JOptionPane.showInputDialog(null, "Deposito a Realizar\n" + "Ingrese el monto"));
                guardarDeposito(monto);
                desplegarMenu();
                break;
            case 2:
                monto = Integer.parseInt(JOptionPane.showInputDialog(null, "Retiro a realizar\n" + "Ingrese el monto"));
                guardarRetiro(monto);
                desplegarMenu();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion ingresada es incorrecta");
                desplegarMenu();
                break;
        }
    }

    private void guardarDeposito(int monto) {
        estadoCuenta = estadoCuenta + monto;
        setEstadoCuenta(estadoCuenta);
        JOptionPane.showMessageDialog(null, "Se hizo el deposito por el siguiente monto: +" + monto);
        JOptionPane.showMessageDialog(null, "El estado de su cuenta es el siguiente: " + getEstadoCuenta());
    }

    private void guardarRetiro(int monto) {
        estadoCuenta = estadoCuenta - monto;
        setEstadoCuenta(estadoCuenta);
        JOptionPane.showMessageDialog(null, "Se hizo un retiro por el siguiente monto: -" + monto);
        JOptionPane.showMessageDialog(null, "El estado de su cuenta es el siguiente: " + getEstadoCuenta());
    }
}
