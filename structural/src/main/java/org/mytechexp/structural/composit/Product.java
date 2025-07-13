package org.mytechexp.structural.composit;

class Product implements Item{
    private double price;
    private String description;
    @Override
    public double getPrice() {
        return price;
    }
    public Product(double price,String description){
        this.description=description;
        this.price=price;
}
    @Override
    public String getDescription() {
        return description;
    }
}
