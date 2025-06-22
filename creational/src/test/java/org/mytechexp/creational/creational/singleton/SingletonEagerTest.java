package org.mytechexp.creational.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonEagerTest {
    @Test
    void testEqualInstance()
    {
        SingletonEager instance1=SingletonEager.getInstance();
        SingletonEager instance2=SingletonEager.getInstance();
        assertEquals(instance1,instance2);

    }
@Test
    void testNotNull(){
        SingletonEager instance=SingletonEager.getInstance();
        assertNotNull(instance);
    }

}