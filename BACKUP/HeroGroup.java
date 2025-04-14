package T10.P2;

import java.util.ArrayList;
import java.util.List;

public class HeroGroup implements Attackable {
    protected List<Attackable> hero;

    public HeroGroup() {
        this.hero = new ArrayList<>();
    }

    @Override
    public double distanceAttack() {
        double sum = 0;
        for (Attackable attackable : hero) {
            sum += attackable.distanceAttack();
        }
        return sum;
    }

    @Override
    public double closeCombat() {
        double sum = 0;
        for (Attackable attackable : hero) {
            sum += attackable.closeCombat();
        }
        return sum;
    }
}
