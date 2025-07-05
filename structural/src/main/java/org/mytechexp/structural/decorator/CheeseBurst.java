package org.mytechexp.structural.decorator;

public class CheeseBurst extends PizzaDecorator {

    public CheeseBurst(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheese Burst";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50.0; // Adding cost for cheese burst
    }
}
