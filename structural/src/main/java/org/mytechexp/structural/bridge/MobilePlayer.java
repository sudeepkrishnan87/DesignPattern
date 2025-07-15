package org.mytechexp.structural.bridge;

public class MobilePlayer extends VideoPlayer{

    private VideoQuality videoQuality;
    public MobilePlayer(VideoQuality videoQuality){
        super(videoQuality);
        this.videoQuality=videoQuality;
    }
    @Override
    public void play(String movie) {
        System.out.println("Mobile Player");
        videoQuality.play(movie);
    }
}
