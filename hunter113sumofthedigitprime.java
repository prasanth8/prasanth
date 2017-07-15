package guvi;

import java.util.Scanner;

public class hunter113sumofthedigitprime {

	public int findPrime(int no){
		int flag=0;
		for(int k=2;k<no;k++){
			if(no%k==0)
				flag=1;
		}
		return (flag==0?1:-1);
	}
	
	public static void main(String[] args) {
		int l;
		int r;
		int count=0;
		int sum=0;
		hunter113sumofthedigitprime obj=new hunter113sumofthedigitprime();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter The Range L to R");
		l=in.nextInt();
		r=in.nextInt();

		for(int i=l;i<=r;i++){
			sum=0;
			int val=i;
		
			for(;val>0;val/=10){
				sum+=val%10;
				
			}
			if(sum!=1&&(obj.findPrime(sum))!=-1)
				count++;
		
		}System.out.println("The count is "+count);
	}
}
