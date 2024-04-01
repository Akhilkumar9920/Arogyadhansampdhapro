package com.example.arogyadhansampda;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.logging.Logger;

public class yogaActivity2 extends AppCompatActivity {


    int[] newArray;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga2);

        Toolbar toolbar= findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        newArray =new int[]{
                R.id.mountainpose, R.id.chairpose, R.id.downwardonchair, R.id.downwardfacing, R.id.warrior2,
                R.id.trianglepose,R.id.treepose,R.id.bridgepose,R.id.boundanklepose,R.id.seatedforward,R.id.corpsepose,
                R.id.plankpose,R.id.upwardfacing



        };
    }
    public void Imagebuttonclicked(View view) {

        for (int i=0; i< newArray.length; i++){

            if (view.getId()==newArray[i]){

                int value=i+1;
                String tag;
                Log.i("FIRST", String.valueOf(value));
                Intent intent=new Intent(yogaActivity2.this, yogaactivity3.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);


            }
        }

    }

}