package prasanth;
import java.util.Scanner;
public class hunter64currencynote {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number");
	int no=in.nextInt();
	int money[]=new int[5];
		money[0]=no/500;
		no=no%500;
		money[1]=no/100;
		no=no%100;
		money[2]=no/50;
		no=no%50;
		money[3]=no/10;
		no=no%10;
		money[4]=no/1;
		no=no%1;
	System.out.println(money[0]+money[1]+money[2]+money[3]+money[4]);
	}
}
