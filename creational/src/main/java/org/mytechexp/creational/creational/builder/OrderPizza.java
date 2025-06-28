package org.mytechexp.creational.creational.builder;

public class OrderPizza {

    public static void main(String[] args) {
        Pizza pizza=new Pizza.PizzaBuilder().bread("wheat")
                .type("veg")
                .chilliflake(true).build();
        System.out.println("Pizza after customisation"+pizza.toString());
    }
}
