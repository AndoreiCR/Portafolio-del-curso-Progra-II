package Unittesting.src.Entities;

public class Course extends Entity{
    private String name;
    private Teacher teacher;
    private double grade;

    public Course(){

    }

    public Course(final int id){
        super(id);
    }

    public Course(final String name){
        this.name = name;
    }

    public Course(final String name, final int id){
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(final String value) {
        this.name = value;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(final Teacher value) {
        this.teacher = value;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(final double value) {
        this.grade = value;
    }

    
}
