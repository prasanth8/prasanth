import java.io.*;
import java.util.Scanner;
public class hunterarrangemaximumfirstminimumsecond {
public static void main(String[] args) {
	int[] a=new int[100];
	int[] a1=new int[100];
	int n,last,b=1;
	System.out.println("Enter the limit two swap");
	Scanner obj=new Scanner(System.in);
	n=obj.nextInt();
	last=n;
for(int i=0;i<n;i++)
	a[i]=i+1;
for(int i=0;i<n;i++)
{if(i%2==0){
	a[i]=last;
	last--;
}else{
	a[i]=b;
b++;}
	
	}
for(int i=0;i<n;i++)
	System.out.print(a[i]+"  ");
	}
}
