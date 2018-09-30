package ru.geekbrains.helloactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity implements GreetingStrings {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        BuilderGreetingPhrase builderGreetingPhrase =
                new BuilderGreetingPhrase(this);

        TextView greeting = findViewById(R.id.greeting);
        greeting.setText(builderGreetingPhrase.get());

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new StartSecondActivity(this));
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                Intent intent = new Intent(this, SecondActivity.class);
                startActivity(intent);
                break;
                default:
                    break;
        }
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

    @Override
    public String getUserHelp() {
        return getResources().getString(R.string.userHelp);
    }
}
