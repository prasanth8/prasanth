import java.io.*;
import java.util.*;
public class player1reversedigit {
public static void main(String arg[]){
	int rev,n;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the number to reverse the digit");
	n=obj.nextInt();
	while(n>0){
		rev=n%10;
		System.out.print(rev);
		n=n/10;
	}
}
}