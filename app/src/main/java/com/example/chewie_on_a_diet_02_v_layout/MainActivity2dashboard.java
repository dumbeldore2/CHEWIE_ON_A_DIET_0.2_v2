package com.example.chewie_on_a_diet_02_v_layout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2dashboard extends AppCompatActivity {

    ImageView imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9;
    TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,textView10,
            textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19;
    DataBaseRunner dataBaseRunner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        imageView1 = findViewById(R.id.rectangle_1_page_2);
        imageView2 = findViewById(R.id.rectangle_3_page_2);
        imageView3 = findViewById(R.id.rectangle_2_page_2);
        imageView4 = findViewById(R.id.rectangle_4_page_2);
        imageView5 = findViewById(R.id.rectangle_6_page_2);
        imageView6 = findViewById(R.id.rectangle_5_page_2);
        imageView7 = findViewById(R.id.rectangle_7_page_2);
        imageView8 = findViewById(R.id.rectangle_9_page_2);
        imageView9 = findViewById(R.id.rectangle_8_page_2);

        textView1 = findViewById(R.id.titel_page_2);
        textView2 = findViewById(R.id.rectangle_1_page_2_letter);
        textView3 = findViewById(R.id.rectangle_2_page_2_letter);
        textView4 = findViewById(R.id.rectangle_3_page_2_letter);
        textView5 = findViewById(R.id.rectangle_4_page_2_letter);
        textView6 = findViewById(R.id.rectangle_5_page_2_letter);
        textView7 = findViewById(R.id.rectangle_6_page_2_letter);
        textView8 = findViewById(R.id.rectangle_7_page_2_letter);
        textView9 = findViewById(R.id.rectangle_8_page_2_letter);
        textView10 = findViewById(R.id.rectangle_9_page_2_letter);
        textView11 = findViewById(R.id.rectangle_1_page_2_text);
        textView12 = findViewById(R.id.rectangle_2_page_2_text);
        textView13 = findViewById(R.id.rectangle_3_page_2_text);
        textView14 = findViewById(R.id.rectangle_4_page_2_text);
        textView15 = findViewById(R.id.rectangle_5_page_2_text);
        textView16 = findViewById(R.id.rectangle_6_page_2_text);
        textView17 = findViewById(R.id.rectangle_7_page_2_text);
        textView18 = findViewById(R.id.rectangle_8_page_2_text);
        textView19 = findViewById(R.id.rectangle_9_page_2_text);

        dataBaseRunner = new DataBaseRunner(this);
        dataBaseRunner.addToTabel1("lol");
        dataBaseRunner.addToTabel1("elo");
        dataBaseRunner.addToTabel2("elo","delhaize",50,1,"food");
        dataBaseRunner.addToTabel2("elo","delhaize",50,1,"food");

        click_1();
        click_2();
        click_3();
        click_4();
        click_5();
        click_6();
        click_7();
        click_8();
        click_9();

        //setColorToGradiant(textView1);
        //setColorToGradiant(textView2);
        //setColorToGradiant(textView3);
        //setColorToGradiant(textView4);
        //setColorToGradiant(textView5);
        //setColorToGradiant(textView6);
        //setColorToGradiant(textView7);
        // setColorToGradiant(textView8);
        // setColorToGradiant(textView9);

        //setColorToGradiant2(textView10);
        // setColorToGradiant2(textView11);
        // setColorToGradiant2(textView12);
        // setColorToGradiant2(textView13);
        // setColorToGradiant2(textView14);
        // setColorToGradiant2(textView15);
        // setColorToGradiant2(textView16);
        // setColorToGradiant2(textView17);
        // setColorToGradiant2(textView18);

        System.out.println(dataBaseRunner.IDMAKERTABLE1());
        System.out.println(dataBaseRunner.IDMAKERTABLE2());
    }

    public void click_1(){
        imageView1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity3home.class);

                Pair[] pairs = new Pair[5];
                pairs[0] = new Pair<View,String>(textView2,"1");
                pairs[1] = new Pair<View,String>(textView2,"2");
                pairs[2] = new Pair<View,String>(textView2,"3");
                pairs[3] = new Pair<View,String>(textView2,"4");
                pairs[4] = new Pair<View,String>(textView2,"5");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity2dashboard.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }

    public void click_2(){
        imageView2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity4today.class);

                Pair[] pairs = new Pair[7];
                pairs[0] = new Pair<View,String>(textView4,"1");
                pairs[1] = new Pair<View,String>(textView4,"2");
                pairs[2] = new Pair<View,String>(textView4,"3");
                pairs[3] = new Pair<View,String>(textView4,"4");
                pairs[4] = new Pair<View,String>(textView4,"5");
                pairs[5] = new Pair<View,String>(textView4,"6");
                pairs[6] = new Pair<View,String>(textView4,"7");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity2dashboard.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }
    public void click_3(){
        imageView3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity5add.class);

                Pair[] pairs = new Pair[12];
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
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity2dashboard.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }
    public void click_4(){
        imageView4.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity6weight.class);

                Pair[] pairs = new Pair[10];
                pairs[0] = new Pair<View,String>(textView5,"1");
                pairs[1] = new Pair<View,String>(textView5,"2");
                pairs[2] = new Pair<View,String>(textView5,"3");
                pairs[3] = new Pair<View,String>(textView5,"4");
                pairs[4] = new Pair<View,String>(textView5,"5");
                pairs[5] = new Pair<View,String>(textView5,"6");
                pairs[6] = new Pair<View,String>(textView5,"7");
                pairs[7] = new Pair<View,String>(textView5,"8");
                pairs[8] = new Pair<View,String>(textView5,"9");
                pairs[9] = new Pair<View,String>(textView5,"10");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity2dashboard.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }
    public void click_5(){
        imageView5.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity7food.class);

                Pair[] pairs = new Pair[7];
                pairs[0] = new Pair<View,String>(textView7,"1");
                pairs[1] = new Pair<View,String>(textView7,"2");
                pairs[2] = new Pair<View,String>(textView7,"3");
                pairs[3] = new Pair<View,String>(textView7,"4");
                pairs[4] = new Pair<View,String>(textView7,"5");
                pairs[5] = new Pair<View,String>(textView7,"6");
                pairs[6] = new Pair<View,String>(textView7,"7");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity2dashboard.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }
    public void click_6(){
        imageView6.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity8drink.class);

                Pair[] pairs = new Pair[7];
                pairs[0] = new Pair<View,String>(textView6,"1");
                pairs[1] = new Pair<View,String>(textView6,"2");
                pairs[2] = new Pair<View,String>(textView6,"3");
                pairs[3] = new Pair<View,String>(textView6,"4");
                pairs[4] = new Pair<View,String>(textView6,"5");
                pairs[5] = new Pair<View,String>(textView6,"6");
                pairs[6] = new Pair<View,String>(textView6,"7");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity2dashboard.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }
    public void click_7(){
        imageView7.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity9activity.class);

                Pair[] pairs = new Pair[7];
                pairs[0] = new Pair<View,String>(textView8,"1");
                pairs[1] = new Pair<View,String>(textView8,"2");
                pairs[2] = new Pair<View,String>(textView8,"3");
                pairs[3] = new Pair<View,String>(textView8,"4");
                pairs[4] = new Pair<View,String>(textView8,"5");
                pairs[5] = new Pair<View,String>(textView8,"6");
                pairs[6] = new Pair<View,String>(textView8,"7");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity2dashboard.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }
    public void click_8(){
        imageView8.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity10account.class);

                Pair[] pairs = new Pair[10];
                pairs[0] = new Pair<View,String>(textView10,"1");
                pairs[1] = new Pair<View,String>(textView10,"2");
                pairs[2] = new Pair<View,String>(textView10,"3");
                pairs[3] = new Pair<View,String>(textView10,"4");
                pairs[4] = new Pair<View,String>(textView10,"5");
                pairs[5] = new Pair<View,String>(textView10,"6");
                pairs[6] = new Pair<View,String>(textView10,"7");
                pairs[7] = new Pair<View,String>(textView10,"8");
                pairs[8] = new Pair<View,String>(textView10,"9");
                pairs[9] = new Pair<View,String>(textView10,"10");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity2dashboard.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }
    public void click_9(){
        imageView9.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity11settings.class);

                Pair[] pairs = new Pair[4];
                pairs[0] = new Pair<View,String>(textView9,"1");
                pairs[1] = new Pair<View,String>(textView9,"2");
                pairs[2] = new Pair<View,String>(textView9,"3");
                pairs[3] = new Pair<View,String>(textView9,"4");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity2dashboard.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }

    private void setColorToGradiant(TextView textView){
        TextPaint textPaint = textView.getPaint();
        float width = textPaint.measureText(textView.getText().toString());

        Shader shader = new LinearGradient(width/2,0,width/2,textView.getTextSize(),
                new int[]{
                        Color.parseColor("#00688B"),
                        Color.parseColor("#00FA9A")
                },null,Shader.TileMode.CLAMP);
        textView.getPaint().setShader(shader);
    }
    private void setColorToGradiant2(TextView textView){
        TextPaint textPaint = textView.getPaint();
        float width = textPaint.measureText(textView.getText().toString());

        Shader shader = new LinearGradient(width/2,0,width/2,textView.getTextSize(),
                new int[]{
                        Color.parseColor("#ffffff"),
                        Color.parseColor("#286086")
                },null,Shader.TileMode.CLAMP);
        textView.getPaint().setShader(shader);
    }
}