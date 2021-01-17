package com.example.chewie_on_a_diet_02_v_layout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class MainActivity8 extends AppCompatActivity {

    ImageView imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        imageView1 = findViewById(R.id.dashboard);

        click_fun_1();
    }



    public void click_fun_1(){
        imageView1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);

                Pair[] pairs = new Pair[19];
                pairs[0] = new Pair<View,String>(imageView1,"1_1");
                pairs[1] = new Pair<View,String>(imageView1,"1_2");
                pairs[2] = new Pair<View,String>(imageView1,"1_3");
                pairs[3] = new Pair<View,String>(imageView1,"1_4");
                pairs[4] = new Pair<View,String>(imageView1,"1_5");
                pairs[5] = new Pair<View,String>(imageView1,"1_6");
                pairs[6] = new Pair<View,String>(imageView1,"1_7");
                pairs[7] = new Pair<View,String>(imageView1,"1_8");
                pairs[8] = new Pair<View,String>(imageView1,"1_9");
                pairs[9] = new Pair<View,String>(imageView1,"1_10");
                pairs[10] = new Pair<View,String>(imageView1,"1_11");
                pairs[11] = new Pair<View,String>(imageView1,"1_12");
                pairs[12] = new Pair<View,String>(imageView1,"1_13");
                pairs[13] = new Pair<View,String>(imageView1,"1_14");
                pairs[14] = new Pair<View,String>(imageView1,"1_15");
                pairs[15] = new Pair<View,String>(imageView1,"1_16");
                pairs[16] = new Pair<View,String>(imageView1,"1_17");
                pairs[17] = new Pair<View,String>(imageView1,"1_18");
                pairs[18] = new Pair<View,String>(imageView1,"1_19");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity8.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }
}