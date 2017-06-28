import java.util.Scanner;
public class hunter125palindrome {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String str=in.next();
	String ans=null;
	int length=0;
	StringBuffer s=new StringBuffer(str);

	for(int i=0;i<str.length();i++){
		for(int j=i+1;j<str.length();j++){
			if(str.charAt(i)==str.charAt(j)){
				StringBuffer temp=new StringBuffer(s.substring(i,j+1));
				if(str.substring(i,j+1).equals((temp.reverse()).toString())){
					if(length<(j-i)){
						length=j-i;
						ans=s.substring(i,j+1);
					}
				}
			}
		}
	}System.out.println(ans);
}
}
