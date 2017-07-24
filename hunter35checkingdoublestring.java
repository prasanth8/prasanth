package guvi;

import java.util.Scanner;

public class hunter35checkingdoublestring {

	public static void main(String[] args) {
		System.out.println("Enter the string to find double or not");
Scanner in=new Scanner(System.in);
String str=in.next();
int flag=0;

if(((str.substring(0,str.length()/2))).equals((str.substring(str.length()/2,str.length()))))
	System.out.println("It is a double string");
else{
for(int i=0;i<str.length();i++){
	StringBuffer str1=new StringBuffer(str);
	str1=str1.deleteCharAt(i);
	if(((str1.substring(0,str1.length()/2)).toString()).equals((str1.substring(str1.length()/2,str1.length())))){
		flag=1;
		break;
	}
}
System.out.println((flag==0)?"Not possible ":"It is doublestring");
}

	
	
	
	}
}
