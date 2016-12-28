import java.io.*;
import java.util.Scanner;
public class hunter123 {
	void removerepeated(String a){
		char c[],c1[]={'a','b'};
		int flag=0,k=0;
		c=a.toCharArray();
		c1=a.toCharArray();
		for(int i=0;i<a.length();i++){
			for(int j=0;j<a.length();j++)
		{if(i!=j)
				if(c[i]==c[j])
					flag=1;}
				
			if(flag<1)
				{c1[k]=c[i];k++;
				}
		flag=0;}
		if(a.length()!=k)
		for(int i=0;i<k;i++)
			System.out.print(c1[i]);
		else
			System.out.println("there is no reapeated letters");
	}
public static void main(String[] args) {
	String str;
	System.out.println("Enter the string to remove reapeated letters");
	Scanner obj=new Scanner(System.in);
	str=obj.next();
	hunter123 s=new hunter123();
	s.removerepeated(str);
	
}
}
