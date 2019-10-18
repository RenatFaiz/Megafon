package ru.itpark.model.tariffs;

import ru.itpark.service.Display;

public class TurnOn extends Base implements Display {
    private String labelImage;
    private int minutes;
    private int sms;

    public TurnOn(String name, String internet, String description,
                  int price, String linkChoice, String linkAbout,
                  String labelImage, int minutes, int sms) {
        super(name, internet, description, price, linkChoice, linkAbout);
        this.labelImage = labelImage;
        this.minutes = minutes;
        this.sms = sms;
    }

    @Override
    public void display() {
        if (labelImage != null) {
            System.out.println(labelImage);
        }
        System.out.println("Включайся!" + getName()
                + "\n" + minutes + " минут\n" + getInternet() + "\n" + sms
                + " SMS\n" + getDescription() + "\n" + getPrice()
                + " руб. за 30 дней\n" + getLinkAbout() + "\n");
    }
}
