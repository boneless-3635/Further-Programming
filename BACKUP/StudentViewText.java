package T8;

import java.util.Map;
import java.util.Scanner;

public class StudentViewText extends StudentView {

    @Override
    public Map<String, String> newStudentForm() {
        DataInput d = DataInput.getDataInput();
        System.out.println("Enter ID");
        String id = DataInput.getDataInput().getScanner().nextLine();
        System.out.println("Enter Name");
        String name = DataInput.getDataInput().getScanner().nextLine();
        System.out.println("Enter major");
        String major = DataInput.getDataInput().getScanner().nextLine();
        System.out.println("Enter GPA");
        double gpa = 0;
        return null;
    }

    @Override
    public void display(Student s) {
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Major: " + s.getMajor());
        System.out.println("GPA: " + s.getGpa());
    }

//    Scanner formInput = new Scanner(System.in);
//        System.out.println("Enter ID");
//    String id = formInput.nextLine();
//        System.out.println("Enter Name");
//    String name = formInput.nextLine();
//        System.out.println("Enter Major");
//    String major = formInput.nextLine();
//        System.out.println("Enter GPA");
//    double gpa = Double.parseDouble(formInput.nextLine());
//
//    Student stu = new Student(id, name, major, gpa);



}
