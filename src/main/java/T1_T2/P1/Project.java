package T1_T2.P1;

import java.util.ArrayList;
import java.util.Currency;

public class Project {
    private String name;
    private Currency budget;
    private ArrayList<CanJoinProject> members;
    private Lecturer leader;

    public Project(String name, Currency budget) {
        this.name = name;
        this.budget = budget;
        this.members = new ArrayList<CanJoinProject>();
    }

    public Lecturer getLeader() {
        return leader;
    }

    public void setLeader(Lecturer leader) {
        this.leader = leader;
    }

    public void displayMembers() {
        System.out.println("Leader: " + leader.toString());
        System.out.println("Members:");
        for (Object member : members) {
            System.out.println(member.toString());
        }
    }

    public void addMembers(CanJoinProject member) {
        this.members.add(member);
    }
}
