import java.io.*;
import java.util.*;
public class huntercheckworkingday {
public static void main(String[] args) {
	String str;
	System.out.println("Enter the string two check the working day");
	Scanner obj=new Scanner(System.in);
	str=obj.next();
	if(str.equals("monday")||str.equals("tuesday")||str.equals("wednesday")||str.equals("THURSDAY")||str.equals("FRIDAY")||str.equals("SATURDAY"))
		System.out.println("true");
	else if(str.equals("MONDAY")||str.equals("TUESDAY")||str.equals("WEDNESDAY")||str.equals("THURSDAY")||str.equals("FRIDAY")||str.equals("SATURDAY"))
		System.out.println("true");
	else if(str.equals("sunday")||str.equals("SUNDAY"))
		System.out.println("false");
	else
		System.out.println("invalid string");
}
}
