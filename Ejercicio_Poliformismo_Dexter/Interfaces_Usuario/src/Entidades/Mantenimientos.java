package Entidades;

import Interfaces.Confirmable;
import Interfaces.Verificable;

public abstract class Mantenimientos implements Verificable, Confirmable {

    protected String rol;
    protected int idUsuario;

    public Mantenimientos(String rol) {
        this.rol = rol;
    }

    @Override
    public void verificar(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public void confirmar(String rol) {
        this.rol = rol;
    }
}
