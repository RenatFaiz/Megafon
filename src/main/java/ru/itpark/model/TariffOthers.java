package ru.itpark.model;

import ru.itpark.service.Display;

public class TariffOthers extends TariffBase implements Display {

    private String additionalDescription;

    public TariffOthers(String name, String internet, String description,
                        String price, String linkChoice, String linkAbout) {
        super(name, internet, description, price, linkChoice, linkAbout);

    }

    @Override
    public void display() {
      //  getName() + getDescription() + getInternet()

    }
}
