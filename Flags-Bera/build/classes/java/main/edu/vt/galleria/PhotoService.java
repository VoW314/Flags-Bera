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

        listOfPhotos = new ArrayList<>();

        listOfPhotos.add(new Photo(
                "https://flagcdn.com/br.svg",
                "https://flagcdn.com/br.svg",
                "Brazil Flag",
                "Brazil (BR)"
        ));

        listOfPhotos.add(new Photo(
                "https://flagcdn.com/cn.svg",
                "https://flagcdn.com/cn.svg",
                "China Flag",
                "China (CN)"
        ));

        listOfPhotos.add(new Photo(
                "https://flagcdn.com/fr.svg",
                "https://flagcdn.com/fr.svg",
                "France Flag",
                "France (FR)"
        ));

        listOfPhotos.add(new Photo(
                "https://flagcdn.com/de.svg",
                "https://flagcdn.com/de.svg",
                "Germany Flag",
                "Germany (DE)"
        ));

        listOfPhotos.add(new Photo(
                "https://flagcdn.com/in.svg",
                "https://flagcdn.com/in.svg",
                "India Flag",
                "India (IN)"
        ));

        listOfPhotos.add(new Photo(
                "https://flagcdn.com/it.svg",
                "https://flagcdn.com/it.svg",
                "Italy Flag",
                "Italy (IT)"
        ));

        listOfPhotos.add(new Photo(
                "https://flagcdn.com/jp.svg",
                "https://flagcdn.com/jp.svg",
                "Japan Flag",
                "Japan (JP)"
        ));

        listOfPhotos.add(new Photo(
                "https://flagcdn.com/mx.svg",
                "https://flagcdn.com/mx.svg",
                "Mexico Flag",
                "Mexico (MX)"
        ));

        listOfPhotos.add(new Photo(
                "https://flagcdn.com/es.svg",
                "https://flagcdn.com/es.svg",
                "Spain Flag",
                "Spain (ES)"
        ));

        listOfPhotos.add(new Photo(
                "https://flagcdn.com/tr.svg",
                "https://flagcdn.com/tr.svg",
                "Türkiye Flag",
                "Türkiye (TR)"
        ));

        listOfPhotos.add(new Photo(
                "https://flagcdn.com/gb.svg",
                "https://flagcdn.com/gb.svg",
                "United Kingdom Flag",
                "United Kingdom (GB)"
        ));

        listOfPhotos.add(new Photo(
                "https://flagcdn.com/us.svg",
                "https://flagcdn.com/us.svg",
                "United States Flag",
                "United States (US)"
        ));
    }

    public List<Photo> getListOfPhotos() {
        return listOfPhotos;
    }
}
