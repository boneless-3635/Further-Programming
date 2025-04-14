package T11.P2;

public class Lecturer {
    Project projectLed;

    public Lecturer() {
        this.projectLed = null;
    }

    public synchronized void assignProject() {
        if (projectLed == null) {
            System.out.println("Assigning new project");
            projectLed = new Project();
        }
    }
}
