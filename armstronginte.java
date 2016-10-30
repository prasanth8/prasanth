import java.io.*;
import java.util.Scanner;
public class amstronginterval {


	public static void main(String arg[]){
		int inte;
		int amstrong,ex,flag=0,m,ans=1,j=0;
		Scanner s=new Scanner(System.in);
		amstrong=s.nextInt();
		inte=s.nextInt();
	if(amstrong>0){while(amstrong<=inte)	{
			ex=amstrong;
			
		     while(ex>0){
			      ex=ex/10;
			      flag=flag+1;
		             } 
		   ex=amstrong;
		              while(ex>0){
			              m=ex%10;
			                for(int i=0;i<flag;i++){
				              ans=ans*m;
			                         }ex=ex/10;
			                      j=ans+j;
			                 ans=1;
			                
		      }if(j==amstrong)
		      { System.out.println(j+" is amstrong");}
	
		amstrong=amstrong+1;
		 j=0;
		flag=0;
	
		}
	}
}}

