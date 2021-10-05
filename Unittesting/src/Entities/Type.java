package Unittesting.src.Entities;

public class Type extends Entity {
    private String name = "";

    public Type() {
    }

    public Type(final int id) {
        super(id);
    }

    public Type(final String name) {
        this.name = name;
    }

    public Type(final int id, final String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
