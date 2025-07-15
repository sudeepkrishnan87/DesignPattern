package org.mytechexp.structural.bridge;

public class MobileHDQuality implements VideoQuality {
    @Override
    public void play(String movie) {
        System.out.println("Playing " + movie + " in Mobile HD quality.");
    }
}
