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
    ImageView imageview5;
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
                                }else if(count > 2000 && count<=3000){
                                    count=count+5;
                                    text.setText("総発電量："+count+"W");
                                    setToast();
                                }else if(count > 3000 && count<=5000){
                                    count=count+8;
                                    text.setText("総発電量："+count+"W");
                                    setToast();
                                }else if(count > 5000){
                                    count=count+10;
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
                Toast.makeText(MainActivity.this,"青森りんごは日本一の生産量！",Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.appppp);
                count3++;
                removeHandler();
                init(900);
            }
        } else if (count3 == 1) {
            if(count>=200){
                Toast.makeText(MainActivity.this,"熟成にんにく黒ニンニク！",Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.n);
                count3++;
                removeHandler();
                init(800);
            }
        } else if (count3 == 2) {
            if(count>=300){
                Toast.makeText(MainActivity.this,"ホタテ保護のために植樹祭なんてのもあるぞ！",Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.h);
                count3++;
                removeHandler();
                init(700);
            }
        } else if (count3 == 3) {
            if(count>=400){
                Toast.makeText(MainActivity.this,"煮干しラーメンが盛んだぞ！",Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.rame);
                count3++;
                removeHandler();
                init(600);
            }
        } else if (count3 == 4) {
            if(count>=500){
                Toast.makeText(MainActivity.this,"温泉は色々あるぞ！朝湯行こうぜ！",Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.f);
                count3++;
                removeHandler();
                init(500);
            }
        } else if (count3 == 5) {
            if(count>=600){
                Toast.makeText(MainActivity.this,"弘前城桜は日本一とも言われるぞ！",Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.t);
                count3++;
            }
        } else if (count3 == 6) {
            if(count>=700){
                Toast.makeText(MainActivity.this,"ホワイトインパルスによる除雪は圧巻だ！",Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.snow);
                count3++;
            }
        } else if (count3 == 7) {
            if(count>=800){
                Toast.makeText(MainActivity.this,"酒をいっぱい出せ！",Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.r);
                count3++;
            }
        } else if (count3 == 8) {
            if(count>=900){
                Toast.makeText(MainActivity.this,"太宰治は五所川原出身だ！",Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.daz);
                count3++;
            }
        } else if (count3 == 9) {
            if (count >= 1000) {
                Toast.makeText(MainActivity.this, "福地ホワイトだ！粒が大きくおいしい！", Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.hw);
                count3++;
            }
        } else if (count3 == 10) {
            if (count >= 1100) {
                Toast.makeText(MainActivity.this, "版画家・棟方志功！", Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.mu);
                count3++;
            }
        } else if (count3 == 11) {
            if (count >= 1200) {
                Toast.makeText(MainActivity.this, "醤油は煮干し、味噌はにんにく！そんなイメージもあるね！", Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.rame);
                count3++;
            }
        } else if (count3 == 12) {
            if (count >= 1300) {
                Toast.makeText(MainActivity.this, "412,000 tの生産量！", Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.appppp);
                count3++;
            }
        } else if (count3 == 13) {
            if (count >= 1400) {
                Toast.makeText(MainActivity.this, "S-アリルシステイン数倍で病気予防！", Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.n);
                    count3++;
            }
        } else if (count3 == 14) {
            if (count >= 1500) {
                Toast.makeText(MainActivity.this, "ホタテもいいが貝焼き味噌もうまいぞ！", Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.h);
                count3++;
            }
        } else if (count3 == 15) {
            if (count >= 1600) {
                Toast.makeText(MainActivity.this, "煮干しはたまにえぐいがうまくいくと独特の風味にはまる！", Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.rame);
                count3++;
            }
        } else if (count3 == 16) {
            if (count >= 1700) {
                Toast.makeText(MainActivity.this, "酸ヶ湯という酸性温泉はなんと混浴だ！", Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.f);
                count3++;
            }
        } else if (count3 == 17) {
            if (count >= 1800) {
                Toast.makeText(MainActivity.this, "ソメイヨシノは日本での品種改良で生まれたぞ！", Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.t);
                count3++;
            }
        } else if (count3 == 18) {
            if (count >= 1900) {
                Toast.makeText(MainActivity.this, "和訳:みんな青森ワッツが大好き！", Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.snow);
                count3++;
            }
        } else if (count3 == 19) {
            if (count >= 2000) {
                Toast.makeText(MainActivity.this, "Come together right now go! 【Go! Wat’s】", Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.r);
                count3++;
            }
        } else if (count3 == 20) {
            if (count >= 2100) {
                Toast.makeText(MainActivity.this, "S-アリルシステイン四倍、疲労回復！", Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.daz);
                count3++;
            }
        } else if (count3 == 21) {
            if (count >= 2200) {
                Toast.makeText(MainActivity.this, "Dancing to the love Aomori Wat’s", Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.hw);
                count3++;
            }
        } else if (count3 == 22) {
            if (count >= 2300) {
                Toast.makeText(MainActivity.this, "和訳:ワッツへの愛に合わせて踊って！", Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.mu);
                count3++;
                }
        } else if (count3 == 23) {
            if (count >= 2400) {
                Toast.makeText(MainActivity.this, "Shake it up !", Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.r);
                count3++;
            }
        } else if (count3 == 24) {
            if (count >= 2500) {
                Toast.makeText(MainActivity.this, "和訳:さあさ急いで", Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.appppp);
                count3++;
            }
        } else if (count3 == 25) {
            if (count >= 2600) {
                Toast.makeText(MainActivity.this, "Make a noise Here we go! 【Go! Wat’s】", Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.n);
                count3++;
            }
        } else if (count3 == 26) {
            if (count >= 2700) {
                Toast.makeText(MainActivity.this, "和訳:声を張り上げ、さあ行こう！", Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.h);
                count3++;
            }
        } else if (count3 == 27) {
            if (count >= 2800) {
                Toast.makeText(MainActivity.this, "たんげだば待ってだじゃ", Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.rame);
                count3++;
            }
        } else if (count3 == 28) {
            if (count >= 2900) {
                Toast.makeText(MainActivity.this, "わも なも だもかも", Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.f);
                count3++;
            }
        } else if (count3 == 29) {
            if (count >= 3000) {
                Toast.makeText(MainActivity.this, "Tip off！ Tip off ！Wow Wow", Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.t);
                count3++;
            }
        } else if (count3 == 30) {
            if (count >= 3100) {
                Toast.makeText(MainActivity.this, "和訳:ワッツへの愛に合わせて踊れ", Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.snow);
                count3++;
            }
        } else if (count3 == 31) {
            if (count >= 32) {
                Toast.makeText(MainActivity.this, "Shake it up !", Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.r);
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
        imageview5 = findViewById(R.id.imageView5);
        imageview5.setImageResource(R.drawable.baseball_coat);


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
