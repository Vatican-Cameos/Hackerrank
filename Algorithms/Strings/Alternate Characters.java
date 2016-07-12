import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
              // TODO Auto-generated method stub

              Scanner sc = new Scanner(System.in);

              int T = sc.nextInt();
              for (int count = 0; count < T; count++) {
                     char[] characters= sc.next().toCharArray();
                      int alterCount=0;
                     for(int i=0;i<characters.length-1;i++)
                     {
                           if(characters[i]==characters[i+1])
                           {
                                  alterCount++;
                           }

                     }
                     System.out.println(alterCount);

              }

              sc.close();
       }

}
