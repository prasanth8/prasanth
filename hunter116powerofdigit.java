import java.io.*;
import java.util.Scanner;
public class hunter116sumofthedigit {
	void pro(int n){
		double b=0;
		while(n>0){
	b=b+Math.pow(n,n-1);
		n--;}System.out.println(b);
	}
public static void main(String[] args) {
	int no;
	System.out.println("Enter the number to find the sum");
	Scanner obj=new Scanner(System.in);
	no=obj.nextInt();
	hunter116sumofthedigit obj1=new hunter116sumofthedigit();
	obj1.pro(no);
}
}
