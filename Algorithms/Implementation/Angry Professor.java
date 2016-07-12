import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner inp = new Scanner(System.in);
        int[] arrivalTime = new int[1000];
        int testcases = inp.nextInt();
        for(int i=0;i<testcases;i++){
            int count=0;
            int n = inp.nextInt();
            int k = inp.nextInt();
            for(int j=0;j<n;j++)
                arrivalTime[j] = inp.nextInt();
            for(int z=0;z<n;z++){
                if(arrivalTime[z]<=0){
                    count++;
                    if(count>=k){
                        System.out.println("NO");
                        break;
                    }

                }
            }
            if(count<k)
                System.out.println("YES");
        }
    }
}
