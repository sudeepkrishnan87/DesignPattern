package org.mytechexp.structural.bridge;

public abstract class VideoPlayer {
    protected VideoQuality videoQualityl;

    public VideoPlayer(VideoQuality videoQuality)
    {
        this.videoQualityl=videoQuality;
    }

    public abstract void play(String movie);
}
