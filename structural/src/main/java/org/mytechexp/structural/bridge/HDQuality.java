package org.mytechexp.structural.bridge;

public class HDQuality implements VideoQuality {
    @Override
    public void play(String movie) {
        System.out.println("Playing " + movie + " in HD quality.");
    }

}
