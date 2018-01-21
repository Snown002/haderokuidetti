package com.example.tech.tt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    ImageView imageview;
    int count = 0;
    int count2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        imageview = findViewById(R.id.imageview);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count +5;
                Toast.makeText(MainActivity.this,"5Wを発電したよ！",Toast.LENGTH_SHORT).show();
                text.setText(count+"W");
                imageview.setImageResource(R.drawable.minideti01);
                int pattern = count2 % 4;
                if (pattern==0) {
                    imageview.setImageResource(R.drawable.minideti02);
                } else if (pattern==1) {
                    imageview.setImageResource(R.drawable.minideti03);
                } else if (pattern==2) {
                    imageview.setImageResource(R.drawable.minideti04);
                } else if (pattern==3){
                    imageview.setImageResource(R.drawable.minideti01);
                }
                count2 = count2+ 1;

            }
        });
    }
}
