import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

class HelloWorld {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Hello World");
        int var = 1;
        Persona estudiante = new Persona();
        estudiante.id = 1;
        estudiante.nombre = "Jhon";
        estudiante.apellido = "Doe";
        estudiante.edad = 25;
        System.out.println(estudiante.imprimir());
    }
}
