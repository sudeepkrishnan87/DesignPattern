package org.mytechexp.structural.composit;

public class MacBook implements Item{
    @Override
    public double getPrice() {
        return 250000.00;
    }

    @Override
    public String getDescription() {
        return "MacBook Pro";
    }

}
