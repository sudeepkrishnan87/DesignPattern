package org.mytechexp.creational.creational.builder;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PizzaTest {
    @Test
    void testPizzaBuilder_AllFields() {
        Pizza pizza = new Pizza.PizzaBuilder()
                .bread("Thin Crust")
                .type("Veg")
                .jalpeno(true)
                .chilliflake(true)
                .quantity(2)
                .build();
        assertEquals("Thin Crust", pizza.getBread());
        assertEquals("Veg", pizza.getType());
        assertTrue(pizza.hasJalpeno());
        assertTrue(pizza.hasChilliflake());
        assertEquals(2, pizza.getQuantity());
    }

    @Test
    void testPizzaBuilder_DefaultValues() {
        Pizza pizza = new Pizza.PizzaBuilder().build();
        assertNull(pizza.getBread());
        assertNull(pizza.getType());
        assertFalse(pizza.hasJalpeno());
        assertFalse(pizza.hasChilliflake());
        assertEquals(0, pizza.getQuantity());
    }
}