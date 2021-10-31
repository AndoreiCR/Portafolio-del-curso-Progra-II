package Test;

import org.junit.Test;
import javax.swing.JOptionPane;

public class dadosTest {
    int eleccion, ultimoTiro, salir = 0;

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
            while (eleccion <= ultimoTiro) {
                eleccion = (int) (Math.random() * 6 + 1);
                JOptionPane.showMessageDialog(null, "El resultado de tirar el dado fue: " + eleccion);
                // ultimoTiro = eleccion;
                if (eleccion >= ultimoTiro) {
                    JOptionPane.showMessageDialog(null, "El resultado de tirar el dado fue: " + eleccion);
                    salir = 1;
                }
                ultimoTiro = eleccion;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Saliendo del sistema");
        }
    }
}
