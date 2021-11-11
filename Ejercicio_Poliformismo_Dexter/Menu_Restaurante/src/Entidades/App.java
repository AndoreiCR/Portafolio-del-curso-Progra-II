package Entidades;
public class App {
    public static void main(String[] args) throws Exception {
        Producto arroz = new Arroz(002);
        arroz.ordenar(2500);
        Producto carne = new Carnes(010);
        carne.ordenar(0);
    }
}
