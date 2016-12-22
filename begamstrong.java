import java.io.*;
import java.util.*;
import java.util.*;
public class testconfirm {
    public static void main(String args[]) 
    { int a,sum=0,am,temp,rem;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    a=obj.nextInt();
   
    temp=a;
    while(a>0){
    	rem=a%10;
    	sum=sum+rem*rem*rem;
    	a=a/10;
    }if(temp==sum)
    	System.out.println(temp+"it is amstrong");
    else
    	System.out.println(temp+"it is not amstrong");
        } 
} 
