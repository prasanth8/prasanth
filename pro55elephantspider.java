package guvi;

import prasanth.mainmethod;
import java.util.*;

public class pro55elephantspider {
public static void main(String[] args) {
	int n;
	int w;
	int count=0;
	int temp=0;
	Scanner in=new Scanner(System.in);
     System.out.println("Enter the No of elephant");
     n=in.nextInt();
     System.out.println("Enter the Max weight of the elephant");
     w=in.nextInt();
     int[] arr=new int[n];
     System.out.println("Enter the weight of the elephant");
     for(int i=0;i<n;i++)
    	 arr[i]=in.nextInt();
     Arrays.sort(arr);
     for(int i=0;i<n;i++)
     {temp+=arr[i];
     if(temp<=w)
    	 count++;
     else
    	 break;
     }
     System.out.println("Only "+count+" Can be added in the web");
}
}
