package com.example.uncletroy.coolthing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int coolCorrect;
    private int imageNum;
    public ImageView imageView;
    private Button button1;
    private Button button2;
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coolSet();
        imageView = findViewById(R.id.imageView);
        imageNum = 0;

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                coolCheck(1);
            }
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                coolCheck(2);
            }
        });

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                coolCheck(3);
            }
        });


    }


    private void coolCheck(int coolness){
        if(coolness == coolCorrect){
            spawnImage();
            Toast.makeText(this, "You're cool!",
                    Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "You aren't cool.",
                    Toast.LENGTH_SHORT).show();
        }
        coolSet();
    }

    private void coolSet(){
        Random ran = new Random();
        coolCorrect = ran.nextInt(3)+1;
    }

    private void spawnImage(){

        if(imageNum == 0) {
            imageView.setImageResource(R.drawable.cool0);
        }else if(imageNum == 1){
            imageView.setImageResource(R.drawable.cool1);
        }else if(imageNum == 2){
            imageView.setImageResource(R.drawable.cool2);
        }else if(imageNum == 3){
            imageView.setImageResource(R.drawable.cool3);
        }else if(imageNum == 4){
            imageView.setImageResource(R.drawable.cool4);
        }else if(imageNum == 5){
            imageView.setImageResource(R.drawable.cool5);
        }else if(imageNum == 6){
            imageView.setImageResource(R.drawable.cool6);
        }else if(imageNum == 7){
            imageView.setImageResource(R.drawable.cool7);
        }else if(imageNum == 8){
            imageView.setImageResource(R.drawable.cool8);
        }else if(imageNum == 9){
            imageView.setImageResource(R.drawable.cool9);
        }
        imageNum++;
        if(imageNum > 9){
            imageNum = 0;
        }
    }


}
