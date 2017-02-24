import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        int count = 0;
        int sorted[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        int j = 0;
        while(j <= (n-1)){
            if((j + 2) <= n && c[j] == c[j+1]){
               count++;
                j += 2;
            }else{
                j++;
            }
        }
        System.out.println(count);
    }
}
