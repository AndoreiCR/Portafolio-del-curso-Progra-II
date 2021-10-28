package Entities;

import javax.swing.JOptionPane;
import javax.swing.UIClientPropertyKey;

public class dados {
    int eleccion, ultimoTiro;

    public void alterado() {

        int confirmado = JOptionPane.showConfirmDialog(null, "¿Tirar el dado");

        if (JOptionPane.OK_OPTION == confirmado) {
            eleccion = 6;
            JOptionPane.showMessageDialog(null, "El resultado de tirar el dado fue: " + eleccion);
        } else {
            JOptionPane.showMessageDialog(null, "Saliendo del sistema");
        }

    }

    public void masAlto() {

        int confirmado = JOptionPane.showConfirmDialog(null, "¿Tirar el dado");

        if (JOptionPane.OK_OPTION == confirmado) {
            while (eleccion < ultimoTiro) {
                eleccion = (int) (Math.random() * 6);
                JOptionPane.showMessageDialog(null, "El resultado de tirar el dado fue: " + eleccion);
                ultimoTiro = eleccion;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Saliendo del sistema");
        }
    }

    public void random() {

        int confirmado = JOptionPane.showConfirmDialog(null, "¿Tirar el dado");

        if (JOptionPane.OK_OPTION == confirmado) {
            eleccion = (int) (Math.random() * 6);
            JOptionPane.showMessageDialog(null, "El resultado de tirar el dado fue: " + eleccion);
        } else {
            JOptionPane.showMessageDialog(null, "Saliendo del sistema");
        }

    }

}
