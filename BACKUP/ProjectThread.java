package T11.P2;

public class ProjectThread extends Thread {
    private Lecturer lecturer;

    public ProjectThread(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public void run() {
//        synchronized (lecturer) {
//            if (lecturer.projectLed == null) {
//                System.out.println("Lecturer has no project led, new project is assigned");
//                lecturer.projectLed = new Project();
//            }
//        }
        lecturer.assignProject();
    }
}
