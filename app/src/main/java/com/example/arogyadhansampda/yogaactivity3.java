package com.example.arogyadhansampda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class yogaactivity3 extends AppCompatActivity {
    String buttonvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yogaactivity3);

        Intent intent= getIntent();
        buttonvalue= intent.getStringExtra("value");

        int intvalue= Integer.valueOf(buttonvalue);
        switch(intvalue){


            case 1:
                setContentView(R.layout.activity_tadasana);
                break;
            case 2:
                setContentView(R.layout.activity_utkatasana);
                break;
            case 3:
                setContentView(R.layout.activity_uttana);
                break;
            case 4:
                setContentView(R.layout.activity_adhomukha);
                break;
            case 5:
                setContentView(R.layout.activity_virbhadrasana);
                break;
            case 6:
                setContentView(R.layout.activity_trikonasana);
                break;
            case 7:
                setContentView(R.layout.activity_vriksasana);
                break;
            case 8:
                setContentView(R.layout.activity_setubandha);
                break;
            case 9:
                setContentView(R.layout.activity_baddha);
                break;
            case 10:
                setContentView(R.layout.activity_paschimottanasana);
                break;
            case 11:
                setContentView(R.layout.activity_savasana);
                break;
            case 12:
                setContentView(R.layout.activity_kumbhakasana);
                break;
            case 13:
                setContentView(R.layout.activity_urdhvamukha);
                break;




        }





    }
}