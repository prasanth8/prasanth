package prasanth;
import java.util.Scanner;
public class pro68comparingstring {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the First Name");
	String s1=in.next();
	System.out.println("Enter the Second Name");
	String s2=in.next();
	System.out.println("Enter the Pin");
	String Pin=in.next();
	System.out.println("Enter the n value");
	int no=in.nextInt();
	if(s1.length()<s2.length()){
		String temp=s1;
		s1=s2;
		s2=temp;
	}
	else if((s1.length())==(s2.length())){
		int n=s1.compareTo(s2);
		if(n>0){
			String temp=s2;
			s2=s1;
			s1=temp;
		}
	}if(no>Pin.length())
		System.out.println("Please Enter no with in the range");
	else
	System.out.println(s1.charAt(0)+s2+Pin.charAt(no-1)+(no-1));
}
}
