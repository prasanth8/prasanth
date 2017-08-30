
import java.util.Scanner;

public class Pro66 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int total=0,amount=0,arrval=0;
		System.out.println("Enter the number of items");
		int no=in.nextInt();
		int arr[]=new int[no];
		System.out.println("Enter the no of item Anna not eat");
		int val=in.nextInt();
		int arr1[]=new int[val];
		System.out.println("Enter the items");
		for(int i=0;i<val;i++)
			arr1[i]=in.nextInt();
		System.out.println("Enter the items amount");
		for(int i=0;i<no;i++)
		{	arr[i]=in.nextInt();
	if(arrval<val&&arr1[arrval]==i){
		arrval=arrval+1;
		
	}else
		total=total+arr[i];
		}
		
			
		System.out.println("Enter the refuned amount");
		amount=in.nextInt();
		System.out.println(total/2==amount?"Bon Appetit":amount-(total/2));
	}
}
