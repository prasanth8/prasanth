package Guvi;

import java.util.Scanner;

public class Hunter42arraystring {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=in.next();
		System.out.println("Enter the second string");
		String str2=in.next();
		char arr[][]=new char[5][5];
		int k=0;
	
		for(int i=0;i<5;i++){
			
			for(int j=0;j<5;j++){
				if(str1.length()>k){
					arr[i][j]=str1.charAt(k);
					k++;
				}
			}
		}
		
		for(int i=0;i<5;i++){
			
			for(int j=0;j<5;j++){
				String temp="";
			if(j+str2.length()-1<=4){
					for(k=j;k<(j+str2.length());k++){
						temp+=arr[i][k]+"";
					}
				}if(temp.equals(str2)){
					System.out.println("starting index <"+i+","+j+">");
					System.out.println("Ending index <"+i+","+(j+str2.length()-1)+">");
				}
			temp="";
				if(j>=str2.length()-1){
					for(k=j;k>j-str2.length();k--){
						temp+=arr[i][k]+"";
					}
				}
				if(temp.equals(str2)){
					System.out.println("starting index <"+i+","+j+">");
					System.out.println("Ending index <"+i+","+(j-str2.length()-1)+">");
				}
				temp="";
			
				
			if(i>=str2.length()-1){
				
					for(k=i;k>i-str2.length();k--){
						temp+=arr[k][j]+"";
					}
				}if(temp.equals(str2)){
					System.out.println("starting index <"+i+","+j+">");
					System.out.println("Ending index <"+(i-str2.length()-1)+","+j+">");
				}
			temp="";
				if(i+str2.length()-1<=4){
					for(k=i;k<(i+str2.length());k++){
						temp+=arr[k][j]+"";
					}
				}if(temp.equals(str2)){
					System.out.println("starting index <"+i+","+j+">");
					System.out.println("Ending index <"+(i+str2.length()-1)+","+j+">");
				}
				
			}System.out.println();
		}
		
		
	}
}
