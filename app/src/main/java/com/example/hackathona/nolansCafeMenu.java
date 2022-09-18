package com.example.hackathona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nolansCafeMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nolans_cafe_menu);
    }

    public void gotoNolans(View v){
        Intent i = new Intent(this, nolansCafeInformation.class);
        startActivity(i);
    }
}