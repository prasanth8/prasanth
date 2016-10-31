import java.io.*;
import java.util.Scanner;
public class fibonacci {
	void fib(Integer r){
		int f=0,s=1,n;
		for(int i=0;i<r;i++){
		if(i==0)
				System.out.println(i);
		else if(i==1)
			System.out.println(i);
		else
		{
			n=s+f;
			f=s;
			s=n;
			System.out.println(n);
		}}
		}
		public static void main(String arg[]){
		int r;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to find the fibonacci");
		r=s.nextInt();
		Integer i=new Integer(r);
		fibonacci obj=new fibonacci();
		obj.fib(r);
		
		
	}

}
