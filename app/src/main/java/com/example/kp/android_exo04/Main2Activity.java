package com.example.kp.android_exo04;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;



public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent intent = getIntent();
        TextView nameView=(TextView) findViewById(R.id.resultat);
        nameView.setText(intent.getExtras().getString("mee"));

    }










    }

