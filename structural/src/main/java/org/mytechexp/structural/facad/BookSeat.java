package org.mytechexp.structural.facad;

public class BookSeat {
    int row_number;
    boolean isBooked;
    int seat_number;

    public boolean bookSeat(int row_number, int seat_number) {
        this.row_number = row_number;
        this.seat_number = seat_number;
        if (!isBooked) {
            isBooked = true;
            System.out.println("Seat " + seat_number + " in row " + row_number + " has been booked.");
            return true;
        } else {
            System.out.println("Seat " + seat_number + " in row " + row_number + " is already booked.");
            return false;
        }
    }
}
