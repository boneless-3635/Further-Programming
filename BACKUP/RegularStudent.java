package T10.P1;

import java.util.List;

public class RegularStudent extends Student{
    private double courseUnitFee;

    public RegularStudent(String id, String name, double gpa, List<String> courses, double courseUnitFee) {
        super(id, name, gpa, courses);
        this.courseUnitFee = courseUnitFee;
    }

    @Override
    public double calcFee() {
        return courses.size() * courseUnitFee;
    }
}
