//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package edu.vt.galleria;

import jakarta.annotation.PostConstruct;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.primefaces.model.ResponsiveOption;

@Named("galleriaManager")
@ViewScoped
public class GalleriaManager implements Serializable {
    private List<edu.vt.galleria.Photo> listOfPhotos;
    private List<ResponsiveOption> responsiveOptions1;
    private List<ResponsiveOption> responsiveOptions2;
    private List<ResponsiveOption> responsiveOptions3;
    private int activeIndex = 0;
    @Inject
    private edu.vt.galleria.PhotoService photoService;

    @PostConstruct
    public void init() {
        this.listOfPhotos = this.photoService.getListOfPhotos();
        this.responsiveOptions1 = new ArrayList();
        this.responsiveOptions1.add(new ResponsiveOption("1024px", 5));
        this.responsiveOptions1.add(new ResponsiveOption("768px", 3));
        this.responsiveOptions1.add(new ResponsiveOption("560px", 1));
        this.responsiveOptions2 = new ArrayList();
        this.responsiveOptions2.add(new ResponsiveOption("1024px", 5));
        this.responsiveOptions2.add(new ResponsiveOption("960px", 4));
        this.responsiveOptions2.add(new ResponsiveOption("768px", 3));
        this.responsiveOptions2.add(new ResponsiveOption("560px", 1));
        this.responsiveOptions3 = new ArrayList();
        this.responsiveOptions3.add(new ResponsiveOption("1500px", 5));
        this.responsiveOptions3.add(new ResponsiveOption("1024px", 3));
        this.responsiveOptions3.add(new ResponsiveOption("768px", 2));
        this.responsiveOptions3.add(new ResponsiveOption("560px", 1));
    }

    public void changeActiveIndex() {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        this.activeIndex = Integer.parseInt((String)params.get("index"));
    }

    public List<edu.vt.galleria.Photo> getListOfPhotos() {
        return this.listOfPhotos;
    }

    public List<ResponsiveOption> getResponsiveOptions1() {
        return this.responsiveOptions1;
    }

    public List<ResponsiveOption> getResponsiveOptions2() {
        return this.responsiveOptions2;
    }

    public List<ResponsiveOption> getResponsiveOptions3() {
        return this.responsiveOptions3;
    }

    public int getActiveIndex() {
        return this.activeIndex;
    }

    public void setActiveIndex(int activeIndex) {
        this.activeIndex = activeIndex;
    }

    public void setPhotoService(edu.vt.galleria.PhotoService photoService) {
        this.photoService = photoService;
    }
}
