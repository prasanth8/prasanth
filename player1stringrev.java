import java.util.*;
import java.io.*;
public class playerstringrev1 {
	public static void main(String arg[]){
		String rev;
		int length;
		char r[];
		System.out.print("Enter the string to reverse");
		Scanner obj=new Scanner(System.in);
		rev=obj.next();
		CharArrayWriter ch=new CharArrayWriter();
		r=rev.toCharArray();
		length=rev.length()-1;
		while(length>=0){
			System.out.print(""+r[length]);
			length--;
		}
	}

}
