import java.io.*;
import java.util.Scanner;
public class Ascii3 {
	public static void main(String arg[]){
		char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char A[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		int c=65,s=97;
		System.out.println("ASCII code for the small and capital ");
		for(int i=0;i<26;i++){
			
		
				System.out.print("The ASCII code for"+a[i]+"is     "+s);
				System.out.print("\tThe ASCII code for"+A[i]+"is     "+c+"\n");
			s++;c++;
		}
		
	}

}
