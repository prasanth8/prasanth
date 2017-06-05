package student;
import java.util.Scanner;
public class pro1longestprefix {

	public static void main(String[] args) {
		int n,flag=0,ans=0,length=99,index=0;
		System.out.println("Enter the number of string");
		Scanner in=new Scanner(System.in);
	n=in.nextInt();
	String[] str=new String[n];
	System.out.println("Enter the String to print");
	for(int i=0;i<n;i++){
		str[i]=in.next();
		if(str[i].length()<length){
			length=str[i].length();
			index=i;
		}
	}
	while(flag==0&&(flag+ans)<length){
		char a=str[index].charAt(flag+ans);
		for(int i=0;i<n;i++){
			if(str[i].charAt(flag+ans)!=a||ans==str[0].length()){
				flag=1;
				break;
			}
		}if(flag==0)
			ans++;
	}
	System.out.println(str[index].substring(0,ans));
}
}
