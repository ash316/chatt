package com.anayyar.chattapp;

/**
 * Created by Ashish on 3/11/2015.
 */
public class FriendDetails {

    private String imagePath;
    private String name;
    private String presence;

    public FriendDetails() {

    }

    public FriendDetails(String imagePath, String name, String presence) {
        this.imagePath = imagePath;
        this.name = name;
        this.presence = presence;
    }
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPresence() {
        return presence;
    }

    public void setPresence(String presence) {
        this.presence = presence;
    }
}
