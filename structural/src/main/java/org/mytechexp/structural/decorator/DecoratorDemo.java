package org.mytechexp.structural.decorator;
// kind of builder design pattern variabtion
public class DecoratorDemo {
    public static void main(String[] args) {
        Pizza pizza=new PlainPizaa();
        System.out.println("Plain Pizza Cost: " + pizza.getCost()+ " | Description: " + pizza.getDescription());
        pizza=new CheeseBurst(pizza);
        System.out.println("Cheese Burst Pizza Cost: " + pizza.getCost()+ " | Description: " + pizza.getDescription());
        pizza=new OliveEnriched(pizza);
        System.out.println("Olive Enriched Pizza Cost: " + pizza.getCost()+ " | Description: " + pizza.getDescription());
    }
}
