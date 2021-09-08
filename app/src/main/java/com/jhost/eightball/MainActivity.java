package com.jhost.eightball;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private final Random rng = new Random();

    private final int[] ballOptions = {
            R.drawable.ball1,
            R.drawable.ball2,
            R.drawable.ball3,
            R.drawable.ball4,
            R.drawable.ball5
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button askBtn = findViewById(R.id.askBtn);
        final ImageView ballImg = findViewById(R.id.ballImg);

        setRandomImg(ballImg);

        askBtn.setOnClickListener(event -> {
            setRandomImg(ballImg);
        });
    }

    private void setRandomImg(ImageView ballImg){
        ballImg.setImageResource(ballOptions[rng.nextInt(ballOptions.length)]);
    }
}