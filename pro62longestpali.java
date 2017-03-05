package prasanth;
import java.io.*;
import java.util.Scanner;
public class pro64longestpali {
	public String[] sam=new String[20];
	public char c[];
	
	public void process(String str){
		int sta=0,end=0,length=0,m,flag=0;
		c=str.toCharArray();
		for(int i=0;i<str.length();i++)//store string equal character in first and last position
			for(int j=i+2;j<str.length();j++)
				if(c[i]==c[j]){
				sam[sta]=str.substring(i,j+1);
				sta++;
				}

		while(end<sta){      //finding for longest palindrome
			m=sam[end].length()-1;
			c=sam[end].toCharArray();
			for(int i=0;i<sam[end].length()/2;i++)
			{
			if(c[i]==c[m])
				m--;
			else
				flag=1;
				
			}if(flag!=1&&length<sam[end].length())
			{
		length=sam[end].length();
				str=sam[end];
			}else
				flag=0;
				end++;
		}System.out.println("the longest palindrome is    = "+str);
	}
public static void main(String[] args) {
	String str;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string to find longest palindrome");
	str=s.next();
	pro64longestpali obj=new pro64longestpali();
	obj.process(str);
	
}
}