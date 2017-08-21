package Guvi;

import java.util.Scanner;

public class Hunter52step {

	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=in.nextInt();
		int count=(n>0?1:0);
		for(int i=2;i<=n;i=i+2)
			count++;
		System.out.println(count);
		
	}

}
