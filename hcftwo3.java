import java.io.*;
import java.util.Scanner;

public class hcf {
	public static void main(String arg[]){
		int i1,i2,hcf=0,max;
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the two number to find the hcf");
		i1=s.nextInt();
		i2=s.nextInt();
 if(i1>i2)
	 max=i1;
 else
	 max=i2;
 for(int i=1;i<max;i++){
	 if(i1%i==0&&i2%i==0)
		 hcf=i;
 }
	System.out.println(" The hcf of"+i1+"&"+i2+"is "+hcf);}

}