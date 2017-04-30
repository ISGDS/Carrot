package com.josifoski.carrot;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.ViewFlipper;

public class Tutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial_main);


        ViewFlipper simpleViewFlipper = (ViewFlipper) findViewById(R.id.simpleViewFlipper);
        simpleViewFlipper = (ViewFlipper) findViewById(R.id.simpleViewFlipper);
        simpleViewFlipper.setFlipInterval(3000);
        simpleViewFlipper.setAutoStart(true);


    }

    public void Start(View v) {
        Intent i = new Intent(Tutorial.this, MyCameraActivity.class);
        startActivity(i);
    }
    public void Map(View v){
        Intent i= new Intent(Tutorial.this, MapsActivity.class);
        startActivity(i);
    }
    public void Profile(View v){
        Intent i= new Intent(Tutorial.this, Profile.class);
        startActivity(i);
    }
}
