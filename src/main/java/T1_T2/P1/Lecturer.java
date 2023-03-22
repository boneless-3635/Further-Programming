package T1_T2.P1;

public class Lecturer implements CanJoinProject{
    private String employeeId;
    private String name;
    private String rank;
    private Project projectLed;
    private String profile;

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

    @Override
    public void setProfile(String profile) {
        this.profile = profile;
    }

    @Override
    public String getProfile() {
        return this.profile;
    }
}
