package Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class cliente extends informacionCliente implements eliminable, mostrable, registrable, modificable {

    Scanner scanner = new Scanner(System.in);
    private int opc;
    menuPrincipal mP = new menuPrincipal();
    ArrayList<cliente> Cliente = new ArrayList<>();
    cliente auxCliente;

    public void menuRegistroClientes() {
        System.out.println("!Registro de Clientes!\n Ingrese la opcion deseada: \n" + "1. Registrar cliente\n"
                + "2. Ver Clientes\n" + "3. Modificar Cliente\n" + "4. Eliminar Cliente\n" + "5. Salir");
        opc = scanner.nextInt();

        switch (opc) {
        default:
            System.out.println("Opcion ingresada correctamente, volviendo al menu anterior");
            menuRegistroClientes();
            break;
        case 1:
            registrar();
            break;
        case 2:
            mostrar();
            break;
        case 3:
            modificar();
            break;
        case 4:
            eliminar();
            break;
        case 5:
            mP.menu();
            break;
        }
    }

    @Override
    public void registrar() {
        try {
            if (getId() == 0) {
                setId(1);
            } else if (getIdC() != 0) {
                setId(getIdC());
            } else {
                setId(id + 1);
            }
            auxCliente = new cliente();
            auxCliente.setId(id);
            System.out.println("Ingrese el nombre del cliente");
            auxCliente.setNombre(scanner.next());
            System.out.println("Ingrese el telefono del cliente");
            auxCliente.setTelefono(scanner.nextInt());
            System.out.println("Ingrese el correo del cliente");
            auxCliente.setCorreo(scanner.next());
            Cliente.add(auxCliente);
            System.out.println("Cliente agregado satisfactoriamente");
        } catch (Exception e) {
            System.out.println(" " + e);
        }
        setIdC(0);
        menuRegistroClientes();
        
    }

    @Override
    public void mostrar() {
        for (int i = 0; i < getId(); i++) {
            System.out.println("Id del cliente: " + Cliente.get(i).getId() + " Nombre: " + Cliente.get(i).getNombre());
        }
        menuRegistroClientes();
    }

    @Override
    public void eliminar() {
        for (int i = 0; i < getId(); i++) {
            System.out.println("Id del cliente: " + Cliente.get(i).getId() + " Nombre: " + Cliente.get(i).getNombre());
        }
    }

    @Override
    public void modificar() {

        for (int i = 0; i < getId(); i++) {
            System.out.println("Id del cliente: " + Cliente.get(i).getId() + " Nombre: " + Cliente.get(i).getNombre()
                    + " Telefono: " + Cliente.get(i).getTelefono() + " Correo: " + Cliente.get(i).getCorreo());
        }
        System.out.println("Ingrese el ID del cliente a modificar");
        setIdC(scanner.nextInt());
        registrar();
    }

}
