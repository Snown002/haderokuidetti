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
            if(count>=18){
                Toast.makeText(MainActivity.this,"青森には18の大学があるぞ！",Toast.LENGTH_SHORT).show();
                count3++;
                removeHandler();
                init(900);
            }
        } else if (count3 == 1) {
            if(count>=76){
                Toast.makeText(MainActivity.this,"青森県観光物産館アスパムの高さは76ｍだ！",Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.as2);
                count3++;
                removeHandler();
                init(800);
            }
        } else if (count3 == 2) {
            if(count>=100){
                Toast.makeText(MainActivity.this,"青森りんごの生産量は日本一！",Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.appppp);
                count3++;
                removeHandler();
                init(700);
            }
        } else if (count3 == 3) {
            if(count>=200){
                Toast.makeText(MainActivity.this,"黒ニンニクは熟成されたにんにくだ！",Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.n);
                count3++;
                removeHandler();
                init(600);
            }
        } else if (count3 == 4) {
            if(count>=299){
                Toast.makeText(MainActivity.this,"青森の風力発電機は299基あるぞ！",Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.wind);
                count3++;
                removeHandler();
                init(500);
            }
        } else if (count3 == 5) {
            if(count>=400){
                Toast.makeText(MainActivity.this,"ホタテのための植樹祭！" ,Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.h);
                count3++;
            }
        } else if (count3 == 6) {
            if(count>=500){
                Toast.makeText(MainActivity.this,"青森といえば煮干しラーメン！",Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.rame);
                count3++;
            }
        } else if (count3 == 7) {
            if(count>=566){
                Toast.makeText(MainActivity.this,"酸ヶ湯の最大積雪量は566㎝！",Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.snow);
                count3++;
            }
        } else if (count3 == 8) {
            if(count>=600){
                Toast.makeText(MainActivity.this,"酸ヶ湯は名の通り酸性の温泉だ！",Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.f);
                count3++;
            }
        } else if (count3 == 9) {
            if (count >= 700) {
                Toast.makeText(MainActivity.this, "弘前城の桜は日本一！", Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.t);
                count3++;
            }
        } else if (count3 == 10) {
            if (count >= 800) {
                Toast.makeText(MainActivity.this, "海の日と聖徳公園は深いかかわりがあるぞ！", Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.s1s);
                count3++;
            }
        } else if (count3 == 11) {
            if (count >= 900) {
                Toast.makeText(MainActivity.this, "青森は太陽光発電も推進しているぞ！", Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.sun);
                count3++;
            }
        } else if (count3 == 12) {
            if (count >= 1000) {
                Toast.makeText(MainActivity.this, "福地ホワイトだ！甘いぞ！高級品だ！", Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.hw);
                count3++;
            }
        } else if (count3 == 13) {
            if (count >= 1084) {
                Toast.makeText(MainActivity.this, "青森には1084の温泉があるらしい！", Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.f);
                    count3++;
            }
        } else if (count3 == 14) {
            if (count >= 1100) {
                Toast.makeText(MainActivity.this, "太宰治は五所川原出身だ！", Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.daz);
                count3++;
            }
        } else if (count3 == 15) {
            if (count >= 1400) {
                Toast.makeText(MainActivity.this, "アスパム二階にはシアターがある！大迫力の20分を楽しもう！" , Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.as2);
                count3++;
            }
        } else if (count3 == 16) {
            if (count >= 1500) {
                Toast.makeText(MainActivity.this, "青森の日本海側はいつも強風！いい発電所だ！", Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.wind);
                count3++;
            }
        } else if (count3 == 17) {
            if (count >= 1590) {
                Toast.makeText(MainActivity.this, "1590年、津軽為信が津軽統一を成したぞ！", Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.t);
                count3++;
            }
        } else if (count3 == 18) {
            if (count >= 1600) {
                Toast.makeText(MainActivity.this, "酒をいっぱい出せ！いっぱい出せ！", Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.r);
                count3++;
            }
        } else if (count3 == 19) {
            if (count >= 1611) {
                Toast.makeText(MainActivity.this, "1611年弘前城が完成！司馬遼太郎は日本七大名城と紹介している！", Toast.LENGTH_SHORT).show();
                count3++;
            }
        } else if (count3 == 20) {
            if (count >= 1623) {
                Toast.makeText(MainActivity.this, "1623年に三内丸山遺跡の存在は既に知られていたぞ！", Toast.LENGTH_SHORT).show();
                count3++;
            }
        } else if (count3 == 21) {
            if (count >= 1700) {
                Toast.makeText(MainActivity.this, "日本海側には風力発電に必要な強さの風が吹いている！", Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.wind);
                count3++;
            }
        } else if (count3 == 22) {
            if (count >= 1800) {
                Toast.makeText(MainActivity.this, "棟方志功は川上澄生の『初夏の風』を見て版画家になることを決意！", Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.mu);
                count3++;
            }
        } else if (count3 == 23) {
            if (count >= 1875) {
                Toast.makeText(MainActivity.this, "1875年、県庁構内に初めてりんごが植樹された！", Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.appppp);
                count3++;
                }
        } else if (count3 == 24) {
            if (count >= 1903) {
                Toast.makeText(MainActivity.this, "1903年、棟方志功は青森に生まれた！", Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.mu);
                count3++;
            }
        } else if (count3 == 25) {
            if (count >= 1909) {
                Toast.makeText(MainActivity.this, "1909年・太宰治は青森に生まれたぞ！", Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.daz);
                count3++;
            }
        } else if (count3 == 26) {
            if (count >= 1987) {
                Toast.makeText(MainActivity.this, "1987年、ヒラメが県魚になったぞ！", Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.hi);
                count3++;
            }
        } else if (count3 == 27) {
            if (count >= 1990) {
                Toast.makeText(MainActivity.this, "1990年、青森シャモロックが開発されたぞ！", Toast.LENGTH_SHORT).show();
                count3++;
            }
        } else if (count3 == 28) {
            if (count >= 1992) {
                Toast.makeText(MainActivity.this, "1992年、三内丸山遺跡が見つかったぞ！", Toast.LENGTH_SHORT).show();
                count3++;
            }
        } else if (count3 == 29) {
            if (count >= 1995) {
                Toast.makeText(MainActivity.this, "1995年、海の日が制定されたぞ！" , Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.s1s);
                count3++;
            }
        } else if (count3 == 30) {
            if (count >= 2006) {
                Toast.makeText(MainActivity.this, "2006年、黒にんにくの魅力を弘前大学が発表！", Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.n);
                count3++;
            }
        } else if (count3 == 31) {
            if (count >= 2010) {
                Toast.makeText(MainActivity.this, "2010年、ホタテが大量死！", Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.h);
                count3++;
            }
        } else if (count3 == 32) {
            if (count >= 2100) {
                Toast.makeText(MainActivity.this, "ヒラメとカレイの見分け方はさかなクンが発見したぞ！", Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.hi);
                count3++;
            }
        } else if (count3 == 33) {
            if (count >= 2200) {
                Toast.makeText(MainActivity.this, "アップルファクトリーという場所もあるぞ！", Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.appppp);
                count3++;
            }
        } else if (count3 == 34) {
            if (count >= 2300) {
                Toast.makeText(MainActivity.this, "青森ニンニクは寒さでうまくなる！", Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.n);
                count3++;
            }
        } else if (count3 == 35) {
            if (count >= 2400) {
                Toast.makeText(MainActivity.this, "ニンニクを味噌ラーメンにイン！", Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.rame);
                count3++;
            }
        } else if (count3 == 36) {
            if (count >= 2500) {
                Toast.makeText(MainActivity.this, "朝湯は青森以外少ないらしい！" , Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.f);
                count3++;
            }
        } else if (count3 == 37) {
            if (count >= 2600) {
                Toast.makeText(MainActivity.this, "ソメイヨシノは日本での品種改良で生まれたぞ！", Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.t);
                count3++;
            }
        } else if (count3 == 38) {
            if (count >= 2700) {
                Toast.makeText(MainActivity.this, "青森は積雪量世界一！", Toast.LENGTH_SHORT).show();
                imageview2.setImageResource(R.drawable.snow);
                count3++;
            }
        } else if (count3 == 39) {
            if (count >= 2800) {
                Toast.makeText(MainActivity.this, "白いにんにく福地ホワイト！", Toast.LENGTH_SHORT).show();
                imageview3.setImageResource(R.drawable.hw);
                count3++;
            }
        } else if (count3 == 40) {
            if (count >= 2900) {
                Toast.makeText(MainActivity.this, "太宰治はしじみラーメンが好きだったらしい！" , Toast.LENGTH_SHORT).show();
                imageview4.setImageResource(R.drawable.daz);
                count3++;
            }
        } else if (count3 == 41) {
            if (count >= 13500) {
                Toast.makeText(MainActivity.this, "13500tのにんにくが青森で作られているぞ！", Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.n);
                imageview2.setImageResource(R.drawable.hw);
                imageview3.setImageResource(R.drawable.hw);
                imageview4.setImageResource(R.drawable.n);
                count3++;
            }
        } else if (count3 == 42) {
            if (count >= 53000) {
                Toast.makeText(MainActivity.this, "青森ヒバの育つ面積は53000ヘクタール！", Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.tr);
                imageview2.setImageResource(R.drawable.tr);
                imageview3.setImageResource(R.drawable.tr);
                imageview4.setImageResource(R.drawable.tr);
                count3++;
            }
        } else if (count3 == 43) {
            if (count >= 200011) {
                Toast.makeText(MainActivity.this, "2000年11月、三内丸山遺跡が国特別史跡に指定される！", Toast.LENGTH_SHORT).show();
                count3++;
            }
        } else if (count3 == 44) {
            if (count >= 412000) {
                Toast.makeText(MainActivity.this, "青森のりんご総生産量は412000t！", Toast.LENGTH_SHORT).show();
                imageview1.setImageResource(R.drawable.appppp);
                imageview2.setImageResource(R.drawable.appppp);
                imageview3.setImageResource(R.drawable.appppp);
                imageview4.setImageResource(R.drawable.appppp);
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
