package Guvi;

import java.util.Scanner;

public class Hunter75imnextsmaller {

	
	public static void main(String[] args) {

		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n=in.nextInt();
		System.out.println("Enter the element");
		int []arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("Output:");
		for(int i=0;i<n-1;i++){
			if(arr[i]>arr[i+1])
				System.out.print(arr[i+1]+" ");
			else
				System.out.print("-1 ");
		}
	System.out.println("-1");	
	}

}
