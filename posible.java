package codekata;
import java.util.*;
public class posible {
public static void main(String arg[]){
	int i;
	Scanner s=new Scanner(System.in);
	i=s.nextInt();
	if(i>0)
		System.out.println(i+"  is positive");
	else if(i<0)
		System.out.println(i+"  is negative");
	else
		System.out.println(i+"  is zero");
}
}
