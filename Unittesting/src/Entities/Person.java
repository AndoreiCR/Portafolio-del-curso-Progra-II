package Unittesting.src.Entities;

public class Person extends Entity {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private char gender;
    private int age;
    private Type type;

    public Person() {
    }

    public Person(final Type type) {
        this.type = type;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String value) {
        this.firstName = value;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String value) {
        this.lastName = value;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(final String value) {
        this.phoneNumber = value;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String value) {
        this.email = value;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(final char value) {
        this.gender = value;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int value) {
        this.age = value;
    }

    public Type getType() {
        return type;
    }

    public void setType(final Type value) {
        this.type = value;
    }

}
