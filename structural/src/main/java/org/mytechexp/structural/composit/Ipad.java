package org.mytechexp.structural.composit;

public class Ipad implements Item{
    @Override
    public double getPrice() {
        return 50000.50;
    }

    @Override
    public String getDescription() {
        return "I Pad";
    }
}
