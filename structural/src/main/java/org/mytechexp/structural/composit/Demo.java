package org.mytechexp.structural.composit;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Item> bulkItem=new ArrayList<>();
        bulkItem.add(new MacBook());
        bulkItem.add(new Ipad());

        Item tv=new Television();
        bulkItem.add(tv);
        double totalPrice=0;
        StringBuilder description=new StringBuilder();
        for(Item item: bulkItem)
        {
           totalPrice+=item.getPrice();
            description.append(item.getDescription()+"\n");

        }

        System.out.println("Total price is:"+totalPrice);
        System.out.println("Product Summary \n"+description);


    }
}
