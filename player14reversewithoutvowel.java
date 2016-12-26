import java.io.*;
import java.util.*;
public class playerreversestringwithoutvowel {
public static void main(String[] args) {
	String str1,str2;
	char c1[],c2[];
	int length;
	Scanner obj=new Scanner(System.in);
	str1=obj.next();
c1=str1.toCharArray();
c2=str1.toCharArray();
length=str1.length();
for(int i=0;i<str1.length();i++){
	c2[i]=c1[length-1];
length--;
}
for(int i=0;i<str1.length();i++)
{if(c2[i]=='A'||c2[i]=='E'||c2[i]=='I'||c2[i]=='O'||c2[i]=='U'||c2[i]=='a'||c2[i]=='e'||c2[i]=='i'||c2[i]=='o'||c2[i]=='u')
	System.out.print("");
else
	System.out.print(c2[i]);
	}
}


}