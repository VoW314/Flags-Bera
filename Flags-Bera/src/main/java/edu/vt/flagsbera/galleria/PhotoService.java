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
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo1.jpg", "/resources/images/photos/photo1s.jpg", "Description for Photo 1", "Use this app to calculate monthly payment and total interest given interest rate and loan duration"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo2.jpg", "/resources/images/photos/photo2s.jpg", "Description for Photo 2", "Understand your credit score before you apply for a car loan"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo3.jpg", "/resources/images/photos/photo3s.jpg", "Description for Photo 3", "Keep the loan term as short as you can afford to reduce interest payments"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo4.jpg", "/resources/images/photos/photo4s.jpg", "Description for Photo 4", "Put as much money down as you can so that you don't owe more money than the car is worth"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo5.jpg", "/resources/images/photos/photo5s.jpg", "Description for Photo 5", "Pay for sales tax, registration fees, document fees, and any extras with cash"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo6.jpg", "/resources/images/photos/photo6s.jpg", "Description for Photo 6", "Shop for a loan before you go to the dealership so you can negotiate lowest interest rate"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo7.jpg", "/resources/images/photos/photo7s.jpg", "Description for Photo 7", "Work on your timing since interest rates on car loans fluctuate due to economic conditions"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo8.jpg", "/resources/images/photos/photo8s.jpg", "Description for Photo 8", "If you are young, get a co-signer with good credit history to reduce interest rate"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo9.jpg", "/resources/images/photos/photo9s.jpg", "Description for Photo 9", "Borrow only from reputable banks to avoid outrageous expectations in the fine print"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo10.jpg", "/resources/images/photos/photo10s.jpg", "Description for Photo 10", "Learn about pros and cons of leasing versus buying a car and its effect on your car loan"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo11.jpg", "/resources/images/photos/photo11s.jpg", "Description for Photo 11", "Learn when it is a bad idea to refinance your auto loan"));
        this.listOfPhotos.add(new Photo("/resources/images/photos/photo12.jpg", "/resources/images/photos/photo12s.jpg", "Description for Photo 12", "Investigate if you should include the cost of car maintenance plan in your loan"));
    }

    public List<Photo> getListOfPhotos() {
        return this.listOfPhotos;
    }
}
