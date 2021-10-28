package Entities;

import javax.swing.JOptionPane;

public class puntuacion {

    public int score;

    public void iniciar() {
        setScore(score);
    }

    public void mostrar() {
        JOptionPane.showMessageDialog(null,"Su puntuaje es de: " + getScore());
    }

    public void incrementar() {
        setScore(getScore() + 1);
    }

    public void reducir() {
        setScore(getScore() - 1);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
