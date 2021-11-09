package Entidades;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import Interfaces.mostrable;
import Interfaces.registrable;

public class ventasAcontado extends informacionVentas implements mostrable, registrable {
    Scanner scanner = new Scanner(System.in);
    Date obtenerFecha = new Date();
    LocalDateTime ldt = LocalDateTime.now();
    private int opc, index;
    menuPrincipal mP = new menuPrincipal();
    ArrayList<ventasAcontado> ventasAcontado = new ArrayList<>();
    ventasAcontado auxVAC;

    public void menuVentasAContado() {
        System.out.println("!Registro de ventas!\n Ingrese la opcion deseada: \n" + "1. Ver las ventas a contado\n"
                + "2. Registrar venta a contado\n" + "3. Salir");
        opc = scanner.nextInt();

        switch (opc) {
        default:
            System.out.println("Opcion ingresada correctamente, volviendo al menu anterior");
            menuVentasAContado();
            break;
        case 1:
            mostrar();
            break;
        case 2:
            registrar();
            break;
        case 3:
            mP.menu();
            break;
        }
    }

    @Override
    public void registrar() {
        try {
            if (getidVentaContado() == 0) {
                setidVentaContado(1);
            } else {
                setidVentaContado(idVentaContado + 1);
            }
            auxVAC = new ventasAcontado();
            auxVAC.setidVentaContado(idVentaContado);
            System.out.println("Ingrese el monto de la venta realizada");
            auxVAC.setMontoVenta(scanner.nextInt());
            System.out.println("Ingrese el metodo de pago realizada");
            auxVAC.setMetodoPago(scanner.next());
            auxVAC.setFecha(LocalDate.now().toString());
            auxVAC.setHora(ldt.getHour());
            ventasAcontado.add(auxVAC);
            System.out.println("Venta agregada satisfactoriamente");
            index++;

        } catch (final Exception e) {
            System.out.println(" " + e);
        }
        menuVentasAContado();

    }

    @Override
    public void mostrar() {
        for (int i = 0; i < index; i++) {
            System.out.println("Id de la venta: " + ventasAcontado.get(i).getidVentaContado() + " Monto de la venta: "
                    + ventasAcontado.get(i).getMontoVenta() + " Metodo de pago: "
                    + ventasAcontado.get(i).getMetodoPago() + " Fecha de la venta: " + ventasAcontado.get(i).getFecha()
                    + " hora: " + ventasAcontado.get(i).getHora());
        }
        menuVentasAContado();
    }
}
