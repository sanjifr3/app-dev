package com.myappcompany.sanjif.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bart_image = (ImageView) findViewById(R.id.bartImageView);
        bart_image.setX(-1000);

        bart_image.animate().translationXBy(1000).rotation(3600).setDuration(2000);
    }

    public void fade(View view){
        Log.i("info","Image pressed!");
        ImageView bart_image = (ImageView) findViewById(R.id.bartImageView);
        ImageView homer_image = (ImageView) findViewById(R.id.homerImageView);

        if(bart_image.getAlpha() == 1){
            bart_image.animate().alpha(0).setDuration(2000);
            homer_image.animate().alpha(1).setDuration(2000);
        }
        else {
            bart_image.animate().alpha(1).setDuration(2000);
            homer_image.animate().alpha(0).setDuration(2000);
        }
    }

    public void translate(View view){
        Log.i("info","Image pressed!");
        ImageView bart_image = (ImageView) findViewById(R.id.bartImageView);
        bart_image.animate().translationYBy(2000).setDuration(2000);
    }

    public void rotate(View view){
        Log.i("info","Image pressed!");
        ImageView bart_image = (ImageView) findViewById(R.id.bartImageView);
        bart_image.animate().rotation(180).setDuration(1000);
        // Rotations is in angles
    }

    public void rotateAndTranslate(View view){
        Log.i("info","Image pressed!");
        ImageView bart_image = (ImageView) findViewById(R.id.bartImageView);
        bart_image.animate().rotation(1800).translationXBy(-2000).setDuration(1000);
    }

    public void scale(View view){
        Log.i("info","Image pressed!");
        ImageView bart_image = (ImageView) findViewById(R.id.bartImageView);
        bart_image.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);
        // double is not a float!
    }
}
