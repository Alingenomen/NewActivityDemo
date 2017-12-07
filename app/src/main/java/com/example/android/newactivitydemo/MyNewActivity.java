package com.example.android.newactivitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyNewActivity extends AppCompatActivity {

    private String passedString;
    private TextView textViewToPutStringIn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_new);

        // Read the string you passed along to this Activity, using its ID
        passedString = getIntent().getStringExtra("passedAlongString");

        // Assign the textView to put the string in to the
        // variable
        textViewToPutStringIn = findViewById(R.id.textViewToFill);

        // Fill the textView with the value you passed along,
        // now filled in the variable passedString
        textViewToPutStringIn.setText(passedString);
    }
}
