package prasanth1;
import java.util.Scanner;
import java.util.StringTokenizer;
public class hunter92removespace {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String str;
	str=in.nextLine();
	StringTokenizer ex=new StringTokenizer(str);
	while(ex.hasMoreTokens()){
		System.out.print(ex.nextToken()+" ");
	}
}
}
