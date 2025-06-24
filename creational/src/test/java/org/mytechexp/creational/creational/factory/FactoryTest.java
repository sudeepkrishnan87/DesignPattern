package org.mytechexp.creational.creational.factory;

import static org.junit.jupiter.api.Assertions.*;

@org.junit.jupiter.api.TestInstance(org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS)
class FactoryTest {
    @org.junit.jupiter.api.Test
    void testRoadLogistics() {
        Logistics roadLogistics = Factory.getInstance("road");
        assertNotNull(roadLogistics, "Road logistics should not be null");
        assertTrue(roadLogistics instanceof Road, "Road logistics should be an instance of Road");
    }

    @org.junit.jupiter.api.Test
    void testAirLogistics() {
        Logistics airLogistics = Factory.getInstance("air");
        assertNotNull(airLogistics, "Air logistics should not be null");
        assertTrue(airLogistics instanceof Air, "Air logistics should be an instance of Air");

    }

}