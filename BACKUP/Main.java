package T10.P1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<String>();
        courses.add("c1");
        courses.add("c2");
        courses.add("c3");
        courses.add("c4");
        Student regularStudent = new RegularStudent("s100", "Name", 4.0, courses, 10000);

    }
}
