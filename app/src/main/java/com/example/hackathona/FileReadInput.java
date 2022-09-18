package com.example.hackathona;

import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import java.util.*;
import java.io.*;

public class FileReadInput {
    HashMap<Integer, ArrayList<Double>> allWaitTimeAndPeople = new HashMap<>();

    FileReadInput(){
        for (int i = 0; i < 14; i++) {
            ArrayList<Double> intt = new ArrayList<>();
            allWaitTimeAndPeople.put(i, intt);
        }
    }

    void ReadInput(InputStream t, int num) {

        BufferedReader f = new BufferedReader(new InputStreamReader(t));

        int lineNum = 0;
        String a = null;

        try {
            a = f.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        double firstL = Double.parseDouble(a);

        //0 - hop ppl, 1 - hop total t, 2 - hop secA t, 3 - hop secB t, 4 - hop secC t, 5 - hop secD t
        //7 - no ppl, 8 - no total t, 9 - no secA t, 10 - no secB t, 11 - no secC t, 12 - no secD t

        while (firstL >= 0){
            ArrayList<Double> curr = allWaitTimeAndPeople.get(num);
            curr.add(firstL);
            allWaitTimeAndPeople.put(num, curr);
            lineNum++;
            try {
                a = f.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            firstL = Double.parseDouble(a);
        }

//        while (firstL >= 0) {
//            if (lineNum % 14 == 0) { //HashMap 0 is an arrayList of NumOfPpl in HopCafe
//                ArrayList<Double> curr = allWaitTimeAndPeople.get(0);
//                curr.add(firstL);
//                allWaitTimeAndPeople.put(0, curr);
//                System.out.println(curr.size());
//            } else if (lineNum % 14 == 1) { //HashMap 1 is an arrayList of Total wait time in HopCafe
//                ArrayList<Double> curr = allWaitTimeAndPeople.get(1);
//                curr.add(firstL);
//                allWaitTimeAndPeople.put(1, curr);
//            } else if (lineNum % 14 == 2) { //HashMap 2 is an arrayList of Wait time in SecA in HopCafe
//                ArrayList<Double> curr = allWaitTimeAndPeople.get(2);
//                curr.add(firstL);
//                allWaitTimeAndPeople.put(2, curr);
//            } else if (lineNum % 14 == 3) { //HashMap 3 is an arrayList of Wait time in SecB in HopCafe
//                ArrayList<Double> curr = allWaitTimeAndPeople.get(3);
//                curr.add(firstL);
//                allWaitTimeAndPeople.put(3, curr);
//            } else if (lineNum % 14 == 4) { //HashMap 4 is an arrayList of Wait time in SecC in HopCafe
//                ArrayList<Double> curr = allWaitTimeAndPeople.get(4);
//                curr.add(firstL);
//                allWaitTimeAndPeople.put(4, curr);
//            } else if (lineNum % 14 == 5) { //HashMap 5 is an arrayList of Wait time in SecD in HopCafe
//                ArrayList<Double> curr = allWaitTimeAndPeople.get(5);
//                curr.add(firstL);
//                allWaitTimeAndPeople.put(5, curr);
//
//
//
//            } else if (lineNum % 14 == 7) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
//                ArrayList<Double> curr = allWaitTimeAndPeople.get(7);
//                curr.add(firstL);
//                allWaitTimeAndPeople.put(6, curr);
//            }  else if (lineNum % 14 == 8) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
//                ArrayList<Double> curr = allWaitTimeAndPeople.get(8);
//                curr.add(firstL);
//                allWaitTimeAndPeople.put(8, curr);
//            } else if (lineNum % 14 == 9) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
//                ArrayList<Double> curr = allWaitTimeAndPeople.get(9);
//                curr.add(firstL);
//                allWaitTimeAndPeople.put(9, curr);
//            } else if (lineNum % 14 == 10) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
//                ArrayList<Double> curr = allWaitTimeAndPeople.get(10);
//                curr.add(firstL);
//                allWaitTimeAndPeople.put(10, curr);
//            } else if (lineNum % 14 == 11) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
//                ArrayList<Double> curr = allWaitTimeAndPeople.get(11);
//                curr.add(firstL);
//                allWaitTimeAndPeople.put(11, curr);
//            } else if (lineNum % 14 == 12) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
//                ArrayList<Double> curr = allWaitTimeAndPeople.get(12);
//                curr.add(firstL);
//                allWaitTimeAndPeople.put(12, curr);
//            }
//            try {
//                a = f.readLine();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            lineNum++;
////
//            if(lineNum%14 == 6 || lineNum%14 == 13){
//                lineNum++;
//                try {
//                    a = f.readLine();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            firstL = Double.parseDouble(a);
//        }
//
//        try {
//            f.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }


}
