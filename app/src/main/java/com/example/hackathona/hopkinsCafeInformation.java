package com.example.hackathona;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.StringTokenizer;

public class hopkinsCafeInformation extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hopkins_cafe_information);


        FileReadInput input = new FileReadInput();
        try {
            input.readWaitTime();
        } catch (IOException e) {
            e.printStackTrace();
        }

        ArrayList<Double> EstimateNumOfPPlHop = input.allWaitTimeAndPeople.get(0);
        ArrayList<Double> EstimateNumOfTimeHop = input.allWaitTimeAndPeople.get(1);

        int numOfPplSize = EstimateNumOfPPlHop.size();
        int numOfTimeSize = EstimateNumOfTimeHop.size();

        final int[] currPPl = {0};
        final int[] currTime = {0};

        Thread t = new Thread(){
            @Override
            public void run(){
                try{
                    while (!isInterrupted()){

                        Thread.sleep(1000);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
//                                TextView second1, day, year;
//                                second1 = findViewById(R.id.second);
//
//
//                                Date currentTime = Calendar.getInstance().getTime();
//
//                                String formattedDate = DateFormat.getDateInstance(DateFormat.FULL).format(currentTime);
//
//                                int second = DateFormat.SECOND_FIELD;
//                                int minute = DateFormat.MINUTE_FIELD;
//                                int hour = DateFormat.HOUR0_FIELD;
//
//                                String[] TimeFactor = new String[6];
//                                TimeFactor[0] = ("" + second);
//                                TimeFactor[1] = ("" + minute);
//                                TimeFactor[2] = ("" + hour);
//
//                                String[] Time2 = formattedDate.split(",");
//                                System.arraycopy(Time2, 0, TimeFactor, 3, Time2.length);
//
//                                String ds = ("" + second);
//                                second1.setText(ds);
//


                                //Time
                                TextView tsecond = (TextView) findViewById(R.id.second);
                                long date = System.currentTimeMillis();
                                SimpleDateFormat sec = new SimpleDateFormat("H:mm:ss a");
                                String secString = sec.format(date);
                                tsecond.setText(secString);

                                //Wait People initialization
                                if(currPPl[0] == numOfPplSize){
                                    currPPl[0] = 0;
                                }
                                if(currTime[0] == numOfTimeSize){
                                    currTime[0] = 0;
                                }

                                TextView pplTxt = (TextView) findViewById(R.id.hopEstPpl);
                                TextView timeTxt = (TextView) findViewById(R.id.hopEstTime);
                                String pplString = ("" + currPPl[0]);
                                String timeString = ("" + currTime[0]);
                                pplTxt.setText(pplString);
                                timeTxt.setText(timeString);


                                currPPl[0]++;
                                currTime[0]++;


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