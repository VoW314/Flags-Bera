package edu.vt.galleria;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.primefaces.model.ResponsiveOption;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("galleriaManager")
@ViewScoped
public class GalleriaManager implements Serializable {

    private List<Photo> listOfPhotos;
    private List<ResponsiveOption> responsiveOptions1;

    @Inject
    private PhotoService photoService;

    @PostConstruct
    public void init() {

        listOfPhotos = photoService.getListOfPhotos();

        responsiveOptions1 = new ArrayList<>();
        responsiveOptions1.add(new ResponsiveOption("1024px", 5));
        responsiveOptions1.add(new ResponsiveOption("768px", 3));
        responsiveOptions1.add(new ResponsiveOption("560px", 1));
    }

    public List<Photo> getListOfPhotos() {
        return listOfPhotos;
    }

    public List<ResponsiveOption> getResponsiveOptions1() {
        return responsiveOptions1;
    }
}
