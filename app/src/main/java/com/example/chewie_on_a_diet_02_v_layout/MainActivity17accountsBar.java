package com.example.chewie_on_a_diet_02_v_layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MainActivity17accountsBar extends ArrayAdapter<String> {
    Context context;
    String stringName[];
    String stringActivated[];
    int anInt[];
    ImageView imageView1;

    public MainActivity17accountsBar(@NonNull Context c, String s[] , String s1[], int i[]) {
        super(c,R.layout.activity_main17_bar, R.id.listview_1,s);
        this.stringName = s;
        this.stringActivated = s1;
        this.anInt = i;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row = layoutInflater.inflate(R.layout.activity_main17_bar, parent, false);
        imageView1 = row.findViewById(R.id.image_listview);

        TextView a = row.findViewById(R.id.list_item_text_1);

        a.setText(stringName[position]);
         setBackgroundTo1(stringActivated[position],imageView1);

        return row;
    }

    public void setBackgroundTo1(String activated , ImageView imageView1){
        if (activated.equals("on")){
            imageView1.setImageResource(anInt[0]);
        } else {
            if (activated.equals("off")){
                imageView1.setImageResource(anInt[1]);
            }
        }
    }

}
