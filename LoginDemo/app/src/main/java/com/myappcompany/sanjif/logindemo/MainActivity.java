package com.myappcompany.sanjif.logindemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view){

        EditText usernameEdiText = (EditText) findViewById(R.id.usernameEditText);
        EditText passwordEditText = (EditText) findViewById(R.id.passwordEditText);

        Log.i("Info","Button pressed");
        Log.i("Username",usernameEdiText.getText().toString());
        Log.i("Password",passwordEditText.getText().toString());

        Toast.makeText(this, "Hi " + usernameEdiText.getText().toString() + "!", Toast.LENGTH_SHORT).show();
    }

    Boolean state = false;

    public void switchImage(View view) {
        Log.i("Info","Switch Image Button pressed");

        ImageView image = (ImageView) findViewById(R.id.dogImageView);

        if (!state){
            image.setImageResource(R.drawable.dog1);
            state = true;
        }
        else {
            image.setImageResource(R.drawable.dog2);
            state = false;
        }
    }
}
