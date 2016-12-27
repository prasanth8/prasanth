import java.io.*;
import java.util.*;
public class hunter132printstar {
public static void main(String[] args) {
	int a;
	System.out.println("Enter the number to print star");
	Scanner obj=new Scanner(System.in);
	a=obj.nextInt();
	for(int i=a;i>0;i--){
		for(int j=a;j>0;j--)
			System.out.print("*");
		System.out.print(" ");
		for(int k=a;k>0;k--)
			System.out.print("*");
		System.out.println();
		a--;
}}
}
