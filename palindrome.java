import java.io.*;
import java.util.Scanner;
public class palindrome {
public static void main(String arg[])
{int pali,p,sta,end,t=1;
int length=1,l=0,flag=0;
Scanner s=new Scanner(System.in);
pali=s.nextInt();
p=pali;
while(p>0){
         p=p/10;
             l=l+1;
          length=length*10;
     }p=pali;
                   length=length/10;
for(int i=0;i<=l/2;i++)
{t=t*10;
	sta=pali/length;
    end=p%t;
            if(sta==end)
                {	
            	flag=1;
                pali=pali%length;
              p=p/10;
                length=length/10;
          }
        
   }    if(flag==1)
	   System.out.println("it is palindrome");
   else
	   System.out.println("It is not palindrome number");

	  
   
	}}