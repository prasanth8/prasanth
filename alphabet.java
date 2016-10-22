import java.io.*;
import java.util.Scanner;
public class alphabet {
public static void main(String arg[]){
	char i;
	Scanner s=new Scanner(System.in);
	i=s.next().charAt(0);
	if(i>='a'&&i<='z'||i>='A'&&i<='Z')
		System.out.println(i+" is alphabet");
	else
		System.out.println(i+"is not alphabet");
		
}
}
