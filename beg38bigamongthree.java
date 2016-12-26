import java.io.*;
import java.util.*;
public class greatamongthreeno {
public static void main(String[] args) {
	int[] a=new int[100];
	int greater=0;
	System.out.println("Enter the three numbers");
	Scanner obj=new Scanner(System.in);
	for(int i=0;i<3;i++)
	{
		a[i]=obj.nextInt();
		if(a[i]>greater)
			greater=a[i];
	}System.out.println(greater);
}
}
