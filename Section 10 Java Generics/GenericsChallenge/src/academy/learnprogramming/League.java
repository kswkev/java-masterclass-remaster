package academy.learnprogramming;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>{

    private ArrayList<T> teams = new ArrayList<>();

    public void addTeam(T team) {
        teams.add(team);
    }

    public void game(int team1No, int team2No, int team1Score, int team2Score) {
        T team1 = this.teams.get(team1No);
        T team2 = this.teams.get(team2No);
        matchResult(team1, team2, team1Score, team2Score);
    }

    public void showLeagueTable() {
        Collections.sort(teams);
        for (T team : teams) {
            System.out.println("Name: " + team.getName() + "\t Score: " + team.ranking());
        }
    }

    private void matchResult(T team1, T team2, int team1Score, int team2Score) {
        team1.matchResult(team1Score, team2Score);
        team2.matchResult(team2Score, team1Score);
    }
}
