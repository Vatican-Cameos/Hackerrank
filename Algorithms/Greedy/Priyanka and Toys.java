import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int selected;int i,j,count=0;
        Scanner inp = new Scanner(System.in);

        Vector myV = new Vector();
        int n = inp.nextInt();
        for(int k=0;k<n;k++){
            int x = inp.nextInt();
            myV.addElement(x);

        }

        Collections.sort(myV);

        i = 0;
        selected = (int)myV.get(i);
        j = i;
        while(j<n-1){
           // System.out.println((int)myV.get(j+1) -selected) ;
            //if(j + 1 > n)break;
            if(((int)myV.get(j+1)-selected)>4){
                //System.out.println(((int)myV.get(j+1)-selected)>4);
                count++;

                j += 1;
                selected =(int) myV.get(j);
               // System.out.println(count);


            }
            else{
                j++;
            }

        }

       System.out.println(count+1);
    }
}
