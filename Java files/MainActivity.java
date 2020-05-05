package com.example.retryassignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageButton Spring,Monsoons,Summer,Autumn,Winter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spring = (ImageButton) findViewById(R.id.spring);
        Monsoons = (ImageButton) findViewById(R.id.monsoons);
        Summer = (ImageButton) findViewById(R.id.summer);
        Autumn = (ImageButton) findViewById(R.id.autumn);
        Winter = (ImageButton) findViewById(R.id.winter);

        Spring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I1 = new Intent(MainActivity.this,SpringActivity.class);
                startActivity(I1);
            }
        });
        Monsoons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I2 = new Intent(MainActivity.this,MonsoonsActivity.class);
                startActivity(I2);
            }
        });
        Summer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I3 = new Intent(MainActivity.this,SummerActivity.class);
                startActivity(I3);
            }
        });
        Autumn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I4 = new Intent(MainActivity.this,AutumnActivity.class);
                startActivity(I4);
            }
        });
        Winter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I5 = new Intent(MainActivity.this,WinterActivity.class);
                startActivity(I5);
            }
        });

    }

}

