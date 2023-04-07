package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class activity2 extends AppCompatActivity {

    Button blink,rotate,fade,move,slide,zoom,stop;
    TextView nofel;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        blink=findViewById(R.id.button);
        rotate=findViewById(R.id.button2);
        fade=findViewById(R.id.button3);
        move=findViewById(R.id.button7);
        slide=findViewById(R.id.button8);
        zoom=findViewById(R.id.button9);
        stop=findViewById(R.id.button10);
        nofel=findViewById(R.id.textView8);

        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation blink= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                nofel.startAnimation(blink);
            }
        });

        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                nofel.startAnimation(rotate);
            }
        });

        fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                nofel.startAnimation(rotate);
            }
        });

        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                nofel.startAnimation(rotate);
            }
        });

        slide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
                nofel.startAnimation(rotate);
            }
        });

        zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
                nofel.startAnimation(rotate);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nofel.clearAnimation();
            }
        });


    }
}