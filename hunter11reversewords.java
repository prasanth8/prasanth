package prasanth;
import java.util.Scanner;
import java.util.StringTokenizer;
public class hunter11reversewords {
public static void main(String[] args) {
	String str;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Sentence to Reverse");
	str=in.nextLine();
	String[] s1=str.split(" ");
	for(int i=s1.length-1;i>=0;i--){
		System.out.print(s1[i]+" ");
	}
}
}
