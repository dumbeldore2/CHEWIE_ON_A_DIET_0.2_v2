package com.example.chewie_on_a_diet_02_v_layout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity20boolean extends AppCompatActivity {

    ImageView imageView1,imageView2,imageView3;

    TextView textView3,textView4,textView5;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        getWindow().setNavigationBarColor(Color.parseColor("#00688B"));
        getWindow().setStatusBarColor(Color.parseColor("#00FA9A"));

        imageView1 = findViewById(R.id.image_1);
        imageView2 = findViewById(R.id.image_2);
        imageView3 = findViewById(R.id.image_3);

        textView3 = findViewById(R.id.text_3);
        textView4 = findViewById(R.id.text_4);
        textView5 = findViewById(R.id.text_5);

        click_fun_1();
        taskMaster();
    }

    public int getIntentTask(){
        int uit = 0;
        Intent intent;
        intent = getIntent();
        uit = intent.getIntExtra("task",-1);
        return uit;
    }

    public void click_fun_1(){
        imageView1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity2dashboard.class);

                Pair[] pairs = new Pair[28];
                pairs[0] = new Pair<View,String>(textView3,"1");
                pairs[1] = new Pair<View,String>(textView3,"2");
                pairs[2] = new Pair<View,String>(textView3,"3");
                pairs[3] = new Pair<View,String>(textView3,"4");
                pairs[4] = new Pair<View,String>(textView3,"5");
                pairs[5] = new Pair<View,String>(textView3,"6");
                pairs[6] = new Pair<View,String>(textView3,"7");
                pairs[7] = new Pair<View,String>(textView3,"8");
                pairs[8] = new Pair<View,String>(textView3,"9");
                pairs[9] = new Pair<View,String>(textView3,"10");
                pairs[10] = new Pair<View,String>(textView3,"11");
                pairs[11] = new Pair<View,String>(textView3,"12");
                pairs[12] = new Pair<View,String>(textView3,"13");
                pairs[13] = new Pair<View,String>(textView3,"14");
                pairs[14] = new Pair<View,String>(textView3,"15");
                pairs[15] = new Pair<View,String>(textView3,"16");
                pairs[16] = new Pair<View,String>(textView3,"17");
                pairs[17] = new Pair<View,String>(textView3,"18");
                pairs[18] = new Pair<View,String>(textView3,"19");
                pairs[19] = new Pair<View,String>(textView3,"2.1");
                pairs[20] = new Pair<View,String>(textView3,"4.1");
                pairs[21] = new Pair<View,String>(textView3,"6.1");
                pairs[22] = new Pair<View,String>(textView3,"8.1");
                pairs[23] = new Pair<View,String>(textView3,"10.1");
                pairs[24] = new Pair<View,String>(textView3,"12.1");
                pairs[25] = new Pair<View,String>(textView3,"14.1");
                pairs[26] = new Pair<View,String>(textView3,"16.1");
                pairs[27] = new Pair<View,String>(textView3,"18.1");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity20boolean.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void click_fun_2_0() {

        Intent intent = new Intent(getApplicationContext(), MainActivity14makeactivityobject.class);

        Pair[] pairs = new Pair[14];
        pairs[0] = new Pair<View, String>(textView4, "1");
        pairs[1] = new Pair<View, String>(textView4, "2");
        pairs[2] = new Pair<View, String>(textView4, "3");
        pairs[3] = new Pair<View, String>(textView4, "4");
        pairs[4] = new Pair<View, String>(textView4, "5");
        pairs[5] = new Pair<View, String>(textView4, "6");
        pairs[6] = new Pair<View, String>(textView4, "7");
        pairs[7] = new Pair<View, String>(textView4, "8");
        pairs[8] = new Pair<View, String>(textView4, "9");
        pairs[9] = new Pair<View, String>(textView4, "10");
        pairs[10] = new Pair<View, String>(textView4, "11");
        pairs[11] = new Pair<View, String>(textView4, "12");
        pairs[12] = new Pair<View, String>(textView4, "13");
        pairs[13] = new Pair<View, String>(textView4, "14");
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity20boolean.this, pairs);

        startActivity(intent, options.toBundle());

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void click_fun_2_1() {

        Intent intent = new Intent(getApplicationContext(), MainActivity13makedrinkobject.class);

        Pair[] pairs = new Pair[20];
        pairs[0] = new Pair<View, String>(textView4, "1");
        pairs[1] = new Pair<View, String>(textView4, "2");
        pairs[2] = new Pair<View, String>(textView4, "3");
        pairs[3] = new Pair<View, String>(textView4, "4");
        pairs[4] = new Pair<View, String>(textView4, "5");
        pairs[5] = new Pair<View, String>(textView4, "6");
        pairs[6] = new Pair<View, String>(textView4, "7");
        pairs[7] = new Pair<View, String>(textView4, "8");
        pairs[8] = new Pair<View, String>(textView4, "9");
        pairs[9] = new Pair<View, String>(textView4, "10");
        pairs[10] = new Pair<View, String>(textView4, "11");
        pairs[11] = new Pair<View, String>(textView4, "12");
        pairs[12] = new Pair<View, String>(textView4, "13");
        pairs[13] = new Pair<View, String>(textView4, "14");
        pairs[14] = new Pair<View, String>(textView4, "15");
        pairs[15] = new Pair<View, String>(textView4, "16");
        pairs[16] = new Pair<View, String>(textView4, "17");
        pairs[17] = new Pair<View, String>(textView4, "18");
        pairs[18] = new Pair<View, String>(textView4, "19");
        pairs[19] = new Pair<View, String>(textView4, "20");
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity20boolean.this, pairs);

        startActivity(intent, options.toBundle());

    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void click_fun_2_2() {

        Intent intent = new Intent(getApplicationContext(), MainActivity12makefoodobject.class);

        Pair[] pairs = new Pair[20];
        pairs[0] = new Pair<View, String>(textView4, "1");
        pairs[1] = new Pair<View, String>(textView4, "2");
        pairs[2] = new Pair<View, String>(textView4, "3");
        pairs[3] = new Pair<View, String>(textView4, "4");
        pairs[4] = new Pair<View, String>(textView4, "5");
        pairs[5] = new Pair<View, String>(textView4, "6");
        pairs[6] = new Pair<View, String>(textView4, "7");
        pairs[7] = new Pair<View, String>(textView4, "8");
        pairs[8] = new Pair<View, String>(textView4, "9");
        pairs[9] = new Pair<View, String>(textView4, "10");
        pairs[10] = new Pair<View, String>(textView4, "11");
        pairs[11] = new Pair<View, String>(textView4, "12");
        pairs[12] = new Pair<View, String>(textView4, "13");
        pairs[13] = new Pair<View, String>(textView4, "14");
        pairs[14] = new Pair<View, String>(textView4, "15");
        pairs[15] = new Pair<View, String>(textView4, "16");
        pairs[16] = new Pair<View, String>(textView4, "17");
        pairs[17] = new Pair<View, String>(textView4, "18");
        pairs[18] = new Pair<View, String>(textView4, "19");
        pairs[19] = new Pair<View, String>(textView4, "20");
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity20boolean.this, pairs);

        startActivity(intent, options.toBundle());

    }

    public void taskMaster(){
        imageView2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                if (getIntentTask() == 1){
                    click_fun_2_0();
                } else {
                    if (getIntentTask() == 2){
                        click_fun_2_1();
                    } else {
                        if (getIntentTask() == 3){
                            click_fun_2_2();
                        }
                    }
                }
            }
        });
    }
}