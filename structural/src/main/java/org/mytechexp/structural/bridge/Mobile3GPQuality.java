package org.mytechexp.structural.bridge;

public class Mobile3GPQuality implements VideoQuality {
    @Override
    public void play(String movie) {
        System.out.println("Playing " + movie + " in Mobile 3GP quality.");
    }
}
