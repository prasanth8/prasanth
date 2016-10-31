import java.io.*;
import java.util.Scanner;
public class hcfone {
public static void main(String arg[]){
	int i,hcf=1;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number to find hcf");
	i=s.nextInt();
	for(int j=1;j<i;j++){
		if(i%j==0){
			hcf=j;
		}
	}
System.out.println(" the hcf of the given number is "+hcf);
}
}
