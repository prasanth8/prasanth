import java.util.Scanner;
public class hunter55rotatearay {
public void process(int n,int k){
	int temp=n;
	int[] a=new int[n];
	for(int i=n;i>0;i--){
		if(k>0){
			a[i-1]=k;
			k--;
		}
		else{
			a[i-1]=n;
			n--;
		}
	}
	
	for(int i=0;i<temp;i++)
		System.out.println(a[i]);
	
}
	public static void main(String[] args) {
		int n,k;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no :"); 
		n=in.nextInt();
		System.out.println("Enter the key");
		k=in.nextInt();
		 hunter55rotatearay obj=new  hunter55rotatearay();
		 obj.process(n,k);
	}

}
