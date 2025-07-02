package org.mytechexp.structural.adaptor;

public class Paypal {

    public void makePayment(String amount, String currency) {
        System.out.println("Payment of " + amount + " " + currency + " made through PayPal.");
    }

    public void processRefund(String amount, String currency) {
        System.out.println("Refund of " + amount + " " + currency + " processed through PayPal.");
    }

    public String getTransactionDetails() {
        return "Transaction details from PayPal: [Payment Gateway: PayPal, Status: Successful]";
    }
}
