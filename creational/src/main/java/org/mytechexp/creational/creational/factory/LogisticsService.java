package org.mytechexp.creational.creational.factory;

public class LogisticsService {
    public static void main(String[] args) {
        Logistics roadLogistics = Factory.getInstance("road");
        if (roadLogistics != null) {
            roadLogistics.send();
        }

        Logistics airLogistics = Factory.getInstance("air");
        if (airLogistics != null) {
            airLogistics.send();
        }

        Logistics unknownLogistics = Factory.getInstance("sea");
        if (unknownLogistics == null) {
            System.out.println("Unknown logistics type requested.");
        }
    }
}
