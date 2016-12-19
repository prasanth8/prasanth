import java.io.*;
import java.util.*;
public class player1stroddevenswap {
public static void main(String arg[]){
	String str; 
	char r[];
	int length;
	System.out.println("Enter the string to swap");
	CharArrayWriter ch=new CharArrayWriter();
	Scanner obj=new Scanner(System.in);
	str=obj.next();
	r=str.toCharArray();
	for(int i=0;i<str.length()-1;i++){
    System.out.print(r[i+1]+""+r[i]);
    i++;
	}
	}	
}
