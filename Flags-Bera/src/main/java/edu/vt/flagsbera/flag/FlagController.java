package edu.vt.flagsbera.flag;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.Locale;

@Named("flagController")
@SessionScoped
public class FlagController implements Serializable {

    // Instance variable value entered by the user
    private String countryCode;

    // Instance variable values obtained
    private String countryName;
    private String countryFlagImageUrl;

//----------------------------------------------------
// Obtain the country flag image URL and country name
// using the 2-letter country code entered by the user
//----------------------------------------------------
    public String obtainCountryData() {

        // Import the Locale Java class: import java.util.Locale;
        // Create a Locale object with language empty and countryCode
        Locale locale = Locale.of("", countryCode);

        // Obtain the corresponding country name using the locale object
        countryName = locale.getDisplayCountry();

    /*
     The URL https://flagcdn.com/cc.svg is used to obtain a country flag image
     in Scalable Vector Graphics (SVG) format
     where cc is the 2-letter country code that must be in lowercase letters.
     */
        String countryCodeInLowercase = countryCode.toLowerCase();

        // Define the country flag image URL in SVG format
        countryFlagImageUrl = "https://flagcdn.com/" + countryCodeInLowercase + ".svg";

        // Return to display the XHTML page FlagResult and update the page's URL
        return "/flag/FlagResult?faces-redirect=true";
    }


    // Getters and setters that I assume we need
    public String getCountryCode() { return countryCode; }
    public void setCountryCode(String countryCode) { this.countryCode = countryCode; }

    public String getCountryName() { return countryName; }
    public String getCountryFlagImageUrl() { return countryFlagImageUrl; }
}
