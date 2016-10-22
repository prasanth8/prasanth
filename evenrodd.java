package codekata;
import java.util.*;
public class oddreven {
public static void main(String arg[]){
	int i;
	Scanner s=new Scanner(System.in);
	i=s.nextInt();
	if(i%2==0)
		System.out.println(i+" is even");
	else
		System.out.println(i+"  is odd");
}
}
