package Guvi;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Hunter12Kthtalleststu {

	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the kth student");
		int[] height=new int[50];
		int k=in.nextInt();
		
		System.out.println("Enter the students height in centimeter");
		for(int i=0;i<50;i++){
			height[i]=in.nextInt();
		}
		Arrays.sort(height);
		System.out.println("Height of the students");
	for(int i=9;i>=k;i=i-4)
		System.out.println(height[i]);
	}
}
