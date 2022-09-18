package com.example.hackathona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class hopkinsCafeInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hopkins_cafe_information);

        InputStream inputStream = null, inputStream1 = null;
        try {
            inputStream = getAssets().open("hopP_M.txt");
            inputStream1 = getAssets().open("hopTt_M.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReadInput fileReadInput = new FileReadInput();
        fileReadInput.ReadInput(inputStream,0);
        fileReadInput.ReadInput(inputStream1,1);
//
        ArrayList<Double> EstimateNumOfPPlHop = fileReadInput.allWaitTimeAndPeople.get(0);
        ArrayList<Double> EstimateNumOfTimeHop = fileReadInput.allWaitTimeAndPeople.get(1);

        int numOfPplSize = EstimateNumOfPPlHop.size();
        int numOfTimeSize = EstimateNumOfTimeHop.size();

        final int[] currPPl = {15};
        final int[] currTime = {15};

        final int[] increase = {0};

        Thread t = new Thread(){
            @Override
            public void run(){
                try{
                    while (!isInterrupted()){

                        Thread.sleep(1000);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {



                                //Time
                                TextView tsecond = (TextView) findViewById(R.id.second);
                                long date = System.currentTimeMillis();
                                SimpleDateFormat sec = new SimpleDateFormat("H:mm:ss a");
                                String secString = sec.format(date);
                                tsecond.setText(secString);

                                //Wait People initialization
                                if(currPPl[0] >= numOfPplSize){
                                    currPPl[0] = 0;
                                }
                                if(currTime[0] >= numOfTimeSize){
                                    currTime[0] = 0;
                                }

                                TextView pplTxt = (TextView) findViewById(R.id.hopEstPpl);
                                TextView timeTxt = (TextView) findViewById(R.id.hopEstTime);

                                String pplString = (int)(Math.max(EstimateNumOfPPlHop.get(currPPl[0])-(5*Math.random()),0)) + " ~ " + (int)(EstimateNumOfPPlHop.get(currPPl[0])+(5*Math.random())) + " People";
                                String timeString = (int)(Math.max(EstimateNumOfTimeHop.get(currTime[0])-(0.5*Math.random()),0)) + " ~ " + (int)(EstimateNumOfTimeHop.get(currTime[0])+(2*Math.random())) + " Minutes";

                                pplTxt.setText(pplString);
                                timeTxt.setText(timeString);

                                increase[0]++;
                                if(increase[0] > 300) {
                                    currPPl[0]++;
                                    currTime[0]++;
                                    increase[0] = 0;
                                }


                            }
                        });
                    }
                }
                catch (InterruptedException e){

                }
            }
        };

        t.start();




    }


    public void gotoMain(View v) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void gotoSpecificSection(View v) {
        Intent i = new Intent(this, hopkinsCafeSpecificSection.class);
        startActivity(i);
    }

    public void gotoMenu(View v) {
        Intent i = new Intent(this, hopCafeMenu.class);
        startActivity(i);
    }





}