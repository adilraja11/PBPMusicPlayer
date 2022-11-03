package com.example.pbpmusicplayer;

public class ItemMusic {
    String title;
    String artist;
    int image;
    int music;

    public ItemMusic(String title, String artist, int image, int music) {
        this.title = title;
        this.artist = artist;
        this.image = image;
        this.music = music;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getMusic() {
        return music;
    }

    public void setMusic(int music) {
        this.music = music;
    }
}
