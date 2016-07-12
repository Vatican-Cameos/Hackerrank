import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {



    public static void main(String[] args) {
        int[] myArray;
        int count=0;
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        myArray = new int[100000];
        for(int i = 0;i<inputString.length();i++){
            myArray[inputString.charAt(i)]++;
        }
        for(int i = 97;i<=122;i++){
           if(myArray[i]%2!=0)
               count++;
        }
        String ans=null;
       if(count>1)
           ans="NO";
       if(count<=1)
            ans="YES";

        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);


        myScan.close();

    }
}
