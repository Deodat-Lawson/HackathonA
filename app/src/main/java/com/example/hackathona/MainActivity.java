package com.example.hackathona;

import java.util.*;
import java.io.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println("tst1");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void gotoHopkinsCafe(View v) {
        Intent i = new Intent(this, hopkinsCafeInformation.class);
        startActivity(i);
    }

    public void gotoNolans(View v) {
        Intent i = new Intent(this, nolansCafeInformation.class);
        startActivity(i);
    }

    public void gotoMap(View v) {
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }


}