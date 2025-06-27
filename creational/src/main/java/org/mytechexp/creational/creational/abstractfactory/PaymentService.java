package org.mytechexp.creational.creational.abstractfactory;

public class PaymentService {

    private Invoice invoice;
    private GlobalFactory globalFactory;
    private double amount;


    public PaymentService(GlobalFactory globalFactory,Invoice invoice,double amount){
        this.globalFactory=globalFactory;
        this.invoice=invoice;
        this.amount=amount;
    }
    public void processCheckout(){
        globalFactory.setPayment(amount);
        invoice.generate();
    }
}
