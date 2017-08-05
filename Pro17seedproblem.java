package Guvi;

import java.util.Scanner;

public class Pro17seedproblem {

	
	
	Pro17seedproblem(int n){
		for(int i=1;i<n;i++){
			int val=i;
			int sum=i;
			for(;val>0;val/=10)
				sum*=val%10;
			if(sum==n)
				System.out.println(i+" is the seed of "+n);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=in.nextInt();
		Pro17seedproblem obj=new Pro17seedproblem(n);
	}
	
}
