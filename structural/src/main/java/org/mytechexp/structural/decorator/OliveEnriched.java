package org.mytechexp.structural.decorator;

public class OliveEnriched extends PizzaDecorator{
    public OliveEnriched(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olive Enriched";
    }
    @Override
    public double getCost() {
        return pizza.getCost() + 1.50; // Adding cost for olive enrichment
    }
}
