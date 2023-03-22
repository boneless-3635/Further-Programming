package T1_T2.P1;

/**
 * @author hoangpham
 * @version 1.0
 */

public abstract class Student {
    /**
     * Student attributes
     */
    public String studentId;
    public String name;
    public String major;

    public Student(String studentId, String name, String major) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
    }

    @Override
    public abstract String toString();
    @Override
    public boolean equals(Object s) {
        if (s == this) {
            return true;
        }

        if (!(s instanceof Student)) {
            return false;
        }

        Student otherStudent = (Student) s;
        return this.studentId.equals(otherStudent.studentId);
    }
}
