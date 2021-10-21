public class rol extends Entidad implements imprimible {

    public int getID() {
        return this.id;
    }

    public void setId(int valor) {
        this.id = valor;
    }

    @Override
    public String imprimir() {
        return "ID: " + Integer.toString(this.id) + ", Rol: " + this.nombre;
    }

}
