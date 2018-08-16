package com.myappcompany.sanjif.numbershapes;

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

    class Number{
        int number;

        public boolean isSquared(){
            double squareRoot = Math.sqrt(number);
            if (squareRoot == Math.floor(squareRoot))
                return true;
            return false;
        }

        public boolean isTriangular(){
            int x = 1;
            int triangularNumber = 1;
            while(triangularNumber < number){
                x++;
                triangularNumber += x;
            }
            if(triangularNumber == number)
                return true;
            return false;
        }
    }

    public void testNumber(View view){
        Log.i("info","button pressed!");
        EditText num_text = (EditText) findViewById(R.id.editText);

        String message;
        if(num_text.getText().toString().isEmpty())
            message = "No number entered!";
        else{
            Number num = new Number();
            num.number = Integer.parseInt(num_text.getText().toString());
            boolean squared = num.isSquared();
            boolean triangular = num.isTriangular();

            if (squared && triangular) {
                message = "It is both!";
            }
            else if (squared) {
                message = "It is squared!";
            }
            else if (triangular) {
                message = "It is triangular!";
            }
            else
                message = "It is neither!";
        }

        Log.i("info",message);
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }
}
