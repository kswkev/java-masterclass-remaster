package academy.learnprogramming;

import java.util.ArrayList;
import java.util.List;

public class Theatre {

    private static final char FIRST_ROW_ID = 'A';

    private final String name;
    private List<Seat> seats = new ArrayList<Seat>();

    public Theatre(String name, int numOfRows, int seatsPerRow) {
        this.name = name;

        int lastRow = FIRST_ROW_ID + numOfRows-1;
        for (char row = FIRST_ROW_ID; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void listSeats() {
        for (Seat seat : seats) {
            System.out.println(seat.getSeatNumber());
        }
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat: seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if (null == requestedSeat) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        } else {
            return requestedSeat.reserve();
        }
    }

    public boolean cancelReservation(String seatNumber) {
        Seat requestedSeat = null;
        for (Seat seat: seats) {
            if (seat.getSeatNumber().equals(seatNumber)) {
                requestedSeat = seat;
                break;
            }
        }

        if (null == requestedSeat) {
            System.out.println("There is no seat " + seatNumber);
            return false;
        } else {
            return requestedSeat.cancel();
        }
    }

    private class Seat {

        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + seatNumber + " reserved");
                return true;
            } else {
                System.out.println("Seat " + seatNumber + " has already been reserved");
                return false;
            }
        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Seat " + seatNumber + " reservation cancelled");
                return true;
            } else {
                System.out.println("Seat " + seatNumber + " hasn't been reserved");
                return false;
            }
        }
    }
}
