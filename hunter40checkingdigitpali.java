package Guvi;

import java.util.*;

public class hunter40checkingdigitpali {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number to find sum of the digi palindrome or not");
		int no=in.nextInt();
		int sum=0;
		for(;no>0;no/=10)
			sum+=no%10;
		StringBuffer str=new StringBuffer(String.valueOf(sum));
		System.out.println(((str.toString()).equals((str.reverse()).toString()))?"The given number is palindrome ":"The given number is not palindrome");
	
		
		
	}
}
