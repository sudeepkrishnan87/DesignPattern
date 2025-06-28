package org.mytechexp.creational.creational.builder;

public class Pizza {
    private String bread;
    private String type;
    private boolean jalpeno;

    @Override
    public String toString() {
        return "Pizza{" +
                "bread='" + bread + '\'' +
                ", type='" + type + '\'' +
                ", jalpeno=" + jalpeno +
                ", chilliflake=" + chilliflake +
                ", quantity=" + quantity +
                '}';
    }

    private boolean chilliflake;
    private int quantity;

    private Pizza(PizzaBuilder builder) {
        this.bread = builder.bread;
        this.type = builder.type;
        this.jalpeno = builder.jalpeno;
        this.chilliflake = builder.chilliflake;
        this.quantity = builder.quantity;
    }

    public String getBread() { return bread; }
    public String getType() { return type; }
    public boolean hasJalpeno() { return jalpeno; }
    public boolean hasChilliflake() { return chilliflake; }
    public int getQuantity() { return quantity; }

    public static class PizzaBuilder{
        private String bread;
        private String type;
        private boolean jalpeno;
        private boolean chilliflake;
        private int quantity;

        public PizzaBuilder bread(String bread) {
            this.bread = bread;
            return this;
        }
        public PizzaBuilder type(String type) {
            this.type = type;
            return this;
        }
        public PizzaBuilder jalpeno(boolean jalpeno) {
            this.jalpeno = jalpeno;
            return this;
        }
        public PizzaBuilder chilliflake(boolean chilliflake) {
            this.chilliflake = chilliflake;
            return this;
        }
        public PizzaBuilder quantity(int quantity) {
            this.quantity = quantity;
            return this;
        }
        public Pizza build() {
            return new Pizza(this);
        }
    }
}
