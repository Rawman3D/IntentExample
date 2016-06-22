package com.example.sayami.intentexample;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openBacon(View view){
        Intent i= new Intent(this,bacon_activity.class);

        TextView appleInput = (TextView) findViewById(R.id.ApplesInput);

        String userMessage= appleInput.getText().toString();

        i.putExtra("ApplesMessage",userMessage);

        startActivity(i);
    }

    public void launchCall(View view){



        TextView phoneNumber = (TextView) findViewById(R.id.phNum);
        String phNo=( phoneNumber.getText().toString());
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phNo));
                //Intent in=new Intent(Intent.ACTION_CALL, Uri.parse(String.valueOf(phNo)));
        try{
            startActivity(intent);
        }

        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(),"yourActivity is not founded",Toast.LENGTH_SHORT).show();
        }
    }
}
