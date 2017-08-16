package prasanth;
import java.util.Scanner; 

public class Hunter85no2s {

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("Enter the N value");
int n=in.nextInt();
int count=0;
for(int i=0;i<=n;i++){
	String str=String.valueOf(i);
	for(int j=0;j<str.length();j++){
		if(str.charAt(j)=='2')
			count++;
	}
}
System.out.println("The number of 2's in the given range is "+count);

	}

}
