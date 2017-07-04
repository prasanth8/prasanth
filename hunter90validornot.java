package prasanth;
import java.util.Scanner;
public class hunter90validornot {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String str=in.next();
	int count=1;
	int big=0;
	for(int i=0;i<str.length();i++){
		for(int j=i+1;j<str.length();j++)
			if(str.charAt(i)==str.charAt(j))
				count++;
		if(big<count)
			big=count;
		count=1;
	}
	System.out.println((str.length()-big<=(str.length()/2)-1)?"Not Valid":"Valid");
}
}
