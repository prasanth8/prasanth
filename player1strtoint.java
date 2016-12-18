import java.io.*;
import java.util.*;
public class player1strtoint {
public static void main(String arg[]){
	String str;
	int length;
	char r[];
	System.out.println("Enter the string to convert");
	Scanner obj=new Scanner(System.in);
	str=obj.next();
	CharArrayWriter ob=new CharArrayWriter();
	r=str.toCharArray();
	length=str.length();
	for(int i=0;i<length;i++){
		System.out.print((int)r[i]);
	}
	
}
}
