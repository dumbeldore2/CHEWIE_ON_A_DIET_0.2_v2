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

public class MainActivity18individualaccount extends AppCompatActivity {

    TextView textView1,textView2,textView3,textView4;

    ImageView imageView1,imageView2;

    DataBaseRunner dataBaseRunner;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        getWindow().setNavigationBarColor(Color.parseColor("#00688B"));
        getWindow().setStatusBarColor(Color.parseColor("#00FA9A"));


        textView1 = findViewById(R.id.text_1);
        textView2 = findViewById(R.id.text_2);
        textView3 = findViewById(R.id.text_3);
        textView4 = findViewById(R.id.text_4);

        imageView1 = findViewById(R.id.image_1);
        imageView2 = findViewById(R.id.image_2);

        dataBaseRunner = new DataBaseRunner(this);

        setTexts();
        click_fun_1();
        click_fun_2();
    }

    public Integer id(){
        Intent intent = getIntent();
        return intent.getIntExtra("id",-1);
    }

    public void setTexts(){
        textView1.setText(dataBaseRunner.getTable_1_col_2Name(id()));
        textView2.setText(dataBaseRunner.getTable_1_col_3Email(id()));
    }

    public void click_fun_1(){
        imageView1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity10account.class);

                dataBaseRunner.updateAllLinesToOff();
                dataBaseRunner.updateOneLineToOn(id());

                Pair[] pairs = new Pair[10];
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
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity18individualaccount.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }

    public void click_fun_2(){
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView2.setOnClickListener(new View.OnClickListener() {
                    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getApplicationContext(), MainActivity17accounts.class);

                        Pair[] pairs = new Pair[7];
                        pairs[0] = new Pair<View,String>(textView4,"1");
                        pairs[1] = new Pair<View,String>(textView4,"2");
                        pairs[2] = new Pair<View,String>(textView4,"3");
                        pairs[3] = new Pair<View,String>(textView4,"4");
                        pairs[4] = new Pair<View,String>(textView4,"5");
                        pairs[5] = new Pair<View,String>(textView4,"6");
                        pairs[6] = new Pair<View,String>(textView4,"7");
                        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity18individualaccount.this, pairs);

                        startActivity(intent,options.toBundle());
                    }
                });
            }
        });
    }
}