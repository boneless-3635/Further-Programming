package T10.P1;

public class OutstandingStudent extends StudentDecorator{
    private static final double FEE_DISCOUNT = 1000;

    public OutstandingStudent(Student s) {
        super(s);
    }

    @Override
    public double calcFee() {
        double totalCourseAmount = student.calcFee();
        return totalCourseAmount - FEE_DISCOUNT;
    }
}
