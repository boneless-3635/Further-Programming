package T5.P3;

public class FullTimeStudent extends Student {
    public FullTimeStudent(String id, String name, String major, double gpa) {
        super(id, name, major, gpa);
    }

    public String toString() {
        return String.format("%s-%s-%s-Full Time Student-%.2f", super.getId(), super.getName(), super.getMajor(), super.getGpa());
    }
}
