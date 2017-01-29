package sakthi;
import java.util.Scanner;
public class pro32ascendingin2d {
public static void main(String arg[]){
	int[][] a=new int[5][10];
	int n,m,temp;
	System.out.println("Enter the row and coloumn");
	Scanner obj=new Scanner(System.in);
	n=obj.nextInt();
	m=obj.nextInt();
	System.out.println("Enter the numbers");
	for(int i=0;i<n;i++)
		for(int j=0;j<m;j++)
			a[i][j]=obj.nextInt();


for(int i=0;i<n;i++){
	for(int j=0;j<m;j++)
{for(int s=j+1;s!=m;s++)
if(a[i][j]>a[i][s]){
	temp=a[i][j];
	a[i][j]=a[i][s];
	a[i][s]=temp;
	}
}}
for(int j=0;j<m;j++){
	for(int i=0;i<n;i++)
	{
		for(int s=i+1;s!=n;s++)
			if(a[i][j]>a[s][j])
			{
				temp=a[i][j];
				a[i][j]=a[s][j];
				a[s][j]=temp;
			}
	}
}
for(int i=0;i<n;i++)
{	for(int j=0;j<m;j++)
		System.out.print(a[i][j]+" ");
System.out.println();
}

}}
