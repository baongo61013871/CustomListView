package com.example.myapplication.Tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class Tuan32MainActivity extends AppCompatActivity {
    ListView lv;
    T32Adapter adapter;

    ArrayList <T32Contact> ls=new ArrayList<>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan32_main);
        lv = findViewById(R.id.tuan32Lv);
        // tao nguon du lieu
        ls.add (new T32Contact(".NET","18",R.drawable.img_2));
        ls.add (new T32Contact("C++","18",R.drawable.img_3));
        ls.add (new T32Contact("Spring mvc","18",R.drawable.img_4));
        ls.add (new T32Contact("NodeJS","18",R.drawable.img_5));
        ls.add (new T32Contact("JavaScript","18",R.drawable.img_6));
        // tao adapter
        adapter = new T32Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}