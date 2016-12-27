import java.io.*;
import java.util.*;
public class hunter133twowordprintoppsite {
public static void main(String[] args) {
	String str;
    char c[],c1[];
    int k=0,j;
	Scanner obj=new Scanner(System.in);
	str=obj.nextLine();
	c=str.toCharArray();
	c1=str.toCharArray();
	for(int i=0;i<str.length();i++)
		if(c[i]==' ')
			{for(j=i+1;j<str.length();j++)
			{	c1[k]=c[j];
	k++;}         c1[k]=' ';

		for(j=0;c[j]!=' ';j++){
		c1[k+1]=c[j];
		k++;}
		
			}for(int i=0;i<str.length();i++)
				System.out.print(c1[i]);
}
}
