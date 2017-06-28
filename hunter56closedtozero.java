import java.util.Scanner;
public class hunter56closedtozero {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n,less=99999,sta=0,end=0;
	System.out.println("Enter the n");
	n=in.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++)
		arr[i]=in.nextInt();
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if((Math.abs(arr[i]+arr[j]))<less){
				less=Math.abs(arr[i]+arr[j]);
			sta=arr[i];
			end=arr[j];}
		}
	}
	System.out.println(sta+"   "+end);
}
}
