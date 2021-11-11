package Entidades;

public class Carnes extends Producto {

    String calidad;

    public Carnes(int codProducto) {
        super(codProducto);
        if (codProducto == 010) {
            this.calidad = "A5";
        } else {
            this.calidad = "A1";
        }
    }

    @Override
    public void ordenar(int Precio) {
        if (this.calidad.equalsIgnoreCase("A5")) {
            Precio = 500000;
        } else {
            Precio = 1000;
        }

        System.out.println("Su corte tiene una calidad de: " + calidad + " y el coste es de: " + Precio);
    }

}
