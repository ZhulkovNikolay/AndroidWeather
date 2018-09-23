package ru.geekbrains.helloactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

// Наследуем класс Activity или его потомка
public class HelloActivity extends AppCompatActivity implements GreetingStrings {

    // Этот метод вызывается при создании Activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        BuilderGreetingPhrase builderGreetingPhrase =
                new BuilderGreetingPhrase(this);

        TextView greeting = findViewById(R.id.greeting);    // Получить элемент
        greeting.setText(builderGreetingPhrase.get());      // Заменить значение
    }

    @Override
    public String getHelloer() {
        return getResources().getString(R.string.helloer);
    }

    @Override
    public String getMorning() {
        return getResources().getString(R.string.morning);
    }

    @Override
    public String getAfternoon() {
        return getResources().getString(R.string.afternoon);
    }

    @Override
    public String getEvening() {
        return getResources().getString(R.string.evening);
    }

    @Override
    public String getNight() {
        return getResources().getString(R.string.night);
    }
}
