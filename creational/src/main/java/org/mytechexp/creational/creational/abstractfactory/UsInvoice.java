package org.mytechexp.creational.creational.abstractfactory;

public class UsInvoice implements Invoice{

    @Override
    public void generate() {

        System.out.println("Generating US invoice");
    }
}
