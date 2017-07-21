package guvi;
import java.util.*;

public class hunter98findingdigit {
	static String result="";
	static int count=0;
	static void findingPrime(int noTo_Search,int start,int end){
		for(int i=start;i<=end;i++){
			boolean key=false;
			for(int j=2;j<i;j++){
				if(i%j==0)
					key=true;
			}
			if(!key&&i!=1)
				result+=i+"";
		}
		System.out.println(result);
		for(int i=0;i<result.length();i++)
		if(Character.getNumericValue(result.charAt(i))==noTo_Search)
					count++;
	System.out.println("Totally "+count+"   : "+noTo_Search+"  in the given range prime");
	}
	public static void main(String[] args) {
	
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number to be searched");
			int noTo_Search=in.nextInt();
			System.out.println("Enter the starting number");
			int start=in.nextInt();
			System.out.println("Enter the ending number");
			int end=in.nextInt();
			findingPrime(noTo_Search,start,end);
			
	}
}
