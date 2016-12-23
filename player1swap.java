import java.io.*;
import java.util.*;
public class begswap36 {
public static void main(String[] args) {
	int t1,t2,temp;
	System.out.println("Enter the two number");
	Scanner obj=new Scanner(System.in);
	t1=obj.nextInt();
	t2=obj.nextInt();
	System.out.println("Before swaping "+t1+"    "+t2);
	temp=t1;
	t1=t2;
	t2=temp;
	System.out.println("After swaping "+t1+"     "+t2);
	
}
}
