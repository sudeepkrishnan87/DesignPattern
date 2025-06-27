package org.mytechexp.creational.creational.abstractfactory;

public class PayPal implements Payment{
    @Override
    public void pay(double amout) {
        System.out.println("Paying using paypal"+amout);
    }
}
