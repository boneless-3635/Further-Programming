package T1_T2.P1;

public class StudentGroup{
    private final int MAX_MEMBERS;
    private int studentCount;
    private Student[] StudentGroup;

    public StudentGroup() {
        MAX_MEMBERS = 10;
        this.studentCount = 0;
        StudentGroup = new Student[MAX_MEMBERS];
    }

    public void addStudent(Student s) {
        StudentGroup[studentCount] = s;
        studentCount += 1;
    }

    public void displayAll() {
        for (int i = 0; i <= studentCount; i++) {
            System.out.println(StudentGroup[i].toString());
        }
    }

    @Override
    public String toString() {
        return null;
    }
}
