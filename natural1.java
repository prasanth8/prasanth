import java.io.*;
import java.util.Scanner;
public class natural {
	public static void main(String arg[]){
		int i,k=0;
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
if(i>=0)
		{for(int n=0;n<=i;n++)
			k=k+n;
			System.out.println(k+"is the sum of natural number");}
else 
System.out.println(i+" is not natural number");
			
		
	}

}