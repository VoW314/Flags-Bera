//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package edu.vt.galleria;

import java.io.Serializable;

public class Photo implements Serializable {
    private String regularPhotoFilepath;
    private String thumbnailPhotoFilepath;
    private String alt;
    private String title;

    public Photo(String regularPhotoFilepath, String thumbnailPhotoFilepath, String alt, String title) {
        this.regularPhotoFilepath = regularPhotoFilepath;
        this.thumbnailPhotoFilepath = thumbnailPhotoFilepath;
        this.alt = alt;
        this.title = title;
    }

    public String getRegularPhotoFilepath() {
        return this.regularPhotoFilepath;
    }

    public void setRegularPhotoFilepath(String regularPhotoFilepath) {
        this.regularPhotoFilepath = regularPhotoFilepath;
    }

    public String getThumbnailPhotoFilepath() {
        return this.thumbnailPhotoFilepath;
    }

    public void setThumbnailPhotoFilepath(String thumbnailPhotoFilepath) {
        this.thumbnailPhotoFilepath = thumbnailPhotoFilepath;
    }

    public String getAlt() {
        return this.alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
