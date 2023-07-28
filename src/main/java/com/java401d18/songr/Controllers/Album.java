package com.java401d18.songr.Controllers;

public class Album {
    private String title;
    private String artist;
    private int songCount;
    private int length;
    private String imageUrl;

    public Album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getSongCount() {
        return this.songCount;
    }

    public int getLength() {
        return this.length;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }
}
