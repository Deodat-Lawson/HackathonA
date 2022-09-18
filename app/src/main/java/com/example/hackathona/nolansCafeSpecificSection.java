package com.example.hackathona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class nolansCafeSpecificSection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nolans_cafe_specific_section);


        InputStream inputStream = null, inputStream1 = null, inputStream2 = null, inputStream3 = null;
        try {
            inputStream = getAssets().open("noAt_M.txt");
            inputStream1 = getAssets().open("noBt_M.txt");
            inputStream2 = getAssets().open("noCt_M.txt");
            inputStream3 = getAssets().open("noDt_M.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReadInput fileReadInput = new FileReadInput();
        fileReadInput.ReadInput(inputStream,9);
        fileReadInput.ReadInput(inputStream1,10);
        fileReadInput.ReadInput(inputStream2,11);
        fileReadInput.ReadInput(inputStream3,12);

        ArrayList<Double> EstimateNumOfTimeNoA = fileReadInput.allWaitTimeAndPeople.get(9);
        ArrayList<Double> EstimateNumOfTimeNoB = fileReadInput.allWaitTimeAndPeople.get(10);
        ArrayList<Double> EstimateNumOfTimeNoC = fileReadInput.allWaitTimeAndPeople.get(11);
        ArrayList<Double> EstimateNumOfTimeNoD = fileReadInput.allWaitTimeAndPeople.get(12);

        int numOfTimeSizeNoA = EstimateNumOfTimeNoA.size();
        int numOfTimeSizeNoB = EstimateNumOfTimeNoB.size();
        int numOfTimeSizeNoC = EstimateNumOfTimeNoC.size();
        int numOfTimeSizeNoD = EstimateNumOfTimeNoD.size();

        final int[] currTimeA = {15};
        final int[] currTimeB = {15};
        final int[] currTimeC = {15};
        final int[] currTimeD = {15};

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

                                //Wait initialization
                                if(currTimeA[0] >= numOfTimeSizeNoA){
                                    currTimeA[0] = 0;
                                }
                                if(currTimeB[0] >= numOfTimeSizeNoB){
                                    currTimeB[0] = 0;
                                }
                                if(currTimeC[0] >= numOfTimeSizeNoC){
                                    currTimeC[0] = 0;
                                }
                                if(currTimeD[0] >= numOfTimeSizeNoD){
                                    currTimeD[0] = 0;
                                }

                                TextView timeTxtA = (TextView) findViewById(R.id.noEstTimeA);
                                TextView timeTxtB = (TextView) findViewById(R.id.noEstTimeB);
                                TextView timeTxtC = (TextView) findViewById(R.id.noEstTimeC);
                                TextView timeTxtD = (TextView) findViewById(R.id.noEstTimeD);

                                String timeStringA = (int)(Math.max(EstimateNumOfTimeNoA.get(currTimeA[0])-(0.5*Math.random()),0)) + " ~ " + (int)(EstimateNumOfTimeNoA.get(currTimeA[0])+(2*Math.random())) + " Min";
                                String timeStringB = (int)(Math.max(EstimateNumOfTimeNoB.get(currTimeB[0])-(0.5*Math.random()),0)) + " ~ " + (int)(EstimateNumOfTimeNoB.get(currTimeB[0])+(2*Math.random())) + " Min";
                                String timeStringC = (int)(Math.max(EstimateNumOfTimeNoC.get(currTimeC[0])-(0.5*Math.random()),0)) + " ~ " + (int)(EstimateNumOfTimeNoC.get(currTimeC[0])+(2*Math.random())) + " Min";
                                String timeStringD = (int)(Math.max(EstimateNumOfTimeNoD.get(currTimeD[0])-(0.5*Math.random()),0)) + " ~ " + (int)(EstimateNumOfTimeNoD.get(currTimeD[0])+(2*Math.random())) + " Min";

                                timeTxtA.setText(timeStringA);
                                timeTxtB.setText(timeStringB);
                                timeTxtC.setText(timeStringC);
                                timeTxtD.setText(timeStringD);

                                increase[0]++;
                                if(increase[0] > 300) {
                                    currTimeA[0]++;
                                    currTimeB[0]++;
                                    currTimeC[0]++;
                                    currTimeD[0]++;
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

    public void gotoNolans(View v){
        Intent i = new Intent(this, nolansCafeInformation.class);
        startActivity(i);
    }

    public void gotoMenu(View v) {
        Intent i = new Intent(this, nolansCafeMenu.class);
        startActivity(i);
    }
}