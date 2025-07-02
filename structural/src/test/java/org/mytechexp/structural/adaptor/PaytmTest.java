package org.mytechexp.structural.adaptor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class PaytmTest {

    @Test
    void pay() {
        // Given
        Paytm paytm = new Paytm();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // When
        paytm.pay("100", "INR");

        // Then
        assertEquals("Payment of 100 INR made through Paytm.\n", outContent.toString());
        System.setOut(System.out); // Reset
    }

    @Test
    void refund() {
        // Given
        Paytm paytm = new Paytm();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // When
        paytm.refund("50", "INR");

        // Then
        assertEquals("Refund of 50 INR processed through Paytm.\n", outContent.toString());
        System.setOut(System.out); // Reset
    }

    @Test
    void getPaymentDetails() {
        // Given
        Paytm paytm = new Paytm();

        // When
        String details = paytm.getPaymentDetails();

        // Then
        assertEquals("Payment details from Paytm: [Payment Gateway: Paytm, Status: Successful]", details);
    }
}