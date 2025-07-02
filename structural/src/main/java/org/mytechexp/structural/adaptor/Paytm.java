package org.mytechexp.structural.adaptor;

public class Paytm implements  Payment{
    @Override
    public void pay(String amount, String currency) {
        System.out.println("Payment of " + amount + " " + currency + " made through Paytm.");
    }

    @Override
    public void refund(String amount, String currency) {
        System.out.println("Refund of " + amount + " " + currency + " processed through Paytm.");
    }

    @Override
    public String getPaymentDetails() {
        return "Payment details from Paytm: [Payment Gateway: Paytm, Status: Successful]";
    }
}
