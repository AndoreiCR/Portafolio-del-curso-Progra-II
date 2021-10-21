public class usuario extends Entidad implements imprimible{

    public String apellido, nombre, correo, telefono;
    public rol roldeUsuario;

    public usuario(int ID) {
        this.id = ID;
    }

    public int getId() {
        return this.id;
    }

    @Override
    public String imprimir() {
        return "Nombre del usuario "+this.nombre + " " + this.apellido;
    }

}
