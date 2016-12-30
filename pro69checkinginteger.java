import java.io.*;
import java.util.Scanner;
public class pro69checkinginteger {
public static void main(String[] args) {
	String b;
	char c[];
	int[] a=new int[10];
	int count=0,temp,big,small,sum1=0,sum2=1,first=0,second=0;
	Scanner obj=new Scanner(System.in);
	b=obj.next();
	c=b.toCharArray();
	for(int i=0;i<b.length();i++)//check for numbers
	{if(c[i]>=48&&c[i]<=57)
	{	a[count]=Character.getNumericValue(c[i]);
		count++;}
	}for(int i=0;i<count;i++)
		for(int j=0;j<count;j++)//for ascending the numbers
		{
			if(a[i]>a[j]){
				temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			}
		}big=a[0];
		small=a[count-1];
		for(int i=0;i<count;i++)//performing operation
			{sum1=sum1+(big*a[i]);
			sum2=sum2*(small+a[i]);}
		
	
	do{while(sum1>0){  //reduce to one digit
		first=first+(sum1%10);
		sum1=sum1/10;}
	sum1=first;
	first=0;
	}while(sum1>9);
	do{while(sum2>0){
		second=second+(sum2%10);
		sum2=sum2/10;}
	sum2=second;
	second=0;
	}while(sum2>9);
	if(sum1>sum2)//check for the less value
		System.out.println("square of"+(sum2)+"is"+sum2*sum2);
	else
		System.out.println("square of"+(sum1)+" is "+sum1*sum1);
}}
