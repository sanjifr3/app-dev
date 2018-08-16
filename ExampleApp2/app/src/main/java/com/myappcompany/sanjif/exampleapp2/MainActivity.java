package com.myappcompany.sanjif.exampleapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

// Public means it can be accessed anywhere in the code
// extends means this code extends the functionality from AppCompactActivity
public class MainActivity extends AppCompatActivity {

    // onCreate is run when the app is opened
    // Override means the function already exists. It is in AppCompactActivity
    // we are adding to it.
    // Protected functions can be accessed anywhere from within the app but not from outside the app
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); //super alrady exists into AppCompactActivity
        setContentView(R.layout.activity_main);
    }
    // alt + enter to import missing libraries
    public void clickFunction(View view) {
        EditText nameEditText = (EditText) findViewById(R.id.nameEditText);

        Log.i("Info","Button pressed!");

        Log.i("Values", nameEditText.getText().toString());
    }
}
