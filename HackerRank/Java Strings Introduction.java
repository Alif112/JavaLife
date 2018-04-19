import java.io.*;
import java.util.*;
import java.lang.*;

public class Solution{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        int al=A.length();

        int bl=B.length();
        String s=null;
        if(A.compareTo (B)>0)s="Yes";
        else s="No";
        
        char a=A.charAt(0);
        a=Character.toUpperCase(a);
        StringBuilder AA = new StringBuilder(A);
        AA.setCharAt(0, a);
        
        char b=B.charAt(0);
        b=Character.toUpperCase(b);
        StringBuilder BB = new StringBuilder(B);
        BB.setCharAt(0, b);
        
        System.out.printf((al+bl)+"\n"+s+"\n"+AA+" "+BB+"\n");
    }
}
