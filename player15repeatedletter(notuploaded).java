import java.io.*;
import java.util.*;
public class plyercheckforcountofletterinstring {
	public static void main(String[] args) {
		String str;
		char c[];
		int count=1,k=0,big=0;
		System.out.println("Enter the string to find");
		Scanner obj=new Scanner(System.in);
		str=obj.next();
		c=str.toCharArray();
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(c[i]==c[j])
					count++;}
		if(count>big)
		{	k=i;
		big=count;
		}
		count=1;
		}
		System.out.println(c[k]+"    is repeated by     "+big+"   times");
	}

}
