//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package edu.vt.galleria;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named("photoService")
@ApplicationScoped
public class PhotoService {
    private List<Photo> listOfPhotos;

    @PostConstruct
    public void init() {
        this.listOfPhotos = new ArrayList();
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo1.jpg", "/resources/images/photos/photo1s.jpg", "Description for Photo 1", "Brazil (BR)"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo2.jpg", "/resources/images/photos/photo2s.jpg", "Description for Photo 2", "China (CN)"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo3.jpg", "/resources/images/photos/photo3s.jpg", "Description for Photo 3", "France (FR)"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo4.jpg", "/resources/images/photos/photo4s.jpg", "Description for Photo 4", "Germany (DE)"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo5.jpg", "/resources/images/photos/photo5s.jpg", "Description for Photo 5", "India (IN)"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo6.jpg", "/resources/images/photos/photo6s.jpg", "Description for Photo 6", "Italy (IT)"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo7.jpg", "/resources/images/photos/photo7s.jpg", "Description for Photo 7", "Japan (JP)"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo8.jpg", "/resources/images/photos/photo8s.jpg", "Description for Photo 8", "Mexico (MX)"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo9.jpg", "/resources/images/photos/photo9s.jpg", "Description for Photo 9", "Spain (ES)"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo10.jpg", "/resources/images/photos/photo10s.jpg", "Description for Photo 10", "Türkiye (TR)"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo11.jpg", "/resources/images/photos/photo11s.jpg", "Description for Photo 11", "United Kingdom (GB)"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo12.jpg", "/resources/images/photos/photo12s.jpg", "Description for Photo 12", "United States (US)"));
    }

    public List<Photo> getListOfPhotos() {
        return this.listOfPhotos;
    }
}
