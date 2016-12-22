import java.io.*;
import java.util.*;
import java.util.*;
public class testconfirm {
    public static void main(String args[]) 
    { int a,count=0;
    String str;
    char c[];
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    str=obj.nextLine();
   c=str.toCharArray();
   for(int i=0;i<str.length();i++){
	   if(c[i]==' ')
		   count++;
	   
   }count=count+1;
   System.out.println("the no of words in the given line is "+count);
        } 
} 