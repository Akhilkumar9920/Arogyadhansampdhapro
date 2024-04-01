package com.example.arogyadhansampda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.os.Bundle;

public class gymActivity extends AppCompatActivity {
    int[] newArray;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym3);

        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        newArray = new int[]{
                R.id.warmupexr, R.id.bicepseexr, R.id.tricepseexr, R.id.shoulderexr,
                R.id.backexr, R.id.legsexr, R.id.dietexr, R.id.chestexr

        };

    }
    public void Imagebuttonclicked(View view){

        for(int i=0; i<= newArray.length; i++){

            if (view.getId()==newArray[i]){
                int value=i+1;
                String tag;
                Log.i("First", String.valueOf(value));
                Intent intent=new Intent(gymActivity.this, gymActivity2.class);
                intent.putExtra("value" , String.valueOf(value));
                startActivity(intent);


            }

        }

    }
}