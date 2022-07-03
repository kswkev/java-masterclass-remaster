package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {
        List<String> items = new ArrayList<>();
        items.add(this.name);
        items.add(Integer.toString(this.hitPoints));
        items.add(Integer.toString(this.strength));
        items.add(this.weapon);
        return items;
    }

    @Override
    public void read(List<String> items) {
        List<String> readItems = new ArrayList<>();
        if (null != items && !items.isEmpty()) {
            readItems = items;
        }
    }

    @Override
    public String toString() {
        return "Player{name='" + this.name + "', hitPoints=" + this.hitPoints + ", strength=" + this.strength + ", weapon='" + this.weapon + "'}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
