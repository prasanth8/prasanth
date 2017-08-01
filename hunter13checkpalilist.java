package prasanth1;

import java.util.*;

public class hunter13checkpalilist {

	public static void main(String[] args) {
		List<Integer> l1=new LinkedList<Integer>();
		List<Integer> l2=new LinkedList<Integer>();
		char a;
		Scanner in=new Scanner(System.in);
		do{
			System.out.println("Enter the element");
			l1.add(in.nextInt());
			System.out.println("do you want to continue (y/n)");
			a=in.next().charAt(0);
		}while(a=='y'||a=='Y');
		for(int i=l1.size()-1;i>=0;i--){
			l2.add(l1.get(i));
		}
		System.out.println(l1+" "+l2);
		System.out.println(l2.equals(l1)?"Both are equal":"Not equal");
	}
}
