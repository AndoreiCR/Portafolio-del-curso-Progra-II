import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

class HelloWorld {

    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null,"Hello World");
        int var = 1;
        Estudiante estudiante = new Estudiante();
        estudiante.setId(1);
        estudiante.nombre = "Jhon";
        estudiante.apellido = "Doe";
        estudiante.edad = 25;
        // System.out.println(estudiante.imprimir());
        estudiante.saludar();

        Persona persona = new Persona();
        persona.setId(3);

        verIdPersona(persona);
        verIdPersona(estudiante);
    }

    static void verIdPersona(Persona persona) {
        System.out.println(persona.getId());
    }
}
