package prasanth;
import java.io.*;
import java.util.Scanner;
public class test {
	char c[];
	String ex[]=new String[100];
	public String process(String str){
		int sta=0,length=0,m,flag=0;
		c=str.toCharArray();
		for(int i=0;i<str.length();i++)    //to find the first and last letters are equal then it store in the array
			for(int j=i+2;j<str.length();j++)
				if(c[i]==c[j]){
					ex[sta]=str.substring(i,j+1);
					sta++;
				}
		for(int i=0;i<sta;i++)        
		{  
			c=ex[i].toCharArray();
		   m=0;
		         for(int k=ex[i].length()-1;k>ex[i].length()/2;k--){
			                 if(c[k]==c[m])
				             m++;
			                else
				            flag=1;
		                  }   if(flag!=1&&length<ex[i].length())
		                                    {	str=ex[i];
		                                      length=ex[i].length();}
		                                         else
		                                      	flag=0;
		                               	}
			return str;
	}
public static void main(String[] args) {
	String str;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string to find");
str=s.next();
test obj=new test();
System.out.println("The longest palindrome in the given string is      "+obj.process(str));
}
}