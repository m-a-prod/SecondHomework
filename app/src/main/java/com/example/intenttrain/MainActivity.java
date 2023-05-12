package com.example.intenttrain;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nameIn;
    private EditText addressIn1;
    private EditText addressIn2;
    private EditText costIn;
    private EditText timeIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameIn = findViewById(R.id.nameIn);
        addressIn1 = findViewById(R.id.addressIn1);
        addressIn2 = findViewById(R.id.addressIn2);
        costIn = findViewById(R.id.CostIn);
        timeIn = findViewById(R.id.TimeIn);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String name = nameIn.getText().toString();
            String time = timeIn.getText().toString();
            String address1 = addressIn1.getText().toString();
            String address2 = addressIn2.getText().toString();
            String cost = costIn.getText().toString();
            Traveler user = new Traveler(name, address1, address2, time, cost);
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            intent.putExtra(Traveler.class.getSimpleName(), user);
            startActivity(intent);
        }
    };
}