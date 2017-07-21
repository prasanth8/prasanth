package guvi;
import java.util.*;

public class pro18guviproblem {
	static List<Integer> arr=new ArrayList<Integer>();
	static List<Integer> no_OfCoins=new ArrayList<Integer>();
	
	static void process(int total,List<Integer> arr,int n){
		 int totalNoofCoins=0;
		 for(int i=0;i<n;i++){
			 if(arr.get(i)<=total){
				 no_OfCoins.add((total)/arr.get(i));
				 total%=arr.get(i);
			 }
			 else
				 no_OfCoins.add(0);
		 }
		 if(total==0){
		 for(int i=0;i<n;i++){
			 System.out.print(no_OfCoins.get(i)+" "+arr.get(i)+" Coins   ");
	 totalNoofCoins+=no_OfCoins.get(i);
		 
		 }System.out.println("Totally   "+totalNoofCoins+" No of Coins");
		 }
		 else
			 System.out.println("There is not Possible");
		 }
	 
	 
	 
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the total amount");
		int total=in.nextInt();
		System.out.println("Enter the no of element");
		int n=in.nextInt();
		
		System.out.println("Enter the value of coins");
		for(int i=0;i<n;i++){
			arr.add(in.nextInt());
		}
		Collections.sort(arr,Collections.reverseOrder());
		process(total,arr,n);
	}
}
