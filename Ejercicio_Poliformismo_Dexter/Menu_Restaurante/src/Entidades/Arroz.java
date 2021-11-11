package Entidades;

public class Arroz extends Producto {
    String tipo;

    public Arroz(int codProducto) {
        super(codProducto);
        if (codProducto == 001) {
            this.tipo = "Arroz Integral";
        } else {
            this.tipo = "Arroz Blanco";
        }
    }

    @Override
    public void ordenar(int Precio) {
        System.out.println("Su plato es " + tipo + " y el coste es de: " + Precio);
    }
}
