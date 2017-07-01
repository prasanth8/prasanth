package prasanth;
import java.util.Scanner;
public class pro60findingtiminginterval {
    public static void main(String[] args) {
	int sta=3,count=3,no;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Number");
	no=in.nextInt();
	for(int i=1;i<no;i++){
		if(count==1){
			sta=sta*2;
			count=sta;
		}
		else
			count--;
	}System.out.println("stranger count at the given time is "+count);
  }
}
