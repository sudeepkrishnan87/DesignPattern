package org.mytechexp.structural.bridge;

public class WebPlayer extends VideoPlayer{
    private VideoQuality quality;
    public WebPlayer(VideoQuality videoQuality)
    {
        super(videoQuality);
        quality=videoQuality;
    }

    @Override
    public void play(String movie) {
        System.out.println("Playing WebQuality");
        quality.play(movie);
    }
}
