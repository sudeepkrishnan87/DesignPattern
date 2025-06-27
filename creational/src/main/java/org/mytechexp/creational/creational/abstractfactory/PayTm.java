package org.mytechexp.creational.creational.abstractfactory;

public class PayTm implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying using paytm"+amount);
    }
}
