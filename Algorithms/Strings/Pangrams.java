import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String question;
        int[] count = new int[26];
        int ab=0;
        Scanner yo = new Scanner(System.in);
        question = yo.nextLine();
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String e = "e";
        String f = "f";
        String g = "g";

        String h = "h";
        String i = "i";
        String j = "j";
        String k = "k";
        String l = "l";
        String m = "m";String o = "o";
        String n = "n";String p = "p";String q = "q";String r = "r";String s = "s";String t = "t";String u = "u";String v = "v";String w = "w";String x = "x";
        String y = "y";
        String z = "z";


        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        String E = "E";
        String F = "F";
        String G = "G";

        String H = "H";
        String I = "I";
        String J = "J";
        String K = "K";
        String L = "L";
        String M = "M";String O = "O";
        String N = "N";String P = "P";String Q = "Q";String R = "R";String S = "S";String T = "T";String U = "U";String V = "V";String W = "W";String X = "X";
        String Y = "Y";
        String Z = "Z";

       if(question.contains(a)||question.contains(A)){
            count[0]++;
        }
        if(question.contains(b)||question.contains(B)){
            count[1]++;
        }
        if(question.contains(c)||question.contains(C)){
            count[2]++;
        }
        if(question.contains(d)||question.contains(D)){
            count[3]++;
        }
        if(question.contains(e)||question.contains(E)){
            count[4]++;
        }
        if(question.contains(f)||question.contains(F)){
            count[5]++;
        }
        if(question.contains(g)||question.contains(G)){
            count[6]++;
        }
        if(question.contains(h)||question.contains(H)){
            count[7]++;
        }
        if(question.contains(i)||question.contains(I)){
            count[8]++;
        }
        if(question.contains(j)||question.contains(J)){
            count[9]++;
        }
        if(question.contains(k)||question.contains(K)){
            count[10]++;
        }
        if(question.contains(l)||question.contains(L)){
            count[11]++;
        }
        if(question.contains(m)||question.contains(M)){
            count[12]++;
        }
        if(question.contains(n)||question.contains(N)){
            count[13]++;
        }
        if(question.contains(o)||question.contains(O)){
            count[14]++;
        }
        if(question.contains(p)||question.contains(P)){
            count[15]++;
        }
        if(question.contains(q)||question.contains(Q)){
            count[16]++;
        }

        if(question.contains(r)||question.contains(R)){
            count[17]++;
        }
        if(question.contains(s)||question.contains(S)){
            count[18]++;
        }if(question.contains(t)||question.contains(T)){
            count[19]++;
        }
        if(question.contains(u)||question.contains(U)){
            count[20]++;
        }
        if(question.contains(v)||question.contains(V)){
            count[21]++;
        }
        if(question.contains(w)||question.contains(W)){
            count[22]++;
        }
         if(question.contains(x)||question.contains(X)){
            count[23]++;
        }
         if(question.contains(y)||question.contains(Y)){
            count[24]++;
        }
         if(question.contains(z)||question.contains(Z)){
            count[25]++;
        }
        for(int ij=0;ij<26;ij++)
            {
            if(count[ij]>=1)ab++;
        }


        if(ab==26)
        System.out.println("pangram");
        else
            System.out.println("not pangram");





    }
}
