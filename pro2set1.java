import java.io.*;
import java.util.*;
public class Example {
public static void main(String[] args) {
int[] a=new int[10];
int b,i=0,temp=0,least;
System.out.println("Enter the number and eleminating digit");
Scanner obj=new Scanner(System.in);
b=obj.nextInt();
least=obj.nextInt();
while(b>0)
{a[i]=b%10;
b=b/10;
i++;
	}for(int j=0;j<i;j++)
	for(int k=j+1;k<i;k++)
		if(a[j]>a[k])
			{temp=a[k];
	a[k]=a[j];
	a[j]=temp;}
			
	System.out.println();		


for(int k=0;k<i-least;k++)
	System.out.println(a[k]);
	
}}