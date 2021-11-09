package Cliente;
import java.util.Scanner;

public class menuPrincipal {

    private int opcion;
    Scanner scann = new Scanner(System.in);

    public void menu() {
        System.out.println("!Bienvenido!\n Ingrese la opcion deseada: \n" + "1. Registrar clientes de credito\n"
                + "2. Registrar ventas de contado\n" + "3. Registrar ventas de credito\n" + "4. Salir");
        opcion = scann.nextInt();

        switch (opcion) {
        default:
            System.out.println("Opcion ingresada incorrectamente, volviendo al menu de inicio");
            menu();
            break;
        case 1:
            cliente c = new cliente();
            c.menuRegistroClientes();
            break;
        case 2:
            break;
        case 3:
            break;
        case 4:
            scann.close();
            System.exit(opcion);
            break;
        }
    }
}
