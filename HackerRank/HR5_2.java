import java.util.Scanner;
import java.util.*;

public class HR5_2 {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();

                int x=sc.nextInt();
                String x1=x+"";
                //Complete this line
                //System.out.printf("%1$-15s%2$03d \n",s1,x);
                
                int slen=s1.length();
                int xlen=x1.length();
                System.out.print(s1);
                for(int j=0;j<15-slen-3;j++){
                    System.out.print(" ");
                }
                System.out.printf("%03d\n",x);
            }
            System.out.println("================================");

    }
}