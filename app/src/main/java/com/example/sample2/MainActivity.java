package com.example.sample2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    String word;
    String clue;
    int homeScore=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout linearLayout1=(LinearLayout)findViewById(R.id.linearlayout_high);
        Button start=(Button) findViewById(R.id.start_home);

        EditText word_box=(EditText) findViewById(R.id.edittext_word);
        EditText clue_box=(EditText) findViewById(R.id.edittext_clue);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                word=word_box.getText().toString();
                clue=clue_box.getText().toString();
                if(word.isEmpty()&&clue.isEmpty()){
                    word_box.setError("Word field cannot be null");
                    clue_box.setError("Clue field cannot be null");
                }
                else if(word.isEmpty()){

                    word_box.setError("Word field cannot be null");
                } else if (clue.isEmpty()) {
                    clue_box.setError("Clue field cannot be null");
                }
                else{
                    Intent intent=new Intent(MainActivity.this,Quiz_Screen.class);
                    intent.putExtra("Word",word);
                    intent.putExtra("Clue",clue);
                    startActivity(intent);
                }
            }
        });

    }
}
