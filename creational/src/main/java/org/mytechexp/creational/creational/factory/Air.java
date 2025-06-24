package org.mytechexp.creational.creational.factory;

public class Air implements Logistics{
    @Override
    public void send() {
        System.out.println("Send via air");
    }
}
