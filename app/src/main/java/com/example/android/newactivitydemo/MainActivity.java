package com.example.android.newactivitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textview;
    private String stringToPass;


    // In the onCreate Method the variable stringToPass gets read
    // from the textview and is saved as a string by the
    // .toString() suffix
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = findViewById(R.id.textViewToPass);
        stringToPass = textview.getText().toString();
    }

    // This method gets started by the button
    // with id "startNewActivity"

    public void startNewActivityAndPassAlongVariable(View view){
        Intent myIntentToStartNewActivity = new Intent(this,MyNewActivity.class);

        // Before starting the activity, be sure to pass along the variables needed
        // It works a lot like implementing onSavedInstanceState...
        myIntentToStartNewActivity.putExtra("passedAlongString",stringToPass);

        // Start new activity with the line
        // startActivity, followed by your intent
        // here aptly called myIntentToStartNewActivity
        startActivity(myIntentToStartNewActivity);
    }
}
