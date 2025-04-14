package T10.P2;

public abstract class Hero implements Attackable {
    protected String name;
    protected int strength;

    public Hero(String name, int strength) {
        this.name = name;
        this.strength = strength;
    }
}
