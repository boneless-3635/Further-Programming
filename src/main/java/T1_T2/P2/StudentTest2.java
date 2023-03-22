package T1_T2.P2;

import T1_T2.P1.FullTimeStudent;

public class StudentTest2 {
    public static void main(String[] args){
        var Student1 = new FullTimeStudent("s001", "John", "Business");
        Student1.studentId = "s3930051";
        Student1.name = "Pham Minh Hoang";
        Student1.major = "IT";

        System.out.printf("ID: %s\nName: %s\nMajor: %s", Student1.studentId, Student1.name, Student1.major);
    }
}
