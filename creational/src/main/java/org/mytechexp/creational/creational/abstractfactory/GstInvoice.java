package org.mytechexp.creational.creational.abstractfactory;

public class GstInvoice implements Invoice{

    @Override
    public void generate() {
        System.out.println("Generating GST invoice");
    }
}
