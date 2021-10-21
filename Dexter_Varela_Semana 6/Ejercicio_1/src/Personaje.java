public class Personaje extends Vitalidad {

    private String nombre;
    private Armadura armadura;

    public Personaje(short valor1, short valor2, short valor3, short valor4) {
        super(valor1, valor2, valor3, valor4);
        // TODO Auto-generated constructor stub
    }

    public void personaje(short puntoVida, short puntoMagia, short puntoAgilidad, short puntVida) {

    }

    public void personaje(short puntosVida, short puntosMagia, short puntosAgilidad, short puntoVida, String nombre) {

    }

    public String getNombre() {
        return nombre;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

}
