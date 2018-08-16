package com.myappcompany.sanjif.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void USD2CAD(View view){
        EditText currencyUSD = (EditText) findViewById(R.id.USDeditText);
        double rate = 1.31;

        Log.i("Info", "Button pressed!");
        Log.i("info", "Curreny in USD: $" + currencyUSD.getText().toString());

        if (!currencyUSD.getText().toString().isEmpty()) {
            double currencyCAD = rate * Double.parseDouble(currencyUSD.getText().toString());
            Log.i("Info","Currency in CAD: %" + String.format("%.2f",currencyCAD));
            Toast.makeText(this, "CAD: $" + String.format("%.2f",currencyCAD), Toast.LENGTH_LONG).show();
        }
        else {
            Log.i("Info","No value entered!");
            Toast.makeText(this, "No value entered",Toast.LENGTH_LONG).show();
        }
    }
}
