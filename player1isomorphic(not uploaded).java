import java.io.*;
import java.util.*;
public class player1isomophic {
public static void main(String[] args) {
	String str1,str2;
	char c1[],c2[];
	int flag=0;
	System.out.println("Enter the two string to compare isomorphic");
	Scanner obj=new Scanner(System.in);
	str1=obj.next();
	str2=obj.next();
	c1=str1.toCharArray();
	c2=str2.toCharArray();
	if(str1.length()==str2.length())
for(int i=0;i<str1.length();i++){
	for(int j=i+1;j<str1.length();j++)
	{	if(c1[i]==c1[j]&&c2[i]==c2[j])
		{flag=1;
		
		}
	
		
	}
}
	if(flag==1)
	System.out.println("it is isomorphic");
else
	System.out.println("it is not isomorphic");
	}}

