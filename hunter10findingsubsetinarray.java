package guvi;

import java.util.Scanner;
import java.util.ArrayList;

public class hunter10findingsubsetinarray {
	ArrayList<Integer> a1=new ArrayList<Integer>();
	ArrayList<Integer> a2=new ArrayList<Integer>();
	static Scanner in=new Scanner(System.in);
	
	
	
	hunter10findingsubsetinarray(int length1,int length2){// For adding a element into the ArrayList
		System.out.println("Enter the array 1");
		for(int i=0;i<length1;i++)
			a1.add(in.nextInt());
		System.out.println("Enter the array 2");
		for(int i=0;i<length2;i++)
			a2.add(in.nextInt());
	}
	
	public int findsubset(){                    //Checking for subset
		int flag=0;
		for(int i=0;i<a1.size();i++)
			if(!a2.contains(a1.get(i)))
				flag=1;
		
		return ((flag==1)?-1:1);
	}
	
	
	
public static void main(String[] args) {

	System.out.println("Enter the limit of the array a1");
	int length1=in.nextInt();
	System.out.println("Enter the limit of the array in a2");
	int length2=in.nextInt();
	hunter10findingsubsetinarray objForFinding=new hunter10findingsubsetinarray(length1,length2);
	System.out.println((objForFinding.findsubset()==1)?"A1 is substring of A2":"A1 is not substring of A2");
	
}
	
	
	
	
	
}
