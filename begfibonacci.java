import java.io.*;
import java.util.Scanner;
public class begfibonacci {
	void fib(int a){
		int b=0,c=1,temp=0;
		for(int i=0;i<a-2;i++)
		{b=temp+c;
		temp=c;
		c=b;
		System.out.println(b);
			
		}
		
	}
public static void main(String[] args) {
	int fibo;
	System.out.println("Enter the number to generate fibonacci series");
	Scanner obj=new Scanner(System.in);
	fibo=obj.nextInt();
	System.out.println(0);
	System.out.println(1);
	begfibonacci s=new begfibonacci();
	s.fib(fibo);
	
}
}