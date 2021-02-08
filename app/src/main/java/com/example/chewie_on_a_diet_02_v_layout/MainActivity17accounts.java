package com.example.chewie_on_a_diet_02_v_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ListView;

public class MainActivity17accounts extends AppCompatActivity {
    ListView listView;

    MainActivity17accountsBar mainActivity17accountsBar;

    String data[] = {"Y","F"};
    int data1[] = {R.drawable.but_15,R.drawable.but_16};
    String data3[] = {"off","on"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        );

        listView = findViewById(R.id.listview_1);

        mainActivity17accountsBar = new MainActivity17accountsBar(this,data,data3,data1);
        listView.setAdapter(mainActivity17accountsBar);

    }
}