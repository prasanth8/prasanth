
import java.util.Scanner;
public class hunter115createpassword {
	char c1[],c2[];
	int length;
	public String addchar(String str1,String str2){
	length=str1.length()-str2.length();
	for(int i=1;i<=length;i++)
	str2=str2+i;
		return str2;
	}
	public void createpassword(String str1,String str2){
	int i=0,j=0;
	c1=str1.toCharArray();
	c2=str2.toCharArray();
System.out.print("Password is:   ");
	for(int k=0;k<str1.length()+str2.length();k++){
		if(k%2==0)
		{
System.out.print(c1[i]);
i++;
		}else{
			System.out.print(c2[j]);
			j++;
		}
	}
	}
public static void main(String[] args) {
	String name1,name2;
	Scanner ip=new Scanner(System.in);
	System.out.println("Enter the first name:");
	name1=ip.next();
	System.out.println("Enter the second name:");
	name2=ip.next();
	hunter115createpassword obj=new hunter115createpassword();
	if(name1.length()>name2.length())
		name2=obj.addchar(name1,name2);
	else
		name1=obj.addchar(name2, name1);
	obj.createpassword(name1,name2);
	
}
}