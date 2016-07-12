import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n,sum=0;
        n=in.nextInt();
        int[] num = new int[n];
        for(int i=0;i<n;i++){
         num[i] = in.nextInt();
            sum+=num[i];
        }
        System.out.println(sum);
    }
}
