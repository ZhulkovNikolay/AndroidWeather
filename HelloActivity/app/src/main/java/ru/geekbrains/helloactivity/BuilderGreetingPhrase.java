package ru.geekbrains.helloactivity;

import java.util.Calendar;

public class BuilderGreetingPhrase {
    private final int currentHour;
    private final GreetingStrings greetingPhrases;

    // Конструктор, здесь передадим ресурсы из активити и получим текущий час
    public BuilderGreetingPhrase(GreetingStrings greetingPhrases){
        this(greetingPhrases, Calendar.getInstance().get(Calendar.HOUR_OF_DAY));
    }

    // Конструктор для тестирования
    BuilderGreetingPhrase(GreetingStrings greetingPhrases, int hour){
        currentHour = hour;
        this.greetingPhrases = greetingPhrases;
    }

    public String get(){
        String helloer = greetingPhrases.getHelloer();
        String currentWeather = greetingPhrases.getUserHelp();

        if (5 <= currentHour && currentHour < 12 ){
            return String.format("%s %s! \n%s", greetingPhrases.getMorning(), helloer, currentWeather);
        }
        else if (12 <= currentHour && currentHour < 18){
            return String.format("%s %s! \n%s", greetingPhrases.getAfternoon(), helloer, currentWeather);
        }
        else if (18 <= currentHour && currentHour < 21){
            return String.format("%s %s! \n%s", greetingPhrases.getEvening(), helloer, currentWeather);
        }
        else {
            return String.format("%s %s! \n%s", greetingPhrases.getNight(), helloer, currentWeather);
        }
    }
}
