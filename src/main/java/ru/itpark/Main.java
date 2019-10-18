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

        TariffOthers unlimited6 = new TariffOthers("Твой безлимит на 6 месяцев", TariffBase.UNLIMITED,
                "Трафик без ограничений для использования дома и в поездках по России",
                "3100 руб.", "json4",
                "https://tatarstan.megafon.ru/tariffs/all/tvoj_bezlimit_na_6_mesyacev.html",
                null);
        unlimited6.display();

        ArrayList<TariffOthers> modems = new ArrayList<>();
        //modems.add(0, new TariffOthers() );


    }
}
