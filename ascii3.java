import java.io.*;
import java.util.Scanner;
public class test {
public static void main(String arg[]){
	char ch;
	System.out.println("Enter the character to find");
	Scanner s=new Scanner(System.in);
	ch=s.next().charAt(0);
	System.out.println("the ascii number is         "+(int)ch);
}
}
