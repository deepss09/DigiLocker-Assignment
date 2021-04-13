package com.example.digilocker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.goodiebag.pinview.Pinview;

public class SetYourPin extends AppCompatActivity {
     Pinview pinview;
     Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin_activity);
        button2 = (Button)findViewById(R.id.button2);
        pinview = (Pinview)findViewById(R.id.pin);
        pinview.setPinViewEventListener((pinview, b) -> button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SetYourPin.this,ThirdActivity.class);
                startActivity(intent);
            }
        }));
    }
}