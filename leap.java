import java.io.*;
import java.util.Scanner;
public class leap {
	public static void main(String arg[])
	{
		int leap;
		Scanner s=new Scanner(System.in);
		leap=s.nextInt();
		if(leap%4==0)
			System.out.println(leap+" is leap year");
		else
			System.out.println(leap+" is not leap year");
	}
}
