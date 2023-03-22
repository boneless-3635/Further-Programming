package T1_T2.P1;

public class PartTimeStudent extends Student{
    private double minHours;
    private double maxHours;
    private static int studentPTCount = 0;

    public PartTimeStudent(String studentId, String name, String major, double minHours, double maxHours) {
        super(studentId, name, major);
        this.minHours = minHours;
        this.maxHours = maxHours;
        studentPTCount += 1;
    }

    @Override
    public String toString() {
        return String.format("Student ID: %s\nFull Name: %s\nMajor: %s\nPart Time Student\nMinimum Hours: %.2f\nMaximum Hours: %.2f",
                studentId, name, major, minHours, maxHours);
    }

    public static int count() {
        return studentPTCount;
    }
}
