package com.example.tech.tt;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    TextView text;
    ImageView imageview;
    ImageView imageview1;
    ImageView imageview2;
    ImageView imageview3;
    ImageView imageview4;
    TextView tapScreenTextView;
    int count = 0;
    int count2 = 0;
    int count3 = 0;
    boolean isDisp;
    android.os.Handler handler;
    Timer timer;

    private void init(int period) {
        timer = new Timer(true);
        handler = new android.os.Handler();
        timer.schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        handler.post( new Runnable(){
                            public void run(){
                                if (count <= 500) {
                                    count=count+1;
                                    text.setText("総発電量："+count+"W");
                                    setToast();
                                }else if(count > 500 && count<=1000){
                                    count=count+2;
                                    text.setText("総発電量："+count+"W");
                                    setToast();
                                }else if(count > 1000 && count<=2000){
                                    count=count+3;
                                    text.setText("総発電量："+count+"W");
                                    setToast();
                                }else if(count > 2000){
                                    count=count+5;
                                    text.setText("総発電量："+count+"W");
                                    setToast();
                                }
                            }
                        });
                    }
                }
                , 0, period   //開始遅延(何ミリ秒後に開始するか)と、周期(何ミリ秒ごとに実行するか)
        );
    }



    private void removeHandler(){
        timer.cancel();
        timer = null;
        handler.removeCallbacksAndMessages(null);
        handler = null;
    }

    private void setToast() {

        if (count3 == 0) {
            if(count>=100){
                Toast.makeText(MainActivity.this,"すごいぞ！",Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.minideti02);
                count3++;
                removeHandler();
                init(800);
            }
        } else if (count3 == 1) {
            if(count>=200){
                Toast.makeText(MainActivity.this,"すさまじいぞ！",Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.minideti02);
                count3++;
                removeHandler();
                init(600);
            }
        } else if (count3 == 2) {
            if(count>=300){
                Toast.makeText(MainActivity.this,"エクセレント！",Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.minideti02);
                count3++;
                removeHandler();
                init(500);
            }
        } else if (count3 == 3) {
            if(count>=400){
                Toast.makeText(MainActivity.this,"ワンダフル！",Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.minideti02);
                count3++;
            }
        } else if (count3 == 4) {
            if(count>=500){
                Toast.makeText(MainActivity.this,"ファンタスティック！",Toast.LENGTH_SHORT).show();
                count3++;
            }
        } else if (count3 == 5) {
            if(count>=600){
                Toast.makeText(MainActivity.this,"エキサイティング！",Toast.LENGTH_SHORT).show();
                count3++;
            }
        } else if (count3 == 6) {
            if(count>=700){
                Toast.makeText(MainActivity.this,"エクストリーム！",Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.minideti02);
                count3++;
            }
        } else if (count3 == 7) {
            if(count>=800){
                Toast.makeText(MainActivity.this,"エクスプローラー！",Toast.LENGTH_SHORT).show();
                count3++;
            }
        } else if (count3 == 8) {
            if(count>=900){
                Toast.makeText(MainActivity.this,"エクスプレス！",Toast.LENGTH_SHORT).show();
                count3++;
            }
        } else if (count3 == 9) {
            if (count >= 1000) {
                Toast.makeText(MainActivity.this, "ライトニング！", Toast.LENGTH_SHORT).show();
                count3++;
            }
        }
    }

    private void setImageview() {
        int pattern = count2 % 4;
        if (pattern == 0) {
            imageview.setImageResource(R.drawable.minideti02);
        } else if (pattern == 1) {
            imageview.setImageResource(R.drawable.minideti03);
        } else if (pattern == 2) {
            imageview.setImageResource(R.drawable.minideti04);
        } else if (pattern == 3) {
            imageview.setImageResource(R.drawable.minideti01);
        }
        count2 = count2 + 1;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        text = findViewById(R.id.text);
        imageview = findViewById(R.id.imageview);
        imageview1 = findViewById(R.id.imageView1);
        imageview2 = findViewById(R.id.imageView2);
        imageview3 = findViewById(R.id.imageView3);
        imageview4 = findViewById(R.id.imageView4);

        //Timerのセット
        init(1000);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = count + 5;
                //Toast.makeText(MainActivity.this,"5Wを発電したよ！",Toast.LENGTH_SHORT).show();
                //CustomToast.makeText(MainActivity.this,"5Wを発電したよ！", 500).show();

                setToast();

                text.setText("総発電量："+count+"W");
                imageview.setImageResource(R.drawable.minideti01);


                String message = "";
                for (int i=1; i <= count ; i++) {
                    message = message + i +"W";
                }
                //text.setText(message);

                setImageview();
        };
    });
}}
