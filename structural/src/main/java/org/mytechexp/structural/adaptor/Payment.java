package org.mytechexp.structural.adaptor;

public interface Payment {

    void pay(String amount, String currency);

    void refund(String amount, String currency);

    String getPaymentDetails();
}
