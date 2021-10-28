package Entities;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class juego extends puntuacion {
    int salir = 0;
    String seleccion;

    public void jugar() {
        iniciar();
        while (salir == 0) {

            JOptionPane.showMessageDialog(null, "Juego piedra-papel-tijera\n" + "La computadora ya escogio...");

            int seleccionCompu = (int) (Math.random() * 3) + 1;

            int seleccionUsuario = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Indique su seleccion\n 1. Piedra,\n 2. Papel,\n 3. Tijera: \n 0. Salir\n"));

            if (seleccionCompu == 1) {
                seleccion = "Piedra";
            }
            if (seleccionCompu == 2) {
                seleccion = "Papel";
            }else{
                seleccion = "Tijera";
            }

            JOptionPane.showMessageDialog(null, "La computadora habia escogido: " + seleccion);
            switch (seleccionCompu) {
            case 1:
                switch (seleccionUsuario) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Empate!");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Usted gana!");
                    incrementar();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "La computadora gana!");
                    reducir();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias por jugar!");
                    salir = 1;
                    break;
                }
                break;

            case 2:
                switch (seleccionUsuario) {
                case 1:
                    JOptionPane.showMessageDialog(null, "La computadora gana!");
                    reducir();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Empate!");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Usted gana!");
                    incrementar();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias por jugar!");
                    salir = 1;
                    break;
                }
                break;

            case 3:
                switch (seleccionUsuario) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Usted gana!");
                    incrementar();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "La computadora gana!");
                    reducir();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Empate!");
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Gracias por jugar!");
                    salir = 1;
                    break;
                }
                break;
            }
        }
        mostrar();
    }

}
