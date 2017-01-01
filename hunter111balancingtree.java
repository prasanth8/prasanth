import java.io.*;
import java.util.Scanner;
public class hunter111balancing {
	void checking(String s){
		char c1[];
		int count1=0,count2=0;
		c1=s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(c1[i]>='a'&&c1[i]<='m'||c1[i]>='A'&&c1[i]<='M')
				count1++;
			else if(c1[i]>='n'&&c1[i]<='z'||c1[i]>='N'&&c1[i]<='Z')
				count2++;
		}if(count1==count2)
			System.out.println(s+" is balanced");
		else
			System.out.println(s+" is not balanced");
	}
	public static void main(String[] args) {
		String str;
		System.out.println("Enter the string");
Scanner obj=new Scanner(System.in);
str=obj.next();
hunter111balancing o=new hunter111balancing();
o.checking(str);
	}

}