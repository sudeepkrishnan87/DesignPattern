package org.mytechexp.creational.creational.abstractfactory;

public class Main {

    public static void main(String[] args) {
        PaymentService paymentService=new PaymentService(new IndainFactory(PaymentType.GAPY),new GstInvoice(),10.00);
        paymentService.processCheckout();

        PaymentService paymentService1=new PaymentService(new UsFactory(PaymentType.PAYPAL),new UsInvoice(),10.00);
        paymentService1.processCheckout();
    }
}
