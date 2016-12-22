import java.io.*;
import java.util.*;
public class playerencryption {
public static void main(String[] args) {
	String str1,str2;
	char c[],c1[];
	System.out.println("Enter the string ");
	Scanner obj=new Scanner(System.in);
	str1=obj.next();
	str2=obj.next();
	c=str1.toCharArray();
	c1=str2.toCharArray();
	for(int i=0;i<str1.length();i++)
		c[i]=(char)(c[i]+3);
	for(int i=0;i<str2.length();i++)
		c1[i]=(char)(c1[i]+3);
	for(int i=0;i<str1.length();i++)
		System.out.print(c[i]);
	System.out.println();
	for(int i=0;i<str2.length();i++)
		System.out.print(c1[i]);
}
}
