import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         int t;int n; int  xo=0;int  sum=0;
    int[] a = new  int[100000];
        Scanner s = new Scanner(System.in);
        t = s.nextInt();

   // cin>>t;
    for(int i=0;i<t;i++){
        sum=0;
        n=s.nextInt();
       // cin>>n;
        for(int k=0;k<n;k++)
            a[k] = s.nextInt();
            //cin>>a[i];

        int power = (int)Math.pow(2, n);



        for(int subs=0;subs<power;subs++){
            xo=0;
            for(int j=0;j<n;j++){

                //System.out.println(subs+"shifted is "+ax+"asd"+h);
                if((subs & (1<<j))!=0){

                    int yo=a[j];

                    xo ^=yo;

                  // System.out.println("Elements"+j+yo) ;

                }

            }sum+=xo;



        }
        System.out.println(sum%1000000007);

    }
    }
}
