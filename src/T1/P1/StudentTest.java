package T1.P1;

public class StudentTest {
    public static void main(String[] args){
        var Student1 = new Student();
        Student1.studentId = "s3930051";
        Student1.name = "Pham Minh Hoang";
        Student1.major = "IT";

        System.out.printf("ID: %s\nName: %s\nMajor: %s", Student1.studentId, Student1.name, Student1.major);
    }
}
