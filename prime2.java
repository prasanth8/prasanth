import java.io.*;
import java.util.Scanner;
public class prime {
public static void main(String arg[])
{
	int prime,p=0;
	System.out.println("Enter the number to find prime or not");
	Scanner s=new Scanner(System.in);
	prime=s.nextInt();
	for(int i=2;i<prime;i++){
		if(prime%i==0){
			p=1;
		}
		
	}if(p==0)
		System.out.println("it is prime");
	else 
		System.out.println("it is not prime");
}}
