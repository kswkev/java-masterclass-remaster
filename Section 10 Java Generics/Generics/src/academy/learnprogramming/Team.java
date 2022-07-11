package academy.learnprogramming;

import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team<T>> {

    private String name;
    private ArrayList<T> players;

    private int won =0;
    private int lost = 0;
    private int drew = 0;

    public Team(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPlayer(T player) {
        if (!players.contains(player)) {
            players.add(player);
        }
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message = "";
        if (ourScore > theirScore) {
            if (null != opponent) {
                message = this.name + " " + ourScore + " - " + theirScore + " " + opponent.getName();
            }
            this.won++;
        } else if (theirScore > ourScore) {
            if (null != opponent) {
                message = opponent.getName() + " " + theirScore + " - " + ourScore + " " + this.name;
            }
            this.lost++;
        } else {
            if (null != opponent) {
                message = this.name + " " + ourScore + " - " + theirScore + " " + opponent.getName();
            }
            this.drew++;
        }

        if (null != opponent) {
            System.out.println(message);
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public String performance() {
        return this.name + "\t W: " + this.won + " L: " + this.lost + " D: " + this.drew;
    }

    public int ranking() {
        return (this.won * 2) + this.drew;
    }

    @Override
    public String toString() {
        String string = "Team: " + this.name + "\n";
        string += "Players: \n";
        for (Player player : players) {
            string += player + "\n";
        }
        return string;
    }

    @Override
    public int compareTo(Team<T> opponent) {
        if (this.ranking() > opponent.ranking()) {
            return -1;
        } else if (this.ranking() > opponent.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
