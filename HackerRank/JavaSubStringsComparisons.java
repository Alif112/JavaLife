import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaSubStringsComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int len=k;
        int n=s.length();
        boolean b=true;
        for (int i = 0; i <=n-k; i++){
            if(b){
                for(int j=0;j<k;j++){
                    smallest+="z";
                    largest+="A";
                    b=false;
                }    
            }
            String sp="";
            for(int j=0;j<k;j++){
                sp+=s.charAt(i+j);
            }
            // System.out.println(sp);
            if(sp.compareTo(smallest)<0) smallest=sp;
            if(sp.compareTo(largest)>0) largest=sp;

        }
        
        
        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
