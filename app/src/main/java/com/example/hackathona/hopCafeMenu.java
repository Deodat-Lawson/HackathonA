package com.example.hackathona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hopCafeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hop_cafe_menu);
    }

    public void gotoHopkinsCafe(View v){
        Intent i = new Intent(this, hopkinsCafeInformation.class);
        startActivity(i);
    }
}