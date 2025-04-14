package T10.P1;

public abstract class StudentDecorator extends Student {
    protected Student student;

    public StudentDecorator(Student s) {
        super(s.id, s.name, s.gpa, s.courses);
        this.student = s;
    }
}
