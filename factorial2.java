import java.io.*;
import java.util.Scanner;
public class factorial {
	void fact(Integer fac){
		int n=1;
		while(fac>0){
			n=n*fac;
			fac--;
		}
		System.out.println(n);
		
	}
	public static void main(String arg[]){
		int fac;
		Scanner s=new Scanner(System.in);
		fac=s.nextInt();
		Integer i=new Integer(fac);
		factorial obj=new factorial();
		obj.fact(fac);
	}

}
