package ru.itpark.model;

import ru.itpark.service.Display;

public class TariffOthers extends TariffBase implements Display {

    private String callsAndSMS;

    public TariffOthers(String name, String internet, String description,
                        Object price, String linkChoice, String linkAbout,
                        String callsAndSMS) {
        super(name, internet, description, price, linkChoice, linkAbout);
        this.callsAndSMS = callsAndSMS;
    }

    @Override
    public void display() {
        System.out.println(getName() + "\n" + getDescription() + "\n" + getInternet()
                + "\n" + callsAndSMS + "\n" + getPrice() + "\n" + getLinkAbout());
    }
}
