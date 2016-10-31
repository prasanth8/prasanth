import java.io.*;
import java.util.Scanner;
public class quit3 {

	public static void main(String arg[]){
		char c;
		System.out.println("Enter the char to quit'q'");
		Scanner s=new Scanner(System.in);
		c=s.next().charAt(0);
		switch(c)
		{
		case 'q':
			System.exit(0);
		default:
			System.out.println("it is wrong typing");
			
		}
	}
}
