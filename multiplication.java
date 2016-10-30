import java.io.*;
import java.util.Scanner;
public class multiplication {
void mul(Integer t,Integer l){
	for(int i=1;i<=l;i++)
	{
		System.out.println(i+"*"+t+"="+i*t);
		}
	}

public static void main(String arg[]){
	int t,l;
	System.out.println("Enter the table and limit");
	Scanner s=new Scanner(System.in);
	t=s.nextInt();
	l=s.nextInt();
	Integer i=new Integer(t);
	Integer j=new Integer(l);
	multiplication obj=new multiplication();
	obj.mul(t, l);
	
}
}
