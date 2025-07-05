package org.mytechexp.creational.creational.singleton;

import static org.junit.jupiter.api.Assertions.*;

class SingletonEnumTest {
    @org.junit.jupiter.api.Test
    void getInstance() {
        SingletonEnum instance1 = SingletonEnum.INSTANCE;
        SingletonEnum instance2 = SingletonEnum.INSTANCE;

        assertSame(instance1, instance2, "Both instances should be the same");
    }



}