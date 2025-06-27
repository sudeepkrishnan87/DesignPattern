package org.mytechexp.creational.creational.abstractfactory;

public class Gpay implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paying using google pay" +amount);
    }
}
