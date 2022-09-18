package com.example.hackathona;

import java.util.*;
import java.io.*;

public class FileReadInput {
    HashMap<Integer, ArrayList<Double>> allWaitTimeAndPeople = new HashMap<>();

    public void readWaitTime() throws IOException {
        for (int i = 0; i < 14; i++) {
            ArrayList<Double> intt = new ArrayList<>();
            allWaitTimeAndPeople.put(i, intt);
        }

        BufferedReader f = new BufferedReader(new FileReader("waitTimeHopCafe.txt"));
        int lineNum = 0;
        double firstL = Double.parseDouble(f.readLine());

        while (firstL >= 0) {
            if (lineNum % 14 == 0) { //HashMap 0 is an arrayList of NumOfPpl in HopCafe
                ArrayList<Double> curr = allWaitTimeAndPeople.get(0);
                curr.add(firstL);
                allWaitTimeAndPeople.put(0, curr);
            } else if (lineNum % 14 == 1) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
                ArrayList<Double> curr = allWaitTimeAndPeople.get(1);
                curr.add(firstL);
                allWaitTimeAndPeople.put(1, curr);
            } else if (lineNum % 14 == 2) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
                ArrayList<Double> curr = allWaitTimeAndPeople.get(2);
                curr.add(firstL);
                allWaitTimeAndPeople.put(2, curr);
            } else if (lineNum % 14 == 3) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
                ArrayList<Double> curr = allWaitTimeAndPeople.get(3);
                curr.add(firstL);
                allWaitTimeAndPeople.put(3, curr);
            } else if (lineNum % 14 == 4) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
                ArrayList<Double> curr = allWaitTimeAndPeople.get(4);
                curr.add(firstL);
                allWaitTimeAndPeople.put(4, curr);
            } else if (lineNum % 14 == 5) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
                ArrayList<Double> curr = allWaitTimeAndPeople.get(5);
                curr.add(firstL);
                allWaitTimeAndPeople.put(5, curr);
            } else if (lineNum % 14 == 6) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
                ArrayList<Double> curr = allWaitTimeAndPeople.get(6);
                curr.add(firstL);
                allWaitTimeAndPeople.put(6, curr);
            }  else if (lineNum % 14 == 8) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
                ArrayList<Double> curr = allWaitTimeAndPeople.get(8);
                curr.add(firstL);
                allWaitTimeAndPeople.put(8, curr);
            } else if (lineNum % 14 == 9) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
                ArrayList<Double> curr = allWaitTimeAndPeople.get(9);
                curr.add(firstL);
                allWaitTimeAndPeople.put(9, curr);
            } else if (lineNum % 14 == 10) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
                ArrayList<Double> curr = allWaitTimeAndPeople.get(10);
                curr.add(firstL);
                allWaitTimeAndPeople.put(10, curr);
            } else if (lineNum % 14 == 11) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
                ArrayList<Double> curr = allWaitTimeAndPeople.get(11);
                curr.add(firstL);
                allWaitTimeAndPeople.put(11, curr);
            } else if (lineNum % 14 == 12) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
                ArrayList<Double> curr = allWaitTimeAndPeople.get(12);
                curr.add(firstL);
                allWaitTimeAndPeople.put(12, curr);
            } else if (lineNum % 14 == 13) { //HashMap 1 is an arrayList of NumOfPpl in HopCafe
                ArrayList<Double> curr = allWaitTimeAndPeople.get(13);
                curr.add(firstL);
                allWaitTimeAndPeople.put(13, curr);
            }
            lineNum++;
            firstL = Double.parseDouble(f.readLine());
        }


    }

}
