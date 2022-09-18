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

}