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
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity6weight extends AppCompatActivity {

    ImageView imageView1,imageView3;

    TextView textView1,textView2,textView3,textView6;

    ListView listView;

    MainActivity6weightBar mainActivity6weightBar;
    String data[] = {"15 Oktober 2020","15 Oktober 2010","15 Oktober 2010","15 Oktober 2010"};
    String data2[] = {"59kg","59kg","59kg","59kg"};
    String data3[] = {"-5kg","-15kg","-19kg","-15kg"};

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );
        getWindow().setNavigationBarColor(Color.parseColor("#00688B"));
        getWindow().setStatusBarColor(Color.parseColor("#00FA9A"));


        imageView1 = findViewById(R.id.image_1);
        imageView3 = findViewById(R.id.image_3);

        textView1 = findViewById(R.id.text_1);
        textView2 = findViewById(R.id.text_2);
        textView3 = findViewById(R.id.text_3);
        textView6 = findViewById(R.id.text_6);

        listView = findViewById(R.id.listview_1);

        mainActivity6weightBar = new MainActivity6weightBar(this,data,data2,data3);
        listView.setAdapter(mainActivity6weightBar);

        click_fun_1();
        click_fun_2();

        // setColorToGradiant(textView1);
        // setColorToGradiant(textView2);
        // setColorToGradiant(textView3);
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
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity6weight.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }

    public void click_fun_2(){
        imageView3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), MainActivity15makeweightobject.class);

                Pair[] pairs = new Pair[9];
                pairs[0] = new Pair<View,String>(textView6,"1");
                pairs[1] = new Pair<View,String>(textView6,"2");
                pairs[2] = new Pair<View,String>(textView6,"3");
                pairs[3] = new Pair<View,String>(textView6,"4");
                pairs[4] = new Pair<View,String>(textView6,"5");
                pairs[5] = new Pair<View,String>(textView6,"6");
                pairs[6] = new Pair<View,String>(textView6,"7");
                pairs[7] = new Pair<View,String>(textView6,"8");
                pairs[8] = new Pair<View,String>(textView6,"9");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity6weight.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }

    private void setColorToGradiant(TextView textView){
        TextPaint textPaint = textView.getPaint();
        float width = textPaint.measureText(textView.getText().toString());

        Shader shader = new LinearGradient(width/2,0,width/2,textView.getTextSize(),
                new int[]{
                        Color.parseColor("#286086"),
                        Color.parseColor("#ffffff")
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