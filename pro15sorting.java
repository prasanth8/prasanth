package sakthi;
import java.util.Scanner;
public class pro15sortingvalue {
public static void main(String[] args) {
	int[] no=new int[50];
	int limit,temp;
	System.out.println("Enter the limit");
	Scanner obj=new Scanner(System.in);
	limit=obj.nextInt();
	System.out.println("Enter the numbers");
	for(int i=0;i<limit;i++)
		no[i]=obj.nextInt();
	for(int i=0;i<limit;i++)
		for(int j=i+1;j<limit;j++)
		{
			if(no[i]<no[j]){
				temp=no[i];
				no[i]=no[j];
				no[j]=temp;
			}
		}for(int i=0;i<limit;i++)
			System.out.println(no[i]);
}
}
