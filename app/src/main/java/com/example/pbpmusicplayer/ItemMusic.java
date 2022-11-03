package com.example.pbpmusicplayer;

import android.os.Parcel;
import android.os.Parcelable;

public class ItemMusic implements Parcelable {
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

    protected ItemMusic(Parcel in) {
        title = in.readString();
        artist = in.readString();
        image = in.readInt();
        music = in.readInt();
    }

    public static final Creator<ItemMusic> CREATOR = new Creator<ItemMusic>() {
        @Override
        public ItemMusic createFromParcel(Parcel in) {
            return new ItemMusic(in);
        }

        @Override
        public ItemMusic[] newArray(int size) {
            return new ItemMusic[size];
        }
    };

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

    @Override
    public int describeContents() {
        return this.hashCode();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(artist);
        parcel.writeInt(image);
        parcel.writeInt(music);
    }
}
