import java.io.*;
import java.util.Scanner;
public class player1factorial {
public static void main(String arg[]){
	int fac,sum=1;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the number to find factorial");
	fac=obj.nextInt();
	while(fac>0){
		sum=sum*fac;
		fac--;
	}
	System.out.println("The factroial no is   "+sum);
}
}
