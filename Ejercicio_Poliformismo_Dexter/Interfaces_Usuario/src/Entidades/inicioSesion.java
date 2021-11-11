package Entidades;

import java.util.Scanner;

public class inicioSesion extends Procesos{

    protected String contraseña, confirmado;

    public inicioSesion(String usuario) {
        super(usuario);
        if(this.usuario.equals("dextervg")){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese la contraseña");
            contraseña = scanner.nextLine();
            if(contraseña.equals("12345678")){
                confirmado = "Acceso Concedido";
            }
        }else{
            confirmado = "Acceso denegado";
        }
    }

    @Override  
    public void confirmar(String usuario){
        if(confirmado.equalsIgnoreCase("Acceso denegado")){
            System.out.println("No tiene permisos para continuar");
        }
    }

    public void verificar(int idUsuario){
        if(idUsuario == 001){
            System.out.println("CUENTA BLOQUEADA");
            System.out.println("El usuario debe de contactar a un usuario adminsitrador para desbloquear la cuenta");
        }else if(idUsuario == 002){
            System.out.println("Acceso concedido");
            System.out.println("El usuario se encuentra en la base de datos");
        }
    }
    
}
