package edu.vt.galleria;

import java.io.Serializable;

public class Photo implements Serializable {

    private String regularPhotoFilepath;
    private String thumbnailPhotoFilepath;
    private String alt;
    private String title;

    public Photo(String regularPhotoFilepath,
                 String thumbnailPhotoFilepath,
                 String alt,
                 String title) {

        this.regularPhotoFilepath = regularPhotoFilepath;
        this.thumbnailPhotoFilepath = thumbnailPhotoFilepath;
        this.alt = alt;
        this.title = title;
    }

    public String getRegularPhotoFilepath() {
        return regularPhotoFilepath;
    }

    public String getThumbnailPhotoFilepath() {
        return thumbnailPhotoFilepath;
    }

    public String getAlt() {
        return alt;
    }

    public String getTitle() {
        return title;
    }
}
