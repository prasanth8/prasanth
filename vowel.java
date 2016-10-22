import java.io.*;
import java.util.Scanner;
public class vowel {
	public static void main(String arg[]){
char i;
Scanner s=new Scanner(System.in);
i=s.next().charAt(0);
switch(i){
case 'a':
	System.out.println(i+" is vowel");
	break;
case 'e':
	System.out.println(i+" is vowel");
	break;
case 'i':
	System.out.println(i+" is vowel");
	break;
case 'o':
	System.out.println(i+" is vowel");
	break;
case 'u':
	System.out.println(i+" is vowel");
	break;
case 'A':
	System.out.println(i+" is vowel");
	break;
case 'E':
	System.out.println(i+" is vowel");
	break;
case 'I':
	System.out.println(i+" is vowel");
	break;
case 'O':
	System.out.println(i+" is vowel");
	break;
case 'U':
	System.out.println(i+" is vowel");
	break;
	default:
		System.out.println(i+"is constant");
}
}}