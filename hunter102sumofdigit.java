 import java.util.Scanner;
public class hunter102sumofdigit {
	void process(int no){
		int sum=0,ex;
		if(no>9)
		{	while(no>0){
				ex=no;
				while(ex>0){
				sum+=ex%10;
				ex=ex/10;
				}no=no/10;	
		}	System.out.println(sum);
		}else
				System.out.println("the number is less then 9 ");
	
	}
public static void main(String[] args) {
	int no;
	System.out.println("Enter the number");
	Scanner obj=new Scanner(System.in);
	no=obj.nextInt();
	hunter102sumofdigit ob=new hunter102sumofdigit();
	ob.process(no);
}
}
