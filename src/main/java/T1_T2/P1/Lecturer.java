package T1_T2.P1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Lecturer implements CanJoinProject{
    private String employeeId;
    private String name;
    private String rank;
    private Project projectLed;
    private ArrayList<Project> projects;
    private String profile;


    public Lecturer(String employeeId, String name, String rank, Project projectLed, String profile) {
        this.employeeId = employeeId;
        this.name = name;
        this.rank = rank;
        this.projectLed = projectLed;
        this.profile = profile;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lecturer)) return false;
        Lecturer lecturer = (Lecturer) o;
        return this.employeeId.equals(lecturer.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.employeeId);
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
