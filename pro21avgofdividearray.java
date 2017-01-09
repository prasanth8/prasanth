import java.util.Scanner;
public class pro21avgofdividearray {
	void process(int[] s,int n){
		int i,j,avg1,sum1=0,sum2=0,avg2,count1=0,count2=0;
		for(i=0;i<=n/2;i++){
sum1+=s[i];
count1++;}
		avg1=sum1/count1;
	
	for(j=i;j<n;j++){
	sum2+=s[j];
	count2++;}
	avg2=sum2/count2;
	if(avg1==avg2)
		System.out.println("both average is same");
	else
		System.out.println("Not possible");
	}
	
	
public static void main(String[] args) {
	int n;
	int[] s=new int[10];
	Scanner ob=new Scanner(System.in);
	System.out.println("Enter the limit of numbers");
	n=ob.nextInt();
	System.out.println("Enter the numbers");
	for(int i=0;i<n;i++)
		s[i]=ob.nextInt();
	pro21avgofdividearray obj=new pro21avgofdividearray();
	obj.process(s,n);
	
}
}
