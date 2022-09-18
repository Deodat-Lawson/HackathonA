package com.example.hackathona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class hopkinsCafeSpecificSection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hopkins_cafe_specific_section);
    }

    public void gotoHopkinsCafe(View v){
        Intent i = new Intent(this, hopkinsCafeInformation.class);
        startActivity(i);
    }

    public void gotoSecA(View v){
        Intent i = new Intent(this, hopCafeSecA.class);
        startActivity(i);
    }

    public void gotoSecB(View v){
        Intent i = new Intent(this, hopCafeSecb.class);
        startActivity(i);
    }

    public void gotoSecC(View v){
        Intent i = new Intent(this, hopCafeSecc.class);
        startActivity(i);
    }

    public void gotoSecD(View v){
        Intent i = new Intent(this, hopCafesecd.class);
        startActivity(i);
    }

}