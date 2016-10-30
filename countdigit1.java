import java.io.*;
import java.util.Scanner;
public class countdigit {
void count(Integer i){
	int count=1;
	for(int j=1;j<=i;j++){
		i=i/10;
		count++;
	}System.out.println(count);
}
	public static void main(String arg[]){
		int i;
		System.out.println("Enter the number to find digit");
		Scanner s=new Scanner(System.in);
		i=s.nextInt();
		Integer io=new Integer(i);
		countdigit obj=new countdigit();
		obj.count(i);
	}

}
