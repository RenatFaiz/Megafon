package ru.itpark;

import ru.itpark.model.tariffs.Base;
import ru.itpark.model.tariffs.ForModems;
import ru.itpark.model.tariffs.Others;
import ru.itpark.model.tariffs.TurnOn;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        TurnOn watch = new TurnOn("Смотри", Base.UNLIMITED, "Кино и сериалы в МегаФон ТВ\n" +
                "Кэшбэк до 30%", 650,
                "json", "https://tatarstan.megafon.ru/tariffs/all/smotri.html",
                null, 1200, 300);
        watch.display();

        ForModems unlimited6 = new ForModems("Твой безлимит на 6 месяцев", Base.UNLIMITED,
                "Трафик без ограничений для использования дома и в поездках по России",
                "3100 руб.", "json4",
                "https://tatarstan.megafon.ru/tariffs/all/tvoj_bezlimit_na_6_mesyacev.html");
        unlimited6.display();

        Others hello = new Others("#Hello", "30 ГБ", "Тариф для иностранных туристов",
                "750 руб. за 14 дней", null,
                "https://tatarstan.megafon.ru/tariffs/all/hello.html",
                "Безлимитные звонки внутри сети");
        hello.display();


        ArrayList<ForModems> modems = new ArrayList<>();
        //modems.add(0, new Others() );


    }
}
