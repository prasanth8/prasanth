import java.util.Scanner;
public class hunter53printsubstringmentioned {
public void process(String str,int n){
	char ans[];
	ans=str.toCharArray();
	for(int i=1;i<str.length();i++){
		System.out.print(ans[0]);
		for(int j=0;j<n-1;j++)
			System.out.print(ans[i+j]);
		if(i+n-1>=str.length())
			break;	
		System.out.println();
		}
}
	public static void main(String[] args) {
		String str;
		int n;
		System.out.println("Enter the string");
	Scanner in=new Scanner(System.in);
	str=in.next();
	System.out.println("Enter the number");
	n=in.nextInt();
	hunter53printsubstringmentioned obj=new hunter53printsubstringmentioned();
	obj.process(str, n);
			}

}
