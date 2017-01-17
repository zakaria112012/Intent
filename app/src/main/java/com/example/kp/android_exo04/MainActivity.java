package com.example.kp.android_exo04;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button Act1button = (Button) findViewById(R.id.btn30sec);
        final Button Act2button = (Button) findViewById(R.id.btn1mn);
        final EditText et= (EditText) findViewById(R.id.donner);

        Act1button.setOnClickListener(new Button.OnClickListener() {



            @Override
            public void onClick(View view) {


                AlarmManager alarms = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
                Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);


                myIntent.putExtra("mee", et.getText().toString());
                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, myIntent,PendingIntent.FLAG_CANCEL_CURRENT);

                alarms.set(AlarmManager.RTC, System.currentTimeMillis() + 6000, pendingIntent);


//startActivity(myIntent);


            }
        });


        Act2button.setOnClickListener(new Button.OnClickListener() {



            @Override
            public void onClick(View view) {


                AlarmManager alarms = (AlarmManager) getSystemService(Context.ALARM_SERVICE);
                Intent myIntent = new Intent(MainActivity.this, Main2Activity.class);


                myIntent.putExtra("mee", Act2button.getText().toString());
                PendingIntent pendingIntent = PendingIntent.getActivity(MainActivity.this, 0, myIntent,PendingIntent.FLAG_CANCEL_CURRENT);

                alarms.set(AlarmManager.RTC, System.currentTimeMillis() + 4000, pendingIntent);


//startActivity(myIntent);


            }
        });

    }
}










