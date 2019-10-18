package ru.itpark.model.tariffs;

import ru.itpark.service.Display;

public class Others extends Base implements Display {

    private String callsAndSMS;

    public Others(String name, String internet, String description,
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
