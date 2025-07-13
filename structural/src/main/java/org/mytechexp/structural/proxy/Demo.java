package org.mytechexp.structural.proxy;

public class Demo {
    public static void main(String[] args) {
        VideoDownloader videoDownloader=new CachedVideoUrl();
        System.out.println(videoDownloader.downloadVideo("www.proxy.test.com"));
        //second time will return from the cache
        System.out.println(videoDownloader.downloadVideo("www.proxy.test.com"));



    }
}
