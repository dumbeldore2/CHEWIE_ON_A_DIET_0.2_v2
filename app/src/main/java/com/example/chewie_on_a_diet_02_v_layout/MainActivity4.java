package com.example.chewie_on_a_diet_02_v_layout;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class MainActivity4 extends AppCompatActivity {

    ImageView imageView1,imageView2;

    TextView textView1,textView2,textView3,textView4;

    LineChart lineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        imageView1 = findViewById(R.id.image_1);
        imageView2 = findViewById(R.id.image_2);

        textView1 = findViewById(R.id.text_1);
        textView2 = findViewById(R.id.text_2);
        textView3 = findViewById(R.id.text_3);
        textView4 = findViewById(R.id.text_4);

        lineChart = findViewById(R.id.line_chart);

        ArrayList<Entry> yvalues = new ArrayList<>();

        yvalues.add(new Entry(0,10));
        yvalues.add(new Entry(1,50));
        yvalues.add(new Entry(2,10));
        yvalues.add(new Entry(3,10));
        yvalues.add(new Entry(4,90));
        yvalues.add(new Entry(5,10));
        yvalues.add(new Entry(6,10));
        yvalues.add(new Entry(7,-100));
        yvalues.add(new Entry(8,-300));
        yvalues.add(new Entry(9,0));

        LineDataSet lineDataSet = new LineDataSet(yvalues, "Data set 1");

        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.background_2);

        lineChart.setHighlightPerDragEnabled(false);
        lineChart.setHighlightPerTapEnabled(false);
        lineDataSet.setDrawCircleHole(false);
        lineDataSet.setDrawCircles(false);
        lineDataSet.setColor(Color.rgb(0,250,154));
        lineDataSet.setMode(LineDataSet.Mode.CUBIC_BEZIER);

        lineDataSet.setDrawFilled(true);
        lineDataSet.setFillDrawable(drawable);
        XAxis xas = lineChart.getXAxis();
        xas.setPosition(XAxis.XAxisPosition.BOTTOM);
        xas.setDrawGridLines(false);
        xas.setEnabled(true);

        YAxis yas = lineChart.getAxisRight();
        yas.setDrawGridLines(false);
        yas.setEnabled(false);

        YAxis yas2 = lineChart.getAxisLeft();
        yas2.setDrawGridLines(false);

        ArrayList<ILineDataSet> dataSets = new ArrayList<>();
        dataSets.add(lineDataSet);

        LineData data = new LineData(dataSets);

        lineChart.setData(data);

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
                Intent intent = new Intent(getApplicationContext(),MainActivity2.class);

                Pair[] pairs = new Pair[28];
                pairs[0] = new Pair<View,String>(textView3,"1_1");
                pairs[1] = new Pair<View,String>(textView3,"1_2");
                pairs[2] = new Pair<View,String>(textView3,"1_3");
                pairs[3] = new Pair<View,String>(textView3,"1_4");
                pairs[4] = new Pair<View,String>(textView3,"1_5");
                pairs[5] = new Pair<View,String>(textView3,"1_6");
                pairs[6] = new Pair<View,String>(textView3,"1_7");
                pairs[7] = new Pair<View,String>(textView3,"1_8");
                pairs[8] = new Pair<View,String>(textView3,"1_9");
                pairs[9] = new Pair<View,String>(textView3,"1_10");
                pairs[10] = new Pair<View,String>(textView3,"1_11");
                pairs[11] = new Pair<View,String>(textView3,"1_12");
                pairs[12] = new Pair<View,String>(textView3,"1_13");
                pairs[13] = new Pair<View,String>(textView3,"1_14");
                pairs[14] = new Pair<View,String>(textView3,"1_15");
                pairs[15] = new Pair<View,String>(textView3,"1_16");
                pairs[16] = new Pair<View,String>(textView3,"1_17");
                pairs[17] = new Pair<View,String>(textView3,"1_18");
                pairs[18] = new Pair<View,String>(textView3,"1_19");
                pairs[19] = new Pair<View,String>(textView3,"1_2.1");
                pairs[20] = new Pair<View,String>(textView3,"1_4.1");
                pairs[21] = new Pair<View,String>(textView3,"1_6.1");
                pairs[22] = new Pair<View,String>(textView3,"1_8.1");
                pairs[23] = new Pair<View,String>(textView3,"1_10.1");
                pairs[24] = new Pair<View,String>(textView3,"1_12.1");
                pairs[25] = new Pair<View,String>(textView3,"1_14.1");
                pairs[26] = new Pair<View,String>(textView3,"1_16.1");
                pairs[27] = new Pair<View,String>(textView3,"1_18.1");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity4.this, pairs);

                startActivity(intent,options.toBundle());
            }
        });
    }

    public void click_fun_2(){
        imageView2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity5.class);


                Pair[] pairs = new Pair[12];
                pairs[0] = new Pair<View,String>(textView4,"3_1");
                pairs[1] = new Pair<View,String>(textView4,"3_2");
                pairs[2] = new Pair<View,String>(textView4,"3_3");
                pairs[3] = new Pair<View,String>(textView4,"3_4");
                pairs[4] = new Pair<View,String>(textView4,"3_5");
                pairs[5] = new Pair<View,String>(textView4,"3_6");
                pairs[6] = new Pair<View,String>(textView4,"3_7");
                pairs[7] = new Pair<View,String>(textView4,"3_8");
                pairs[8] = new Pair<View,String>(textView4,"3_9");
                pairs[9] = new Pair<View,String>(textView4,"3_10");
                pairs[10] = new Pair<View,String>(textView4,"3_11");
                pairs[11] = new Pair<View,String>(textView4,"3_12");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity4.this, pairs);

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