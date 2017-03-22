import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            int finalGrade = grade;
            int nextMultipleOf5 = ((grade/5) * 5) + 5;
            if((nextMultipleOf5 - grade)<3){
                if(nextMultipleOf5 >= 40){
                    finalGrade = nextMultipleOf5;
                }
            }
            System.out.println(finalGrade);
        }
    }
}

