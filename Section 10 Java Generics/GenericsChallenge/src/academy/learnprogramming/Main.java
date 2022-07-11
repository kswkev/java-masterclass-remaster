package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        League<BaseballTeam> baseballTeamLeague = new League<>();

        baseballTeamLeague.addTeam(new BaseballTeam("NY Mets"));
        baseballTeamLeague.addTeam(new BaseballTeam("Dodgers"));
        baseballTeamLeague.addTeam(new BaseballTeam("Red Sox"));
        baseballTeamLeague.addTeam(new BaseballTeam("NY Yankies"));

        baseballTeamLeague.game(0, 1, 15, 23);
        baseballTeamLeague.game(0, 2, 12, 8);
        baseballTeamLeague.game(0, 3, 5, 5);
        baseballTeamLeague.game(1, 2, 27, 23);
        baseballTeamLeague.game(1, 3, 20, 20);
        baseballTeamLeague.game(2, 3, 23, 28);

        baseballTeamLeague.showLeagueTable();
    }
}
