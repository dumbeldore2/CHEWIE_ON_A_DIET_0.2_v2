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

public class MainActivity7foodBar extends ArrayAdapter<String> {
    Context context;
    String stringNaam[];
    String stringMaker[];
    String stringCal[];

    public MainActivity7foodBar(@NonNull Context c, String s[] ,String s1[] ,String s2[]) {
        super(c,R.layout.activity_main7_bar, R.id.listview_1,s);
        this.context = c;
        this.stringNaam = s;
        this.stringMaker = s1;
        this.stringCal = s2;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.activity_main7_bar, parent, false);
        ImageView images = row.findViewById(R.id.image_listview);

        TextView a = row.findViewById(R.id.list_item_text_1);
        TextView b = row.findViewById(R.id.list_item_text_2);
        TextView c = row.findViewById(R.id.list_item_text_3);
        TextView d = row.findViewById(R.id.list_item_text_4);

        a.setText(position +"");
        b.setText(stringNaam[position]);
        c.setText(stringMaker[position]);
        d.setText(stringCal[position]);

        setColorToGradiant(b);
        setColorToGradiant(c);
        setColorToGradiant(d);

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
}
