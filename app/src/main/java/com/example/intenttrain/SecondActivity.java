package com.example.intenttrain;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView dataTraveler = findViewById(R.id.dataTraveler);
        Button button = findViewById(R.id.button);
        Bundle bundleIntent = getIntent().getExtras();
        if (bundleIntent != null) {
            Traveler traveler = (Traveler) bundleIntent.getSerializable(Traveler.class.getSimpleName());
            dataTraveler.setText("Id: " + traveler.getId() + "\n" +
                    "Имя: " + traveler.getName() + "\n"
                    + "Адрес отбытия: " + traveler.getAddress1() + "\n" +
                    "Адрес прибытия: " + traveler.getAddress2() + "\n"
                    + "Время отбытия и прибытия: " + traveler.getTime() + "\n"
                    +"Цена билета: " + traveler.getCost());
        }
        button.setOnClickListener(listener);
    }
    private final View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
    };}