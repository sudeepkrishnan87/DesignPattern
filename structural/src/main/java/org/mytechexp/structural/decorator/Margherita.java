package org.mytechexp.structural.decorator;

public class Margherita implements Pizza{
    @Override
    public String getDescription() {
        return "Margherita Pizza";
    }

    @Override
    public double getCost() {
        return 150.00;
    }
}
