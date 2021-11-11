package Entidades;

import Interfaces.Ordenable;

public abstract class Producto implements Ordenable {

    protected String Nombre, descripProducto;
    protected int codProducto, Precio;

    public Producto(int codProducto){
        this.codProducto = codProducto;
    }

    @Override
    public void ordenar(int Precio) {
        this.Precio = Precio;
    }

}
