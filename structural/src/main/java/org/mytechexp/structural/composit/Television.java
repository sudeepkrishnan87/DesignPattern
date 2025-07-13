package org.mytechexp.structural.composit;

public class Television implements Item{
    @Override
    public double getPrice() {
        return 100000.00;
    }

    @Override
    public String getDescription() {
        return "Sony Bravia";
    }
}
