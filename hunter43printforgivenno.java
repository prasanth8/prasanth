import java.util.Scanner;
public class hunter43printforgivenno {
public static void main(String[] args) {
	String str;
	char temp='\0',a[];
	System.out.println("Enter the string");
	Scanner in=new Scanner(System.in);
	str=in.next();
	a=str.toCharArray();
	for(int i=0;i<str.length();){
		int k=0,ans=0;
		if(a[i]>=97&&a[i]<=122){
			temp=a[i];
			i++;
		}
		else{
				while(k!=2&&i<str.length()&&a[i]>=48&&a[i]<=57){
			ans=(ans*10)+Character.getNumericValue(a[i]);
			i++;
			k++;
		
		}
				
	}
		for(int j=0;j<ans;j++)
			System.out.print(temp);}
}
}
