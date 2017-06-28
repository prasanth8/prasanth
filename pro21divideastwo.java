import java.util.Scanner;
public class pro21divideastwo {
	static int n,sum1=0,sum2=0;
	public void process(int n,int[] arr){
		for(int i=0;i<n-1;i++){
			 for(int j=0;j<=i;j++){
				sum1+=arr[j];
				
			 		}
			 	for(int k=n-1;k>i;k--){
			 					sum2+=arr[k];
			 					}
			 				if((sum1/(i+1))==(sum2/(n-(i+1)))){
			 					System.out.println("Possible");
			 						break;
			 							}
			 						sum1=0;sum2=0;
		}
		if(sum1==0)
			System.out.println("Not possible");
	}
public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the n value");
	n=in.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the element");
	for(int i=0;i<n;i++)
		arr[i]=in.nextInt();

	pro21divideastwo obj=new pro21divideastwo();
	obj.process(n,arr);
}
}
