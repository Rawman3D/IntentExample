package com.example.sayami.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

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
}
