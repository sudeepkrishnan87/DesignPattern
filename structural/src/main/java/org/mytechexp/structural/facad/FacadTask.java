package org.mytechexp.structural.facad;

public class FacadTask {

    private int row_number;
    private int seat_number;
    private double amount;
    private String movieName;

    public String booking(int row_number, int seat_number, double amount, String movieName) {
       this.amount= amount;
       this.movieName=movieName;
       this.row_number=row_number;
       this.seat_number=seat_number;

        BookSeat bookSeat = new BookSeat();
        boolean isBooked = bookSeat.bookSeat(row_number, seat_number);

        if (isBooked) {
            Payment payment = new Payment();
            String paymentStatus = payment.makePayment(amount);

            PrintTicket printTicket = new PrintTicket();
            String ticket = printTicket.printTicket(movieName, row_number, seat_number);

            return paymentStatus + "\n" + ticket;
        } else {
            return "Booking failed. Seat is already booked.";
        }

    }
}
