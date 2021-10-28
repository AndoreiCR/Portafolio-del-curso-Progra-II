package Test;

import javax.swing.JOptionPane;

import org.junit.Test;

public class dadosTest {
    int eleccion, ultimoTiro,salir = 0;

    @Test
    public void alterado() {
        eleccion = 6;

        int confirmado = JOptionPane.showConfirmDialog(null, "¿Tirar el dado");

        if (JOptionPane.OK_OPTION == confirmado) {
            eleccion = 6;
            JOptionPane.showMessageDialog(null, "El resultado de tirar el dado fue: " + eleccion);
        } else {
            JOptionPane.showMessageDialog(null, "Saliendo del sistema");
        }
    }

    @Test
    public void random() {

        int confirmado = JOptionPane.showConfirmDialog(null, "¿Tirar el dado");

        if (JOptionPane.OK_OPTION == confirmado) {
            eleccion = (int) (Math.random() * 6 + 1);
            JOptionPane.showMessageDialog(null, "El resultado de tirar el dado fue: " + eleccion);
        } else {
            JOptionPane.showMessageDialog(null, "Saliendo del sistema");
        }

    }

    @Test
    public void masAlto() {

        int confirmado = JOptionPane.showConfirmDialog(null, "¿Tirar el dado");

        if (JOptionPane.OK_OPTION == confirmado) {
            while (salir == 0 ) {
                eleccion = (int) (Math.random() * 6 +1 );
                JOptionPane.showMessageDialog(null, "El resultado de tirar el dado fue: " + eleccion);
                ultimoTiro = eleccion;
                if(eleccion>ultimoTiro){
                    salir = 1;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Saliendo del sistema");
        }
    }
}
