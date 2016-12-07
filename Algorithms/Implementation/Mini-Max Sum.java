import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        int count = 0;
        long min = b+c+d+e;
        long max = b+c+d+e;
        long sum=0;
        while(count<5){
            switch(count){
                case 0:
                    sum = b+c+d+e;
                    if(sum > max)
                        max = sum;
                    if(sum < min)
                        min = sum;
                    break;
                case 1 :
                    sum = a+c+d+e;
                    if(sum > max)
                        max = sum;
                    if(sum < min)
                        min = sum;
                    break;
                case 2 :
                    sum = a+b+d+e;
                    if(sum > max)
                        max = sum;
                    if(sum < min)
                        min = sum;
                    break;
                case 3 :
                    sum = a+b+c+e;
                    if(sum > max)
                        max = sum;
                    if(sum < min)
                        min = sum;
                    break;
                case 4 :
                    sum = a+b+c+d;
                    if(sum > max)
                        max = sum;
                    if(sum < min)
                        min = sum;
                    break;
            }
            count++;
        }
        System.out.println(min+" " + max);
    }
}
