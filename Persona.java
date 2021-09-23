public class Persona {
    int id = 0;
    String nombre = "";
    String apellido = "";
    short edad = 0;

    void saludar() {
        System.out.println("Hola me llamo " + nombre);
    }

    String imprimir(){
        return "Soy "+nombre;
    }
}
