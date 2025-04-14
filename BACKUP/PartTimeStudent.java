package T5.P3;

public class PartTimeStudent extends Student{
    public PartTimeStudent(String id, String name, String major, double gpa) {
        super(id, name, major, gpa);
    }

    public String toString() {
        return String.format("%s-%s-%s-Part Time Student-%.2f", super.getId(), super.getName(), super.getMajor(), super.getGpa());
    }
}
