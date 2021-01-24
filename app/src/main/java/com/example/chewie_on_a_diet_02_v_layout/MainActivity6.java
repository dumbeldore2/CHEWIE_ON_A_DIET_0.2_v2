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

public class MainActivity6 extends AppCompatActivity {

    ImageView imageView1;

    TextView textView1,textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        imageView1 = findViewById(R.id.dashboard);

        textView1 = findViewById(R.id.text_1);
        textView2 = findViewById(R.id.text_2);
        textView3 = findViewById(R.id.dashboard_word);

        click_fun_1();

        // setColorToGradiant(textView1);
        // setColorToGradiant(textView2);
        // setColorToGradiant(textView3);
    }



    public void click_fun_1(){
        imageView1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);

                Pair[] pairs = new Pair[28];
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
                pairs[19] = new Pair<View,String>(imageView1,"1_2.1");
                pairs[20] = new Pair<View,String>(imageView1,"1_4.1");
                pairs[21] = new Pair<View,String>(imageView1,"1_6.1");
                pairs[22] = new Pair<View,String>(imageView1,"1_8.1");
                pairs[23] = new Pair<View,String>(imageView1,"1_10.1");
                pairs[24] = new Pair<View,String>(imageView1,"1_12.1");
                pairs[25] = new Pair<View,String>(imageView1,"1_14.1");
                pairs[26] = new Pair<View,String>(imageView1,"1_16.1");
                pairs[27] = new Pair<View,String>(imageView1,"1_18.1");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity6.this, pairs);

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