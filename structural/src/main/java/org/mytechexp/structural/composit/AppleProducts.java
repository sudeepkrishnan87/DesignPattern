package org.mytechexp.structural.composit;

import java.util.List;

public class AppleProducts implements Item{
    List<AppleProducts> appleProductsList;

    @Override
    public double getPrice() {
        double totalPrice=0.0;
        for(Item item: appleProductsList)
        {
            totalPrice+= item.getPrice();
        }
        return  totalPrice;
    }

    @Override
    public String getDescription() {
        return "Applie Items";
    }
}
