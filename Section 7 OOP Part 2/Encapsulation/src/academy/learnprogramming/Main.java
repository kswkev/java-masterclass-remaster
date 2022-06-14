package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player();
        player1.name = "Kev";
        player1.health = 20;
        player1.weapon = "Sword";

        int damage = 10;
        player1.loseHealth(damage);
        System.out.println("Reaming health = " + player1.healthRemaining());

        damage = 11;
        //probably shouldn't be able to do this
        player1.health = 200;
        player1.loseHealth(damage);
        System.out.println("Reaming health = " + player1.healthRemaining());

        //now with encapsulation
        EnhancedPlayer player2 = new EnhancedPlayer("kevin", 20, "gun");
        damage = 10;
        player2.loseHealth(damage);
        System.out.println("Reaming health = " + player2.healthRemaining());

        damage = 11;
        //can't cheat anymore
//        player2.health = 200;
        player2.loseHealth(damage);
        System.out.println("Reaming health = " + player2.healthRemaining());

    }
}
