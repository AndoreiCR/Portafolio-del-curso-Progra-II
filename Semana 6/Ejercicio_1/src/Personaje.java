package Ejercicio_1.src;

public class Personaje{
    private String nombre;
    private Armadura armadura = new Armadura();

    public void personaje (short puntoVida,short puntoMagia,short puntoAgilidad,short puntVida){
        
    }

    public void personaje (short puntosVida,short puntosMagia,short puntosAgilidad,short puntoVida,String nombre){
        
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
