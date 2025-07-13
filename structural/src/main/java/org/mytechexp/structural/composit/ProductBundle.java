package org.mytechexp.structural.composit;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements Item{
    List<Item> productLists=new ArrayList<>();
    String bundleName;
    public ProductBundle(String bundleName)
    {
        this.bundleName=bundleName;
    }
   public void addItem(Item item)
   {
       productLists.add(item);
   }

    @Override
    public double getPrice() {
        double totalPrice=0.0;
        for(Item item: productLists)
        {
            totalPrice+= item.getPrice();
        }
        return  totalPrice;
    }

    @Override
    public String getDescription() {
        StringBuilder description=new StringBuilder();
        for(Item item: productLists)
        {
            description.append(item.getDescription()+"\n");
        }
        return description.toString();
    }
}
