package org.mytechexp.creational.creational.factory;

import lombok.extern.java.Log;

public class Road implements Logistics {
    @Override
    public void send() {
        System.out.println("send via road");
    }
}
