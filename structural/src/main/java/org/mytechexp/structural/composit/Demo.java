package org.mytechexp.structural.composit;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        ProductBundle appleKit=new ProductBundle("AppleProduct");
        appleKit.addItem(new Product(200000.76,"Mac Book Pro"));
        appleKit.addItem(new Product(20000.76,"Ipad mini"));

        Product television= new Product(120000.00,"Sony Bravia");

        ProductBundle schoolKit=new ProductBundle("School Kit");

        Product pen=new Product(10,"pen");
        Product bag=new Product(1500,"School bag");
        schoolKit.addItem(pen);
        schoolKit.addItem(bag);
        List<Item> cartItems=new ArrayList<>();
        cartItems.add(television);
        cartItems.add(appleKit);
        cartItems.add(schoolKit);

        double totalPrice=0;
        for(Item item: cartItems)
        {
           totalPrice+=item.getPrice();
           System.out.println(item.getDescription());

        }

        System.out.println("Total price is:"+totalPrice);


    }
}
