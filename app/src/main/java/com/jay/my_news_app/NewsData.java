package com.jay.my_news_app;

public class NewsData {
    String headlines;
    String imageUrl;

    public NewsData(String headlines, String imageUrl) {
        this.headlines = headlines;
        this.imageUrl = imageUrl;
    }

    public String getHeadlines() {
        return headlines;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
