import java.io.*;
import java.util.Scanner;
public class lcm {

	public static void main(String arg[]){
		int i1,i2,lcm;
		System.out.println("Enter the two number to find lcm");
		Scanner s=new Scanner(System.in);
		i1=s.nextInt();
		i2=s.nextInt();
		lcm=i1*i2;
		System.out.println("The lcm of two number is"+lcm);
	}
}
