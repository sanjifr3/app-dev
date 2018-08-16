package com.myappcompany.sanjif.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();
    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomNumber = rand.nextInt(20) + 1;
    }

    public void guess(View view) {
        EditText guess = (EditText) findViewById(R.id.guessEditText);
        Log.i("Info","button pressed");
        Log.i("Entered Value","Entered value: " + guess.getText().toString());
        Log.i("Random Number", Integer.toString(randomNumber));

        String message;
        if (guess.getText().toString().isEmpty()){
            Log.i("error","No number guessed!");
            message = "No number guessed!";
        }
        else {
            int guess_val = Integer.parseInt(guess.getText().toString());
            if (guess_val > randomNumber)
                message = "Higher!";
            else if (guess_val < randomNumber)
                message = "Lower";
            else{
                message = "You got it!";
                randomNumber = rand.nextInt(20) + 1;
            }
        }

        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();
        Log.i("message",message);
    }
}
