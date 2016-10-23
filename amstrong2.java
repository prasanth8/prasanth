import java.io.*;
import java.util.Scanner;
public class amstrong2 {
	public static void main(String arg[]){
		int amstrong,ex,flag=0,m,ans=1,j=0;
		Scanner s=new Scanner(System.in);
		amstrong=s.nextInt();
		ex=amstrong;
		while(ex>0){
			ex=ex/10;
			flag=flag+1;
		}while(amstrong>0){
			m=amstrong%10;
			for(int i=0;i<flag;i++){
				ans=ans*m;
			}amstrong=amstrong/10;
			j=ans+j;
			ans=1;
		}System.out.println(j);
	}

}
