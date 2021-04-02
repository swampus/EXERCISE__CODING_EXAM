package com.swampus.cooding.misc.observer;

public class NewsChannel implements Channel {
    private String news;

    @Override
    public void update(Object o) {
        this.news = String.valueOf(o);
    }

    public String getNews() {
        return news;
    }
}
