import java.io.*;
import java.util.*;
public class player2workingday {
public static void main(String[] args) {
	String str;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the string to find");
	str=obj.next();
	if(str.equals("sunday")||str.equals("SUNDAY"))
		System.out.println("false");
	else if(str.equals("monday")||str.equals("tuesday")||str.equals("wednesday")||str.equals("thursday")||str.equals("friday"))
		System.out.println("it is working day");
	else if(str.equals("MONDAY")||str.equals("TUESDAY")||str.equals("WEDNESDAY")||str.equals("THURSDAY")||str.equals("FRIDAY"))
		System.out.println("true");
	else
		System.out.println("invalid string");
}
}
