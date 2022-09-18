package com.example.hackathona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class hopCafesecd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hop_cafesecd);

        InputStream inputStream1 = null;
        try {
            inputStream1 = getAssets().open("hopDt_M.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReadInput fileReadInput = new FileReadInput();
        fileReadInput.ReadInput(inputStream1,5);

        ArrayList<Double> EstimateNumOfTimeHop = fileReadInput.allWaitTimeAndPeople.get(5);

        int numOfTimeSize = EstimateNumOfTimeHop.size();

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

                                //Wait initialization
                                if(currTime[0] >= numOfTimeSize){
                                    currTime[0] = 0;
                                }

                                TextView timeTxt = (TextView) findViewById(R.id.hopEstTimeD);
                                String timeString = (int)(Math.max(EstimateNumOfTimeHop.get(currTime[0])-(2*Math.random()),0)) + " ~ " + (int)(EstimateNumOfTimeHop.get(currTime[0])+(0.5*Math.random())) + " Min";

                                timeTxt.setText(timeString);

                                increase[0]++;
                                if(increase[0] > 300) {
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

    public void gotoSpecificSection(View v) {
        Intent i = new Intent(this, hopkinsCafeSpecificSection.class);
        startActivity(i);
    }

}