package Guvi;

import java.util.*;

public class Pro19highmatrix {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		TreeSet<Integer> du=new TreeSet<Integer>();
		System.out.println("Enter the number");
		int n=in.nextInt();
		System.out.println("Enter the matrix");
		int arr[][]=new int[n][n];
		int first=-1,firstlast=-1;
		int last=-1,lastlast=-1;
		for(int i=0;i<n;i++){
		System.out.println(i+1+" row");
			for(int j=0;j<n;j++){
				arr[i][j]=in.nextInt();
			}
		}
		System.out.println("Matrix");
		for(int i=0;i<n-1;i++)
		{
			
			for(int j=0;j<n-1;j++){
      if(arr[i][j]==1&&arr[i+1][j]==1&&arr[i][j+1]==1&&arr[i+1][j+1]==1){
    	du.add((i*10)+j);
    	du.add((i*10)+(j+1));
    	du.add(((i+1)*10)+j);
    	du.add(((i+1)*10)+(j+1));
      }
     }
		
			}
		first=du.first();
		last=du.last();
		firstlast=first%10;
		first=first/10;
		lastlast=last%10;
		last=last/10;
		System.out.println("<"+first+","+firstlast+">");
		System.out.println("<"+last+","+lastlast+">");
		System.out.println("Maximum submatrix is");
		for(int i=0;i<=last-first;i++){
			for(int j=0;j<=lastlast-firstlast;j++)
				System.out.print("1 ");
			System.out.println();
		}
		
	}
		
	}

