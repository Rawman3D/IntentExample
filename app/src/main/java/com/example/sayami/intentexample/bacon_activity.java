package com.example.sayami.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class bacon_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon_activity);


        Bundle applesData = getIntent().getExtras();
         if(applesData==null){
             return;
         }

        String applesMessage = applesData.getString("ApplesMessage");

        final TextView baconText = (TextView) findViewById(R.id.bacon_text);
        baconText.setText(applesMessage);


    }

    public void callApple(View view){
        // Intent code to go back to the previous activity.
        finish();

    }

    public void sendBroadCast(View view){
         Intent in= new Intent();
        in.setAction("RamensBroadcast");
        in.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(in);
    }

}
