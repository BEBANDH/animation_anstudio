package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isMother=true;
    public void change(View view){
        ImageView imageView=findViewById(R.id.broom);
        ImageView imageView2=findViewById(R.id.mother);
        ImageView imageView3=findViewById(R.id.egg);
        if(isMother){
            imageView.animate().setDuration(2000).alpha(1);
            imageView2.animate().setDuration(2000).alpha(0);
            imageView3.animate().setDuration(2000).translationX(150);
            imageView3.animate().setDuration(2000).alpha(0);
            imageView3.animate().setDuration(2000).rotation(360);
            isMother=false;
        }else{
            imageView.animate().setDuration(2000).alpha(0);
            imageView2.animate().setDuration(2000).alpha(1);
            imageView3.animate().setDuration(2000).translationX(-150);
            imageView3.animate().setDuration(2000).alpha(1);
            imageView3.animate().setDuration(2000).rotation(-350);
            isMother=true;
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}