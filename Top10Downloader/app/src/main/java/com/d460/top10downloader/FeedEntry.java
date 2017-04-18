package com.d460.top10downloader;

/**
 * Created by Dagoberto on 08/10/2016.
 */

public class FeedEntry {

    private String name;
    private String artist;
    private String releaseDate;
    private String category;
    private String summary;
    private String imageURL;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "name= " + name + '\n' +
                "artist= " + artist + '\n' +
                "releaseDate= " + releaseDate + '\n' +
                "category= " + category + '\n' +
                "imageURL= " + imageURL + '\n';
    }
}
