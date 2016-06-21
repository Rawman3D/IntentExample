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

        int i = Log.i("TAG", "CHiryo");

        TextView phoneNumber = (TextView) findViewById(R.id.phNum);
            Log.i("TAG", "Declare");
        String phNo=( phoneNumber.getText().toString());
             Log.i("TAG", "ToString ph no");
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phNo));
             Log.i("TAG", "call action intent");
                //Intent in=new Intent(Intent.ACTION_CALL, Uri.parse(String.valueOf(phNo)));
        try{
             Log.i("TAG", "starting activity");
            startActivity(intent);
            Log.i("TAG", "end activity");
        }

        catch (android.content.ActivityNotFoundException ex){
            Toast.makeText(getApplicationContext(),"yourActivity is not founded",Toast.LENGTH_SHORT).show();
        }
    }
}
