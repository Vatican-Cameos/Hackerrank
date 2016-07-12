import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner inp = new Scanner(System.in);
        int t = inp.nextInt();
        inp.nextLine();
        for(int k =0;k<t;k++){
             boolean flag = false;
        String stringOne = inp.nextLine();
        String stringTwo = inp.nextLine();

            for(int i = 'a';i<'z' && !flag;i++){

                if(stringOne.contains(String.valueOf((char)i)) && stringTwo.contains(String.valueOf((char)i))){
                    System.out.println("YES");
                    flag=true;
                    break;
                }}

           /* for(int i = 'a';i<'z' && !flag;i++)
                if(stringTwo.contains(String.valueOf(stringOne.charAt(i)))){
                    System.out.println("YES");
                    flag=true;
                    break;
                }*/


        if(!flag)
        System.out.println("NO");

      }
    }
}
