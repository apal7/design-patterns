package com.apal.designpatterns.proxy;

import com.apal.designpatterns.proxy.coolmedialib.ThirdPartyYoutubeClass;
import com.apal.designpatterns.proxy.downloader.YoutubeDownloader;
import com.apal.designpatterns.proxy.proxy.YoutubeCacheProxy;



public class ProxyApplication {

	public static void main(String[] args) {

        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeClass());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());

        long naive = test(naiveDownloader);
        long smart = test(smartDownloader);

        System.out.print("Time saved by caching proxy: " + (naive - smart) + "ms");

    }


	private static long test(YoutubeDownloader downloader) {

		long startTime = System.currentTimeMillis();

		// User behavior in our app:
		downloader.renderPopularVideos();
		downloader.renderVideoPage("catzzzzzzzzz");
		downloader.renderPopularVideos();
		downloader.renderVideoPage("dancesvideoo");
		// Users might visit the same page quite often.
		downloader.renderVideoPage("catzzzzzzzzz");
		downloader.renderVideoPage("someothervid");

		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.print("Time elapsed: " + estimatedTime + "ms\n");

		return estimatedTime;
	}

}

