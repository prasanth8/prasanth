import java.io.*;
import java.util.*;
public class test {
public static void main(String arg[])throws Exception{
	String str;
	char c[];
    BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
	str=obj.readLine();
	c=str.toCharArray();
	c[0]=Character.toUpperCase(c[0]);
	for(int i=1;i<str.length();i++){
		if(c[i]==' '){
			c[i+1]=Character.toUpperCase(c[i+1]);
			for(int j=i;j<str.length()-1;j++)
		c[j]=c[j+1];
			}
	}for(int i=0;i<str.length()-1;i++)
	System.out.print(c[i]);
}
}