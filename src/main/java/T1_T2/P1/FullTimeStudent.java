package T1_T2.P1;

import java.util.ArrayList;

public class FullTimeStudent extends Student {
    private ArrayList<Project> projects;

    public FullTimeStudent(String studentId, String name, String major) {
        super(studentId, name, major);
        this.projects = new ArrayList<Project>();
    }

    public void joinProject(Project p) {
        projects.add(p);
        p.addMembers(this);
    }
}
