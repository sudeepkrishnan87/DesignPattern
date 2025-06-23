package org.mytechexp.creational.creational.singleton;

import static org.junit.jupiter.api.Assertions.*;

class SingletonLazyTest {
    @org.junit.jupiter.api.Test
    void testEqualInstance() {
        SingletonLazy instance1 = SingletonLazy.getInstance();
        SingletonLazy instance2 = SingletonLazy.getInstance();
        assertEquals(instance1, instance2);
    }

    @org.junit.jupiter.api.Test
    void testNotNull() {
        SingletonLazy instance = SingletonLazy.getInstance();
        assertNotNull(instance);
    }

}