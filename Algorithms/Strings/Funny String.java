import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner in = new Scanner(System.in);
        //int testcases = in.nextInt();
       int testcases = Integer.parseInt(in.nextLine());

        for( int t=1;t<=testcases;t++){
        String original = in.nextLine();
        String reverse="";

        int count=0;





       int length = original.length();

        for ( int i = length - 1 ; i >= 0 ; i-- )
           reverse = reverse + original.charAt(i);


        for(int k=1;k<=length-1;k++){
            char ch1,ch2,ph1,ph2;

             ch1 = original.charAt(k);
             ch2 = original.charAt(k-1);
             ph1 = reverse.charAt(k);
             ph2 = reverse.charAt(k-1);

            int x1=Math.abs((int)ch1-(int)ch2);
            int x2=Math.abs((int)ph1-(int)ph2);
            if(x1==x2)
                count++;
             }
        if(count==length-1)
                System.out.println("Funny");
            else
                {
                System.out.println("Not Funny");}
        }
   }
}
