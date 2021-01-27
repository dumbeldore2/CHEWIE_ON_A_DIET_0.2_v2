package com.example.chewie_on_a_diet_02_v_layout;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MainActivity6weightBar extends ArrayAdapter<String> {
    Context context;
    String stringDatum[];
    String stringKilo[];
    String stringKiloDiff[];

    public MainActivity6weightBar(@NonNull Context c, String s[] ,String s1[] ,String s2[]) {
        super(c,R.layout.activity_main6_bar, R.id.listview_1,s);
        this.context = c;
        this.stringDatum = s;
        this.stringKilo = s1;
        this.stringKiloDiff = s2;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.activity_main6_bar,parent,false);
        ImageView images = row.findViewById(R.id.image_listview);

        TextView a = row.findViewById(R.id.text_listvieuw_bar_1);
        TextView b = row.findViewById(R.id.text_listvieuw_bar_2);
        TextView c = row.findViewById(R.id.text_listvieuw_bar_3);

        a.setText(stringDatum[position]);
        b.setText(stringKilo[position]);
        c.setText(stringKiloDiff[position]);

        setColorToGradiant(b);
        setColorToGradiant(c);

        return row;
    }


    private void setColorToGradiant(TextView textView){
        TextPaint textPaint = textView.getPaint();
        float width = textPaint.measureText(textView.getText().toString());

        Shader shader = new LinearGradient(width/2,0,width/2,textView.getTextSize(),
                new int[]{
                        Color.parseColor("#ffffff"),
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
                        Color.parseColor("#FF0000")
                },null,Shader.TileMode.CLAMP);
        textView.getPaint().setShader(shader);
    }
}
