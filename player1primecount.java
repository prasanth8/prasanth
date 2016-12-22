import java.io.*;
import java.util.*;
import java.util.*;
public class testconfirm {
    public static void main(String args[]) 
    {
    	int a,b,flag=0,count=0;
    	System.out.println("Enter the intervals");
    	Scanner obj=new Scanner(System.in);
    	a=obj.nextInt();
    	b=obj.nextInt();
    	for(int i=a;i<=b;i++){
    		for(int j=2;j<i;j++){
    			if(i%j==0)
    				flag=1;
    		}if(flag==0)
    			count++;
    		else
    			flag=0;
    	}
    	System.out.println(count);
    } 
} 
