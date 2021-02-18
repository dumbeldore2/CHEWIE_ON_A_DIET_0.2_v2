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

    public MainActivity6weightBar(@NonNull Context c, String s[] ,String s1[]) {
        super(c,R.layout.activity_main6_bar, R.id.listview_1,s);
        this.context = c;
        this.stringDatum = s;
        this.stringKilo = s1;

        stringKiloDiff = new String[stringKilo.length];
        for (int i = 0; i < stringKiloDiff.length ; i++){
            stringKiloDiff[i] += 10;
        }
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.activity_main6_bar,parent,false);
        ImageView images = row.findViewById(R.id.image_listview);

        kleurveranderaar();

        TextView a = row.findViewById(R.id.text_listvieuw_bar_1);
        TextView b = row.findViewById(R.id.text_listvieuw_bar_2);
        TextView c = row.findViewById(R.id.text_listvieuw_bar_3);

        a.setText(stringDatum[position]);
        b.setText(stringKilo[position] + " kg");
        c.setText(stringKiloDiff[position] + " kg");

        setColorToGradiant(b);

        if (Float.parseFloat(stringKiloDiff[position]) >= 0){
            c.setText("+ " + stringKiloDiff[position] + " kg");
            setColorToGradiant2(c);
        } else {
            setColorToGradiant(c);
        }

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

    public float verschil(float one, float twoo){
        float uit = one;
        uit -= twoo;
        return uit;
    }

    public void kleurveranderaar(){
        for (int i = 0; i < stringKilo.length ; i++){
            if (i == stringKilo.length -1){
                stringKiloDiff[i] = ""+verschil(Float.parseFloat(stringKilo[i]),Float.parseFloat(stringKilo[i]));
            } else {
                stringKiloDiff[i] = ""+verschil(Float.parseFloat(stringKilo[i]),Float.parseFloat(stringKilo[i+1]));
            }
        }
    }
}
