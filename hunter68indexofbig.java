import java.util.Scanner;
public class hunter68indexofbig {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int big=0,index=-1;
	System.out.println("Enter the n value");
	int n=in.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter the element");
for(int i=0;i<n;i++)
	arr[i]=in.nextInt();
	for(int i=1;i<n;i++)
	{
	if((Math.abs(arr[i-1]-arr[i]))>big){
		big=Math.abs((arr[i-1]-arr[i]));
		index=i-1;
	}	
	}System.out.println("Index of element :"+index);
System.out.println(arr[index]+"("+big+")");
}
}
