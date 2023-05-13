package com.example.sample2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Setting_activity extends AppCompatActivity {
    int gridsize;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        TextView textView4=(TextView)findViewById(R.id.gridesize_4);
        TextView textView5=(TextView)findViewById(R.id.gridsize_5);
        TextView textView6=(TextView)findViewById(R.id.gridsize_6);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView4.setBackgroundResource(R.drawable.gridsize_textview_grey);
                textView5.setBackgroundResource(R.drawable.gridview_size_textview);
                textView6.setBackgroundResource(R.drawable.gridview_size_textview);
                gridsize=4;
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView5.setBackgroundResource(R.drawable.gridsize_textview_grey);
                textView4.setBackgroundResource(R.drawable.gridview_size_textview);
                textView6.setBackgroundResource(R.drawable.gridview_size_textview);

                gridsize=5;
            }
        });
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView6.setBackgroundResource(R.drawable.gridsize_textview_grey);
                textView4.setBackgroundResource(R.drawable.gridview_size_textview);
                textView5.setBackgroundResource(R.drawable.gridview_size_textview);
                gridsize=6;
            }
        });

    }
}