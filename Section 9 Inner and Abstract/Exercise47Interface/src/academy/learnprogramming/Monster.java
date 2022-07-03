package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> items = new ArrayList<>();
        items.add(this.name);
        items.add(Integer.toString(this.hitPoints));
        items.add(Integer.toString(this.strength));
        return items;
    }

    @Override
    public void read(List<String> items) {
        if (null != items && !items.isEmpty()) {
            this.name = items.get(0);
            this.hitPoints = Integer.parseInt(items.get(1));
            this.strength = Integer.parseInt(items.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{name='" + this.name + "', hitPoints=" + this.hitPoints + ", strength=" + this.strength + "}";
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

}
