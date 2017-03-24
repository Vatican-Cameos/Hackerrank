import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        // your code goes here
        int nPagesFromFront, nPagesFromBack;
        nPagesFromFront = p/2;
        
        int totalPagesFromBehind = n - p;
        nPagesFromBack = totalPagesFromBehind/2;
        if(nPagesFromBack < nPagesFromFront){
            System.out.println(nPagesFromBack);
        }else{
            System.out.println(nPagesFromFront);
        }
    }
}