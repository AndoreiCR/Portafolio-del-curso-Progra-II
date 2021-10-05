package Unittesting.src.Entities;

public class Teacher extends Person {
    private int rate = 0;

    public Teacher() {
        this.setType(new Type(this.getClass().toString()));
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    
}
