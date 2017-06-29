import java.util.Scanner;
public class hunter69emailvalidation {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the EmailId");
	String str=in.next();
	StringBuffer s1=new StringBuffer(str);
	int index1=str.indexOf("@");
	int index2=str.indexOf(".");
	if(index1!=-1&&index2!=-1){
		s1.deleteCharAt(index1);
		s1.deleteCharAt(index2-1);
		if(s1.indexOf("@")==-1&&s1.indexOf(".")==-1&&((index2-index1)-2)==4&&(index1>3)&&(str.substring(str.length()-4,str.length())).equals(".com")){
			System.out.println("Valid");
		}
		else
			System.out.println("Not Valid");
	}
	else
		System.out.println("Not Valid");
	
	
}
}