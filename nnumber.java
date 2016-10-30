import java.io.*;
import java.util.Scanner;
public class nnumber {
	void method(Integer i){
		int k=0,n;
		for(int j=0;j<i;j++){
			System.out.println("Enter the number to find");
			Scanner s1=new Scanner(System.in);
		n=s1.nextInt();	
		k=k+n;
		}System.out.println(k);
		
	}
	public static void main(String arg[]){
		int i;
		System.out.println("Enter the number ");
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		Integer o=new Integer(i);
		nnumber obj=new nnumber();
		obj.method(i);
	}

}
