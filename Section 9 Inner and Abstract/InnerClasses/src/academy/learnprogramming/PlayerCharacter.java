package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class PlayerCharacter {

    private String name;
    private int hitpoints;
    private Weapon equipedWeapon;
    private Equipment helmet;
    private List<Magic> spells;

    public PlayerCharacter(String name, int hitpoints) {
        this.name = name;
        this.hitpoints = hitpoints;
        spells = new ArrayList<Magic>();
    }

    public void addSpell(Magic spell) {
        this.spells.add(spell);
    }

    public void attack() {
        System.out.println(this.name + " swings his " + this.equipedWeapon.getWeaponName() + " and does " + this.equipedWeapon.getDamage() + " points of damage");
    }

    public void takeDamage(int damage) {
        int actualDamage = damage - helmet.getArmorValue();
        System.out.println(this.name + " is attacked for " + damage + " points of damage but his " + helmet.getItemName() + " blocks " + helmet.getArmorValue() + " of that.");
    }

    public void setEquipedWeapon(Weapon equipedWeapon) {
        this.equipedWeapon = equipedWeapon;
    }

    public void equipHelmet(String itemName, int armorValue) {
        this.helmet = new Equipment(itemName, armorValue);
    }

    public List<Magic> getSpells() {
        return spells;
    }

    public class Weapon {
        private String weaponName;
        private int damage;

        public Weapon(String weaponName, int damage) {
            this.weaponName = weaponName;
            this.damage = damage;
        }

        public String getWeaponName() {
            return weaponName;
        }

        public int getDamage() {
            return damage;
        }
    }

    private class Equipment {
        private String itemName;
        private int armorValue;

        public Equipment(String itemName, int armorValue) {
            this.itemName = itemName;
            this.armorValue = armorValue;
        }

        public String getItemName() {
            return itemName;
        }

        public int getArmorValue() {
            return armorValue;
        }
    }

    public interface Magic {
        public void cast();
    }
}
