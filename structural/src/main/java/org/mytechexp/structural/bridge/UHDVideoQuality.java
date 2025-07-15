package org.mytechexp.structural.bridge;

public class UHDVideoQuality implements VideoQuality {
    @Override
    public void play(String movie) {
        System.out.println("Playing " + movie + " in UHD quality.");
    }
}
