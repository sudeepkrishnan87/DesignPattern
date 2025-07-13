package org.mytechexp.structural.proxy;

public class RealVideoDownloader implements VideoDownloader{

    @Override
    public String downloadVideo(String url) {
        return "Downloded the Video From the Server "+url;
    }
}
