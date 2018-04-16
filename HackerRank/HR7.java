import java.util.*;
import java.io.*;

class HR7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int[] myIntArray = new int[15];
            int p=0;
            int mul=0;
            for(int j=0;j<n;j++){
                int pow2=(int)Math.pow(2,j);
                mul+=pow2*b;
                myIntArray[j]=mul;
            }


            
            for(int j=0;j<n-1;j++) System.out.printf("%d ",myIntArray[j]+a);

            System.out.println(myIntArray[n-1]+a);

        }
        in.close();
    }
}
