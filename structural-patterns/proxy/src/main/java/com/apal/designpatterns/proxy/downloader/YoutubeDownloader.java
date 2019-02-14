package com.apal.designpatterns.proxy.downloader;

import com.apal.designpatterns.proxy.coolmedialib.ThirdPartyYoutubeLib;
import com.apal.designpatterns.proxy.coolmedialib.Video;

import java.util.HashMap;

public class YoutubeDownloader {
    private ThirdPartyYoutubeLib api;

    public YoutubeDownloader(ThirdPartyYoutubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {

        Video video = api.getVideo(videoId);

        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.id);
        System.out.println("Title: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("-------------------------------\n");

    }

    public void renderPopularVideos() {
        HashMap<String, Video> list = api.popularVideos();

        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on Youtube (imagine fancy HTML)");

        for (Video video : list.values()) {
            System.out.println("ID: " + video.id + " / Title: " + video.title);
        }

        System.out.println("-------------------------------\n");
    }
}
