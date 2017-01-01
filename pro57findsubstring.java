import java.io.*;
import java.util.Scanner;
public class pro57findsubstring {
public static void main(String[] args) {
	String str1,str2;
	char c1[],c2[];
	int count=0,flag=0,big=0;
	System.out.println("Enter the two string");
	Scanner obj=new Scanner(System.in);
	str1=obj.next();
	str2=obj.next();
	c1=str1.toCharArray();
	c2=str2.toCharArray();
	for(int i=0;i<str1.length();i++)
	{	for(int j=0;j<str2.length();j++)
		{
			if(c1[i]==c2[j])
			{
				count++;
				 i++;
				 
			}
		}if(count>flag)
		{	flag=count;
		
		i=i-count;
		big=i;}else
			i=i-count;
		count=0;}for(int i=big;i<flag;i++)System.out.print(c1[i]);
}
}
