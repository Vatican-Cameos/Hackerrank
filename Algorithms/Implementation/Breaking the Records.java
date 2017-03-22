import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        int nWorstRecord = 0, nBestRecord = 0;
        int currentBest, currentWorst;
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();  
        }
        currentBest = score[0];
        currentWorst = score[0];
        for(int i=0; i < n ; i++){
            if(score[i] < currentWorst){
                currentWorst = score[i];
                nWorstRecord++;
            }
            if(score[i] > currentBest){
                currentBest = score[i];
                nBestRecord++;
            }
        }
        // your code goes here
        System.out.println(nBestRecord + " " + nWorstRecord);
    }
}