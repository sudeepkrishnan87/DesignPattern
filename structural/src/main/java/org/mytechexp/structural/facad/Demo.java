package org.mytechexp.structural.facad;

public class Demo {
    public static void main(String[] args) {
        // Create a Facade instance
        FacadTask movieTicketFacade = new FacadTask();

        // Use the Facade to book a movie ticket
        String result = movieTicketFacade.booking(5, 14, 500.00, "Inception");

        // Print the result
        System.out.println(result);
    }
}
