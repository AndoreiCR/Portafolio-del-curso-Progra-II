public class Persona {
    private int id = 0;
    String nombre = "";
    String apellido = "";
    short edad = 0;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }


    void saludar() {
        System.out.println("Hola me llamo " + nombre
        + " Y mi ID es "+ id);
    }

    String imprimir() {
        return "Soy " + nombre;
    }

    
}
