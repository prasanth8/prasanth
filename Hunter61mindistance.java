package Guvi;

import java.util.Scanner;

public class Hunter61mindistance {

int arr[];
int min=999;
public void addElement(int n,Scanner in){
	
	arr=new int[n];
	System.out.println("Enter the element to insert into the array");
	for(int i=0;i<n;i++)
		arr[i]=in.nextInt();

}

	public void process(int a,int b,int n){
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]==a){
				for(int j=0;j<n;j++){
					if(arr[j]==b){
						if(Math.abs(i-j)<min)
					min=Math.abs(i-j);	
					}
					
				}
			}
			
		}
		System.out.println("Minimum distance between the "+a+" & "+b+" is "+min);
			
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no of array");
		int n=in.nextInt();
		Hunter61mindistance obj=new Hunter61mindistance();
		
		obj.addElement(n, in);
		System.out.println("Enter the two elements to find minimum distance");
		obj.process(in.nextInt(),in.nextInt(),n);
	}
}
