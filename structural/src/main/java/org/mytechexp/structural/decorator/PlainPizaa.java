package org.mytechexp.structural.decorator;

public class PlainPizaa implements Pizza {

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getCost() {
        return 100.00; // Base cost of plain pizza
    }

}
