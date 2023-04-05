package T5.P3;

public abstract class Student {
    private String id;
    private String name;
    private String major;
    private double gpa;

    public Student(String id, String name, String major, double gpa) {
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }
}
