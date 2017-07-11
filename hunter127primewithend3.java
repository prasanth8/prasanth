package guvi;

import java.util.Scanner;

public class hunter127primewithend3 {

	public static void main(String[] args) {
		
		int n;
		int sum=0;
		int flag=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the N");
		n=in.nextInt();
		for(int i=2;i<=n;i++){
			for(int j=2;j<i;j++){
				if(i%j==0)
					flag=1;
			}
			if(flag==0&&(i%10==3)){
				sum+=i;
			}
			flag=0;
		}
		System.out.println("Sum of the prime number is "+sum);
	}
}
