package academy.learnprogramming;

public abstract class Team implements Comparable<Team>{

    private String name;

    private int won =0;
    private int lost = 0;
    private int drew = 0;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void matchResult(int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            this.won++;
        } else if (theirScore > ourScore) {
            this.lost++;
        } else {
            this.drew++;
        }
    }

    public String performance() {
        return this.name + "\t W: " + this.won + " L: " + this.lost + " D: " + this.drew;
    }

    public int ranking() {
        return (this.won * 2) + this.drew;
    }


    @Override
    public int compareTo(Team opponent) {
        if (this.ranking() > opponent.ranking()) {
            return -1;
        } else if (this.ranking() > opponent.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }
}
