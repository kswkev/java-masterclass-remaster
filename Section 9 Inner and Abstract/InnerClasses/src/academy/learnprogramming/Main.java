package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        PlayerCharacter thorn = new PlayerCharacter("Thron", 50);
        thorn.setEquipedWeapon(thorn.new Weapon("Sword", 10));
        thorn.attack();

        thorn.equipHelmet("Iron Helm", 10);
        thorn.takeDamage(30);

        class FireBall implements PlayerCharacter.Magic {

            @Override
            public void cast() {
                System.out.println("A fireball bursts against the moster setting it alight");
            }
        }

        thorn.addSpell(new FireBall());
        thorn.getSpells().get(0).cast();

        thorn.addSpell(new PlayerCharacter.Magic() {
            @Override
            public void cast() {
                System.out.println("Ice shards fall from the sky freezing in place all those around the area");
            }
        });

        thorn.getSpells().get(1).cast();

    }
}
