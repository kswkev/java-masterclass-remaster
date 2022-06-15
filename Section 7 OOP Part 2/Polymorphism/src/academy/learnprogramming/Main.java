package academy.learnprogramming;

class Movie {

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens try to take over planet Earth";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "The fight against an evil space empire";
    }
}

class JurassicPark extends Movie {
    public JurassicPark() {
        super("JurassicPark");
    }

    @Override
    public String plot() {
        return "Dinos eat some people";
    }
}

class Terminator2 extends Movie {
    public Terminator2() {
        super("Terminator2");
    }

    @Override
    public String plot() {
        return "Arnie kicks some butt";
    }
}

public class Main {

    public static void main(String[] args) {

        for (int i=1; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " Movie name: " + movie.getName() + " has the plot: " + movie.plot());
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new IndependenceDay();
            case 2:
                return new Jaws();
            case 3:
                return new JurassicPark();
            case 4:
                return new StarWars();
            case 5:
                return new Terminator2();
            default:
                return new Movie("fake movie");
        }
    }
}
