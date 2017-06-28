import java.util.*;
public class hunter92removespace {
	static String str;
	hunter92removespace(String str){
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '){
				while(i<str.length()&&str.charAt(i)!=' ')
				{
			        System.out.print(str.charAt(i));
				i=i+1;
				}System.out.print(" ");}

			
		}
	}
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter the String");
str=in.nextLine();
hunter92removespace objHunter92removespace=new hunter92removespace(str);
}
}
