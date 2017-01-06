import java.io.*;
import java.util.Scanner;
public class pro37displayprime {

public static void main(String arg[]){
long prime=2,digit,ex,flag=0;
System.out.println("The prime numbers are");
do{digit=0;
ex=prime;
while(ex>0){
	digit+=ex%10;
	ex=ex/10;
}
	for(int i=2;i<prime/2;i++){
		if(prime%i==0)
			flag=1;
	}
	if(flag!=1)
		System.out.println(prime);
prime++;
	flag=0;}while(digit<100);
}	
}
