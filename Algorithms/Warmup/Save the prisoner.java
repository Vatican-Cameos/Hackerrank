import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner inp = new Scanner(System.in);
        int testCases = inp.nextInt();
        while(testCases > 0){
        long  nPrisoners = inp.nextInt();
        long  nSweets = inp.nextInt();
        long  start = inp.nextInt();

        long  ans = (start+nSweets-1) % nPrisoners;

        if(ans == 0){
            ans = nPrisoners;
        }
        System.out.println(ans);
    }
    testCases--;
  }
}
