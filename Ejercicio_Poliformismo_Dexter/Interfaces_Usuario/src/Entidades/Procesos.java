package Entidades;

import Interfaces.*;

public abstract class Procesos implements Confirmable , Verificable{
    protected String rol,usuario;
    

    public Procesos(String usuario) {
        this.usuario = usuario;
    }

    

    @Override
    public void confirmar(String usuario){
        this.usuario = usuario;
    }

    public void verificar(int idUsuario){
        
    }

}
