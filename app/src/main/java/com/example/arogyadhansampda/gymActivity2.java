package com.example.arogyadhansampda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class gymActivity2 extends AppCompatActivity {
    String buttonvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_warmupactivity);

        Intent intent= getIntent();

        buttonvalue= intent.getStringExtra("value");


        int intvalue= Integer.valueOf(buttonvalue);


        switch(intvalue){


            case 1:
                setContentView(R.layout.activity_warmup);
                break;
            case 2:
                setContentView(R.layout.activity_bicepse);
                break;
            case 3:
                setContentView(R.layout.activity_tricepse);
                break;
            case 4:
                setContentView(R.layout.activity_shoulder);
                break;
            case 5:
                setContentView(R.layout.activity_chest);
                break;
            case 6:
                setContentView(R.layout.activity_back);
                break;
            case 7:
                setContentView(R.layout.activity_legs);
                break;
            case 8:
                setContentView(R.layout.activity_diet);
                break;

        }


    }
}