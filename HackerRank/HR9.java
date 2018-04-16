import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HR9 {

	    public static void main(String[] args) {
	    Scanner line = new Scanner(System.in); // Added source parameter in constructor.
	    int counter = 1; // Initialization of counter is done outside while loop, otherwise it will always get initialized by 1 in while loop
	    while (line.hasNextLine()) {
	        String lineStr = line.nextLine(); // changed variable name to lineStr, because 2 variable can't be declared with the same name in a method.
	        System.out.println(counter + " " + lineStr);
	        counter++;
	    }
	}
}