import T1_T2.P1.FullTimeStudent;
import T1_T2.P1.PartTimeStudent;
import T1_T2.P1.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitTest {
    @Test
    public void testSameStudent() {
        Student s1 = new FullTimeStudent("s001", "John", "Business");
        Student s2 = new FullTimeStudent("s00", "John", "Business");
        s2.studentId = s2.studentId + "1";
        assertEquals(s1, s2);
    }

    @Test
    public void testPartTimeStudentCount() {
        Object s3 = new PartTimeStudent("s002", "Jack", "CompSci", 2.5, 5.5);
        Object s4 = new PartTimeStudent("s003", "Bob", "Economics", 6.5, 8.5);
        assertEquals(2, PartTimeStudent.count());
    }
}
