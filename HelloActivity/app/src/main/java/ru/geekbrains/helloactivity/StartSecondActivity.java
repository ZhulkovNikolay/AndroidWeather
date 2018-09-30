package ru.geekbrains.helloactivity;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class StartSecondActivity implements View.OnClickListener {

    public final static String TEXT = "Text";

    private final Activity sourceActivity;

    public StartSecondActivity(Activity sourceActivity){
        this.sourceActivity = sourceActivity;
    }

    @Override
    public void onClick(View v) {
        // Формируем посылку
        EditText txt = sourceActivity.findViewById(R.id.editText);

        Parcel parcel = new Parcel();
        parcel.text = txt.getText().toString();

        // Посылка сформирована, отправляем
        Intent intent = new Intent(sourceActivity, SecondActivity.class);
        intent.putExtra(TEXT, parcel);    // Отправляем посылку

        sourceActivity.startActivityForResult(intent, 1);
    }
}

