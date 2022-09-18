package com.example.hackathona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hopCafeSecA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hop_cafe_sec);
    }

    public void gotoSpecificSection(View v) {
        Intent i = new Intent(this, hopkinsCafeSpecificSection.class);
        startActivity(i);
    }

}