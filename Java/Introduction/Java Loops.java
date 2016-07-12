import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        Scanner inp = new Scanner(System.in);
        int testcases = inp.nextInt();


        while(testcases>0){
        int a = inp.nextInt();
        int b = inp.nextInt();
        int n = inp.nextInt();
        double ans = a;
        for(int i = 0; i<n ; i++){
        // a + 2^0b + 2^1b ....
        ans = ans + Math.pow(2,i)*b;
            System.out.print((int)ans + " ");

        }System.out.println();
            testcases--; }
    }
}
