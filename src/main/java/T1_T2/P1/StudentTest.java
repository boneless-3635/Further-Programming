package T1_T2.P1;

public class StudentTest {
    public static void main(String[] args){
        Student Student1 = new FullTimeStudent("s001", "John", "Business");
        Student1.studentId = "s3930051";
        Student1.name = "Pham Minh Hoang";
        Student1.major = "IT";

        Student Student2 = new PartTimeStudent("s002", "Jack", "CompSci", 2.5, 5.5);

        System.out.println(Student1.toString());
        System.out.println(Student2.toString());
    }
}
