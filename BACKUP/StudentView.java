package T8;

import java.util.Map;
import java.util.Scanner;

public abstract class StudentView {
    public static final String STUDENT_ID = "STUDENT_ID";
    public static final String FULL_NAME = "FULL_NAME";
    public static final String MAJOR = "MAJOR";
    public static final double GPA = 0;
    public abstract Map<String,String> newStudentForm();

    public abstract void display(Student s);
}
