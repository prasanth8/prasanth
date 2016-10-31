import java.io.*;
import java.util.Scanner;
public class reverse3 {
void reverse(Integer rev){
	int i;
	while(rev>0){
		i=rev%10;
		rev=rev/10;
	System.out.print(i);
	}
}public static void main(String arg[]){
	int rev;
	Scanner s=new Scanner(System.in);
	rev=s.nextInt();
	Integer i=new Integer(rev);
	reverse3 obj=new reverse3();
	obj.reverse(rev);
}
}
