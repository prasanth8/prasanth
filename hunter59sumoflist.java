package guvi;

import java.util.*;

public class hunter59sumoflist {

	static List<Integer> l1=new ArrayList<Integer>();
	static List<Integer> l2=new ArrayList<Integer>();
	static List<Integer> sum=new ArrayList<Integer>();
	
static List<Integer> addTwoList(){
	
	for(int i=0;i<l1.size();i++)
		sum.add((l1.get(i))+l2.get(i));
	
	return sum;
}
	
	
	public static void main(String[] args) {
		System.out.println("Enter the limit of the list");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+"  element to insert into the list 1");
			l1.add(in.nextInt());
			System.out.println("Enter "+(i+1)+"  element to insert into the list 2");
			l2.add(in.nextInt());
		}
		
		
		System.out.println("The sum of the two linked list is "+addTwoList());
	}
}
