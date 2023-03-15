package T1_T2.P1;

public class Lecturer {
    private String employeeId;
    private String name;
    private String rank;
    private Project projectLed;

    public boolean leadProject(Project p) {
        if ((projectLed == null) && (p.getLeader() == null)) {
            projectLed = p;
            p.setLeader(this);
            return true;
        }
        return false;
    }

    public void joinProject(Project p) {
        p.addMembers(this);
    }

    public String toString() {
        return String.format("Name: %s\nRank: %s", name, rank);
    }
}
