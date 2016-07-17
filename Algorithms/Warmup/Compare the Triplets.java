import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int pointsA =0, pointsB=0;
        int ans;

        ans = a0-b0;
        if(ans>0){
          pointsA++;
        }else if(ans<0){
          pointsB++;
        }

        ans = a1-b1;
        if(ans>0){
          pointsA++;
        }else if(ans<0){
          pointsB++;
        }


        ans = a2-b2;
        if(ans>0){
          pointsA++;
        }else if(ans<0){
          pointsB++;
        }

        System.out.println(pointsA + " " +pointsB);


    }
}
