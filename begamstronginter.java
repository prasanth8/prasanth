import java.io.*;
import java.util.*;
import java.util.*;
public class testconfirm {
    public static void main(String args[]) 
    { int a,sum=0,am,temp=0,rem,b;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    a=obj.nextInt();
    b=obj.nextInt();
   for(int i=a;i<=b;i++)
   {  temp=i;
    while(i>0){
    	rem=i%10;
    	sum=sum+rem*rem*rem;
    	i=i/10;
    }if(temp==sum)
    	System.out.println(temp+"it is amstrong");
    sum=0;
 i=temp;
        } 
} }