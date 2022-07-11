package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

       footballLeague();
        americanFootballLeague();

    }

    private static void footballLeague() {
//        Team<FootballPlayer> hearts = new Team<>("Heats");
//        hearts.addPlayer(new FootballPlayer("John", 15));
//        hearts.addPlayer(new FootballPlayer("Steve", 2));
//        hearts.addPlayer(new FootballPlayer("Eric", 5));
//        hearts.addPlayer(new FootballPlayer("Bob", 23));
//
//        System.out.println(hearts);

        Team<FootballPlayer> hearts = new Team<>("Heats");
        Team<FootballPlayer> celtic = new Team<>("Celtic");
        Team<FootballPlayer> hibs = new Team<>("Hibs");
        Team<FootballPlayer> rangers = new Team<>("Rangers");

        hearts.matchResult(celtic, 1, 3);
        hearts.matchResult(hibs, 2, 1);
        hearts.matchResult(rangers, 1, 1);

        celtic.matchResult(hibs, 2, 0);
        celtic.matchResult(rangers, 0, 0);

        rangers.matchResult(hibs, 2, 0);

        System.out.println("");

        ArrayList<Team<FootballPlayer>> footballLeague = new ArrayList<>();
        footballLeague.add(hearts);
        footballLeague.add(celtic);
        footballLeague.add(hibs);
        footballLeague.add(rangers);
        Collections.sort(footballLeague);

        for (Team team : footballLeague) {
            System.out.println(team.performance());
        }
    }

    private static void americanFootballLeague() {

        Team<AmericanFootballPlayer> packers = new Team<>("Green Bay Packers");
        Team<AmericanFootballPlayer> raiders = new Team<>("Las Vegas Raiders");
        Team<AmericanFootballPlayer> patriots = new Team<>("New England Patriots");
        Team<AmericanFootballPlayer> bears = new Team<>("Chicago Bears");

        packers.matchResult(raiders, 27, 12);
        packers.matchResult(patriots, 14, 23);
        packers.matchResult(bears, 6, 14);

        raiders.matchResult(patriots, 22, 22);
        raiders.matchResult(bears, 10, 18);

        bears.matchResult(patriots, 28, 26);

        System.out.println("");

        ArrayList<Team<AmericanFootballPlayer>> footballLeague = new ArrayList<>();
        footballLeague.add(packers);
        footballLeague.add(raiders);
        footballLeague.add(patriots);
        footballLeague.add(bears);
        Collections.sort(footballLeague);

        for (Team team : footballLeague) {
            System.out.println(team.performance());
        }
    }
}
