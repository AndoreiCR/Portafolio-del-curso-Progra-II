package Entidades;

public class usuario extends Mantenimientos {

    protected String permisos, rolU;

    public usuario(String rol) {
        super(rol);
        if (this.rol.equalsIgnoreCase("Administrador")) {
            this.permisos = "Todos los permisos";
            this.rolU = rol;
        }
    }

    @Override
    public void confirmar(String usuario) {
        if (this.rol.equalsIgnoreCase("Administrador")) {
            System.out.println("El perfil de: " + usuario + " se establece en Administrador");
        }

    }

    public void verificar(int idUsuario) {
        if (this.permisos.equalsIgnoreCase("todos los permisos")) {
            System.out.println("El usuario con el id " + idUsuario
                    + " posee permisos para realizar los cambios de contraseñas de los usuarios invitados ya que el rol que posee es "
                    + rol);
        }
    }

}
