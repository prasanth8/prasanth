package prasanth;
import java.util.ArrayList;
import java.util.Scanner;
public class hunter93reversestrinandchangetocaps {
public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	StringBuffer out=new StringBuffer();
	System.out.println("Enter the String To Convert");
	String str=in.nextLine();
	int index=0,index2=0;
	int a[]=new int[100];
	String s[]=str.split(" ");
	for(int i=0;i<s.length;i++){
		index=0;
		index2=0;
		for(int j=0;j<s[i].length();j++){
		     if(Character.isUpperCase(s[i].charAt(j)))
		{	a[index]=j;
		index++;}
		}
		StringBuffer temp=new StringBuffer(s[i].toLowerCase());
		temp=temp.reverse();
		for(int k=0;k<temp.length();k++)
		{
			if(k==a[index2]){
				System.out.print(Character.toUpperCase(temp.charAt(k)));
				index2++;
			}
			else
				System.out.print(temp.charAt(k));
		}System.out.print(" ");
	}
	
}
}
