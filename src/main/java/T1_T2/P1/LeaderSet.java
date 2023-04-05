package T1_T2.P1;

import java.util.HashSet;
import java.util.Set;

public class LeaderSet {
    private static Set<Lecturer> leaderSet;

    public LeaderSet() {
        leaderSet = new HashSet<Lecturer>();
    }

    public static boolean checkLeadingStatus (Lecturer l) {
        return leaderSet.contains(l);
    }

    public static void addLeaderSet(Lecturer l) {
        leaderSet.add(l);
    }

    public static void removeLeaderSet(Lecturer l) {
        leaderSet.remove(l);
    }
}
