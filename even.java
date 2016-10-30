import java.io.*;
import java.util.Scanner;
public class even2 {public static void main(String arg[]){
	int sta,end,ans=0;
	Scanner s=new Scanner(System.in);
	sta=s.nextInt();
	end=s.nextInt();
	while(sta<=end){
		if(sta%2==0)
			ans=ans+sta;
			sta++;
		
	}System.out.println(ans);
}

}
