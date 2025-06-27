package org.mytechexp.creational.creational.abstractfactory;

public class Stripe implements Payment{
    @Override
    public void pay(double amout) {
        System.out.println("Paying using stripe"+amout);
    }
}
