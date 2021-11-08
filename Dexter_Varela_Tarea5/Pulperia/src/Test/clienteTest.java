package Test;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Test;

import Cliente.cliente;
import Cliente.informacionCliente;

public class clienteTest extends informacionCliente {
    Scanner scanner = new Scanner(System.in);
    ArrayList<cliente> cliente = new ArrayList<>();
    cliente aux;

    @Test
    public void registrar() {
        try {
            aux = new cliente();
            if (getId() == 0) {
                setId(1);
            } else {
                setId(id + 1);
            }
            aux.setId(id);
            System.out.println("Ingrese el nombre del cliente");
            aux.setNombre(scanner.next());
            System.out.println("Ingrese el telefono del cliente");
            aux.setTelefono(scanner.nextInt());
            System.out.println("Ingrese el correo del cliente");
            aux.setCorreo(scanner.next());
            cliente.add(aux);
        } catch (Exception e) {
            System.out.println(" " + e);
        }
    }
}
