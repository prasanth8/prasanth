package sakthi;
import java.io.*;
import java.util.Scanner;
public class hunter121diamond {
	int a=1,b=0,c=98;
	public void upperpart(int n){
		for(int i=0;i<=n/2;i++){
			for(int j=0;j<(n/2)-b;j++)
			System.out.print((char)(101-j)+" ");
			if(i==0)
			System.out.print("a ");
			else {for(int k=0;k<a;k++)
			{
				System.out.print("  ");
			}
			a+=2;
			}
			for(int l=0;l<(n/2)-b;l++)
			System.out.print((char)(l+c)+" ");
			System.out.println();
		if(i<1)
			b=0;
		else{
			b=i;c+=1;
		}
		}
	}
	public void lowerpart(int n){
		int limit=n-4,val;
		c=1;
		for(int i=1;i<=n/2;i++){
			val=c;
			for(int j=0;j<=c;j++)
				System.out.print((char)(101-j)+" ");
			if(i==n/2)
				System.out.print("a ");
			for(int k=0;k<limit;k++)
				System.out.print("  ");
			for(int l=0;l<=c;l++)
			{	System.out.print((char)(101-val)+" ");
			val--;
			}System.out.println();
			limit-=2;
			if(i==(n/2)-1)
				c=i;
			else
				c=i+1;
			
		}
	}
public static void main(String[] args) {
	int n;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number ");
	n=s.nextInt();
	System.out.println((char)n);
	 hunter121diamond obj=new  hunter121diamond();
	 obj.upperpart(n);
	 obj.lowerpart(n);
}
}
