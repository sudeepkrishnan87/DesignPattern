package org.mytechexp.structural.adaptor;

public class PaymentDemo {
    public static void main(String[] args) {
        Payment pay=new Paytm();
        pay.pay("10","INR");
        pay.refund("5","INR");
        System.out.println("Payment Details after refund"+pay.getPaymentDetails());

        Payment payment = new PaypalAdaptor();
        payment.pay("100", "USD");
        System.out.println("Payment Details: " + payment.getPaymentDetails());
        payment.refund("50", "USD");


        System.out.println("Payment Details after refund: " + payment.getPaymentDetails());
    }
}
