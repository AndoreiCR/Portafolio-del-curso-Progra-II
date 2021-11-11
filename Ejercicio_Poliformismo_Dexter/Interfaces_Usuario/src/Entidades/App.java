package Entidades;

public class App {
    public static void main(String[] args) throws Exception {
        Mantenimientos usuario = new usuario("Administrador");
        usuario.confirmar("dextervg");
        usuario.verificar(98);
        Procesos inicio = new inicioSesion("dextervg");
        inicio.confirmar("dextervg");
        inicio.verificar(002);
    }
}
