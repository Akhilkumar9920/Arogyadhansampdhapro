package com.example.arogyadhansampda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);



        button1=findViewById(R.id.startyoga);
        button2=findViewById(R.id.startkarate);
        button3=findViewById(R.id.startboxing);
        button4=findViewById(R.id.startgym);
        button5=findViewById(R.id.starnutrition);


        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, yogaActivity2.class);
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,karateActivity2.class);
                startActivity(intent);

            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, boxingActivity2 .class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,gymActivity.class);
                startActivity(intent);


            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,nutrition2.class);
                startActivity(intent);


            }
        });


    }


    public void Yoga(View view) {
        Intent intent=new Intent(MainActivity.this, yogaActivity.class);
        startActivity(intent);



    }

    public void Karate(View view) {
        Intent intent=new Intent(MainActivity.this, karateActivity2.class);
        startActivity(intent);


    }

    public void Boxing(View view) {
        Intent intent=new Intent(MainActivity.this, boxingActivity2.class);
        startActivity(intent);


    }



    public void Nutrition(View view) {
        Intent intent=new Intent(MainActivity.this, nutrition2.class);
        startActivity(intent);


    }
    public void Gym(View view) {
        Intent intent = new Intent(MainActivity.this, gymActivity.class);
        startActivity(intent);
    }
}