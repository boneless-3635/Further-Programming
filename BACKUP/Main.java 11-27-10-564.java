package T11.P2;

public class Main {
    public static void main (String[] args) {
        Lecturer l1 = new Lecturer();
        ProjectThread t1 = new ProjectThread(l1);
        ProjectThread t2 = new ProjectThread(l1);
        t1.start();
        t2.start();
    }
}
