package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Aladin", 12, 8);
        theatre.listSeats();

        theatre.reserveSeat("A05");
        theatre.reserveSeat("A05");
        theatre.reserveSeat("X17");

        theatre.cancelReservation("A05");
        theatre.cancelReservation("A05");
        theatre.cancelReservation("X17");
    }
}
