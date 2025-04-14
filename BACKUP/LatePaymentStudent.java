package T10.P1;

public class LatePaymentStudent extends StudentDecorator{
    private static final double LATE_PAYMENT_RATE = 0.1;

    public LatePaymentStudent(Student s) {
        super(s);
    }

    @Override
    public double calcFee() {
        double totalCourseAmount = student.calcFee();
        return totalCourseAmount * (1 + LATE_PAYMENT_RATE);
    }
}
