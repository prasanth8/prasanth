import java.io.*;
import java.util.*;
public class propanagramset6 {
public static void main(String[] args) {
	String str;
	char c[];
	int count=0,flag=0;
	char c1[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	Scanner obj=new Scanner(System.in);
	str=obj.nextLine();
	c=str.toCharArray();
	if(str.length()<26)
		System.out.println("it is not a panagram");
	else
	for(int i=0;i<26;i++)
	{for(int j=0;j<str.length();j++)
		{if(c1[i]==c[j])
			flag=1;
		else if(c[j]==' ')
			flag=1;
		else if(flag!=1)
			count=1;
		
		}
		flag=0;
		
	}if(count==1)
		System.out.println("it is not panagram");
	else if(flag==1)
		System.out.println("it is panagram");

}
}
