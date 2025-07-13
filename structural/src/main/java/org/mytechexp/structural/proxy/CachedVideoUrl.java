package org.mytechexp.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedVideoUrl implements VideoDownloader{

    private RealVideoDownloader realVideoDownloader;
    private Map<String,String> cache;

    public CachedVideoUrl()
    {
        realVideoDownloader=new RealVideoDownloader();
        cache=new HashMap<>();
    }
    @Override
    public String downloadVideo(String url) {
        if(cache.containsKey(url))
        {
            return "video from cache"+cache.get(url);
        }
        else{
            cache.put(url,"proxyied Video");
            return "proxyied Video";
        }
    }
}
