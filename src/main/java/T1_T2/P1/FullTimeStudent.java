package T1_T2.P1;

import java.util.ArrayList;

public class FullTimeStudent extends Student implements CanJoinProject {
    private ArrayList<Project> projects;
    private String profile;

    public FullTimeStudent(String studentId, String name, String major) {
        super(studentId, name, major);
        this.projects = new ArrayList<Project>();
    }

    public void joinProject(Project p) {
        projects.add(p);
        p.addMembers(this);
    }

    @Override
    public String toString() {
        return String.format("Student ID: %s\nFull Name: %s\nMajor: %s\nFull Time Student", studentId, name, major);
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
