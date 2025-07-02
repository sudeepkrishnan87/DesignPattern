package org.mytechexp.structural.adaptor;

public class PaypalAdaptor implements Payment{
    Paypal paypal=new Paypal();
    @Override
    public void pay(String amount, String currency) {
        paypal.makePayment(amount, currency);
    }

    @Override
    public void refund(String amount, String currency) {
        paypal.processRefund(amount, currency);;
    }

    @Override
    public String getPaymentDetails() {
        String details = paypal.getTransactionDetails();
        return details;
    }
}
