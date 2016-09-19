import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int totalCost = 0;
        int cost[] = new int[n];
        int k = input.nextInt();
        for(int j = 0; j < n; j++){
            cost[j] = input.nextInt();
            totalCost += cost[j];
        }
        int bCharged = input.nextInt();
        int split = (totalCost-cost[k])/2;
        if(split == bCharged)
            System.out.println("Bon Appetit");
        else
            System.out.println(bCharged - split);


    }
}
