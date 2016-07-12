/* Sample program illustrating input/output methods */
import java.util.*;
import java.util.Arrays;

class Solution{
   public static void main( String args[] ){

// helpers for input/output

      Scanner in = new Scanner(System.in);
      int[] purchasedByI = new int[100];
      int N, K;int sum =0;int i,j=0;
      N = in.nextInt();
      K = in.nextInt();

      int C[] = new int[N];
      for(i=0; i<N; i++){
         C[i] = in.nextInt();
      }
       Arrays.sort(C);
       i=0;
       j=N;

       while(j!=0){


           sum += (purchasedByI[i]+1)*C[j-1];
           purchasedByI[i]++;

           i++;
           j--;

           if(i==K)
               i=0;

       }

      int result = sum;
      System.out.println( result );

   }
}
