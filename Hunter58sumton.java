package Guvi;

import java.util.Scanner;

public class Hunter58sumton {

	int n;
	int a[];
	int k;
	int count=0;
	static Scanner in=new Scanner(System.in);
	Hunter58sumton(int n,int k){
		this.n=n;
		this.k=k;
		this.a=new int[n];
	}
	
	 void addElement(){
		for(int i=0;i<n;i++){
			System.out.println("Enter the element");
			a[i]=in.nextInt();
		}
		
	}
	void display(){
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++){
				if(Math.abs(a[i]-a[j])==k)
				{
					count++;
					System.out.println(a[i]+","+a[j]);
				}
			}
		}
		System.out.println("Total count   "+count);
	}
	
	 public static void main(String[] args) {
		
		System.out.println("Enter the n value and k value");
		Hunter58sumton obj=new Hunter58sumton(in.nextInt(),in.nextInt());
		obj.addElement();
		obj.display();
		
	}
}
