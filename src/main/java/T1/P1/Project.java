package T1.P1;

import java.util.ArrayList;
import java.util.Currency;

public class Project {
    private String name;
    private Currency budget;
    private ArrayList<Lecturer> members;
    private Lecturer leader;

    public Project(String name, Currency budget) {
        this.name = name;
        this.budget = budget;
        this.members = new ArrayList<Lecturer>();
    }


    public Lecturer getLeader() {
        return leader;
    }

    public void setLeader(Lecturer leader) {
        this.leader = leader;
    }

    public void addMember(Lecturer members) {
        this.members.add(members);
    }

    public void displayMembers() {
        for (Lecturer member : members) {
            System.out.println(member);
        }
    }
}
