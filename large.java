package codekata;
import java.util.*;

public class large1 {
	public static void main(String arg[])
	{
		int n,k=0;
		Scanner s=new Scanner(System.in);
		for(int i=0;i<3;i++){
			n=s.nextInt();
			if(n>k){
				k=n;
			}
		}System.out.println(k+" is largest");
	}
}
