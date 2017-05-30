import java.util.Scanner;
public class hunterevenvalueinqueue {

	public static void main(String[] args) {
		int n,ans=1;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter The Number To Find out the position of the Person in original queue");
		n=in.nextInt();
		if(n%2==1)
		n=n+1;
		do{
			ans=2*ans;	
			}while(ans<n);
		System.out.println("The position of the person will be "+ans/2);
	}

}
