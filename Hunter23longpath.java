package Guvi;

import java.util.Scanner;

public class Hunter23longpath {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
System.out.println("Enter the n value");
int n=in.nextInt();
System.out.println("Enter the m value");
int m=in.nextInt();
System.out.println("Enter the element to insert into the list");
int arr[][]=new int[n][m];

int a=0,b=0;


for(int i=0;i<n;i++){
	
	for(int j=0;j<m;j++){
		arr[i][j]=in.nextInt();
	}
	
}int sum=arr[0][0];
while(a!=n-1||b!=m-1){
	int a1=(a==n-1?a:a+1);
	int b1=(b==m-1?b:b+1);
	
	if(a!=n-1&&sum+arr[a1][b]>sum+arr[a][b1]){
		sum+=(arr[a1][b]);
		a=a+1;
	}else if(b!=m-1&&sum+arr[a1][b]<sum+arr[a][b1]){
		sum+=(arr[a][b1]);
		b=b+1;
	}else if(a==n-1){
		sum+=arr[a][b1];
		b=b+1;
	}else if(b==m-1){
		sum+=arr[a1][b];
		a=a+1;
	}
	
	
	
}

System.out.println("Sum of the path is "+sum);		
		
	}
	
}
