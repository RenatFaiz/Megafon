package ru.itpark.model;


public class TariffBase<T> {
    private String name;
    private String internet;
    private String description;
    private T price;
    private String linkChoice;
    private String linkAbout;

    public static final String UNLIMITED = "Безлимитный интернет";

    public TariffBase(String name, String internet, String description,
                      T price, String linkChoice, String linkAbout) {
        this.name = name;
        this.internet = internet;
        this.description = description;
        this.price = price;
        this.linkChoice = linkChoice;
        this.linkAbout = linkAbout;
    }

    public String getName() {
        return name;
    }

    public String getInternet() {
        return internet;
    }

    public String getDescription() {
        return description;
    }

    public T getPrice() {
        return price;
    }

    public String getLinkChoice() {
        return linkChoice;
    }

    public String getLinkAbout() {
        return linkAbout;
    }
}
