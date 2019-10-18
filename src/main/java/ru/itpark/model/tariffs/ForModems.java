package ru.itpark.model.tariffs;

import ru.itpark.service.Display;

public class ForModems extends Base implements Display {

    public ForModems(String name, String internet, String description,
                     Object price, String linkChoice, String linkAbout) {
        super(name, internet, description, price, linkChoice, linkAbout);
    }

    @Override
    public void display() {
        System.out.println(getName() + "\n" + getDescription() + "\n" + getInternet()
                + "\n" + getPrice() + "\n" + getLinkAbout() + "\n");
    }
}
