import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        int count = 0;
        int max = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i] > max ){
                max = height[height_i];
            }
        }
        for(int i = 0 ; i < n; i++){
          if(max == height[i]){
              count++;
          }  
        }
        System.out.println(count);
    }
}