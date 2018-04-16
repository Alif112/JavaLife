import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HR10 {

	static boolean flag=false;
	static int B=0;
	static int H=0;
	static {
	// System.out.printf("bal");
	    try{
	        flag=false;
	        Scanner sc=new Scanner(System.in);
	        B=sc.nextInt();
	        H=sc.nextInt();
	        // System.out.printf("%d %d",B,H);
	        if(B>0 && H>0){
	            flag=true;
	        }else{
	        throw new Exception();
	        }
	    } catch(Exception e){
	        System.out.println("java.lang.Exception: Breadth and height must be positive");
	    }
	}

	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}//end of main

}//end of class