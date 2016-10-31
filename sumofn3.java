import java.io.*;
import java.util.Scanner;
public class sumofallnumber {
	void sum(Integer n){
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}System.out.println("sum is "+sum);
		
	}
	public static void main(String arg[]){
		int n;
		System.out.println("Enter the number to calculate");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	Integer j=new Integer(n);
	sumofallnumber obj=new sumofallnumber();
	obj.sum(n);
	}

}
