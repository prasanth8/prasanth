package prasanth;
import java.io.*;
import java.util.Scanner;
public class test {
	char c[];
	public void process(String str){
		c=str.toCharArray();
		int sta=0,fina=0,length=0;

		String[] str1=new String[10];
		for(int i=0;i<str.length()-1;i++){
			for(int j=i+1;j<str.length();j++)
			{
				if(c[i]==c[j])
				{
					str1[sta]=str.substring(i,j);
					sta++;
					break;
				}
			}
		}

		for(int i=0;i<sta;i++)
			if(length<str1[i].length()){
				fina=i;
				length=str1[i].length();
			}System.out.println("longest substring is    "+str1[fina]+"  with length  "+length);
	}
public static void main(String[] args) {
	String str;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the string to find");
	str=s.next();
	test obj=new test();
obj.process(str);
    
}
}
