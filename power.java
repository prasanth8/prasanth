import java.io.*;
import java.util.Scanner;
public class power {
	public static void main(String arg[]){
		int power,no,k=1;
		Scanner n=new Scanner(System.in);
		no=n.nextInt();
		power=n.nextInt();
		for(int i=0;i<power;i++)
		k=k*no;
		System.out.println(k);
	}
	

}
