package test;

import java.util.Scanner;
import org.junit.Test;

import Entities.puntuacion;


public class juegoTest extends puntuacion{
    int salir;
    @Test
    public void jugar() {
        iniciar();
        while (salir != 0) {
            System.out.println("Juego piedra-papel-tijera");
            Scanner teclado = new Scanner(System.in);

            int seleccionCompu = (int) (Math.random() * 3) + 1;
            System.out.println("La computadora ya escogio...");

            System.out.print("Indique su seleccion\n 1. Piedra,\n 2. Papel,\n 3. Tijera: \n 0. Salir");
            int seleccionUsuario = teclado.nextInt();

            System.out.print("La computadora habia escogido: ");
            switch (seleccionCompu) {
            case 1:
                System.out.println("Piedra");
                switch (seleccionUsuario) {
                case 1:
                    System.out.println("Empate!");
                    break;
                case 2:
                    System.out.println("Usted gana!");
                    incrementar();
                    break;
                case 3:
                    System.out.println("La computadora gana!");
                    reducir();
                    break;
                case 0:
                    System.out.println("Gracias por jugar!");
                    salir = 1;
                    break;
                }
                break;

            case 2:
                System.out.println("Papel");
                switch (seleccionUsuario) {
                case 1:
                    System.out.println("La computadora gana!");
                    reducir();
                    break;
                case 2:
                    System.out.println("Empate!");
                    break;
                case 3:
                    System.out.println("Usted gana!");
                    incrementar();
                    break;
                case 0:
                    System.out.println("Gracias por jugar!");
                    salir = 1;
                    break;
                }
                break;

            case 3:
                System.out.println("Tijera");
                switch (seleccionUsuario) {
                case 1:
                    System.out.println("Usted gana!");

                    incrementar();
                    break;
                case 2:
                    System.out.println("La computadora gana!");
                    reducir();
                    break;
                case 3:
                    System.out.println("Empate!");
                    break;
                case 0:
                    System.out.println("Gracias por jugar!");
                    salir = 1;
                    break;
                }
                break;
            }
        }
    }
}
