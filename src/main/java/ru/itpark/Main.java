package ru.itpark;

import ru.itpark.model.TariffBase;
import ru.itpark.model.TariffOthers;
import ru.itpark.model.TurnOn;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TurnOn watch = new TurnOn("Смотри", TariffBase.UNLIMITED, "Кино и сериалы в МегаФон ТВ\n" +
                "Кэшбэк до 30%", 650,
                "json", "https://tatarstan.megafon.ru/tariffs/all/smotri.html",
                null, 1200, 300);
        watch.display();

        ArrayList<TariffOthers> modems = new ArrayList<>();
        //modems.add(0, new TariffOthers() );


    }
}
