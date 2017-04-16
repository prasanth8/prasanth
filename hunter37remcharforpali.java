import java.util.Scanner;
class hunter37remcharforpali{
String str2;
public char process(String str){
char ans='\0';
for(int i=str.length()-1;i>=0;i--){
StringBuffer Buff2=new StringBuffer(str);
Buff2.deleteCharAt(i);
str2=Buff2.toString();
if(str2.equals(Buff2.reverse().toString())){
ans=str.charAt(i);
break;
}
}
return ans;
}
public static void main(String arg[]){
String str;
char ans1;
Scanner in=new Scanner(System.in);
System.out.println("Enter the String to find removing character");
str=in.next();
 hunter37remcharforpali obj=new  hunter37remcharforpali();
ans1=obj.process(str);
if(ans1=='\0')
System.out.println("This is not a palindrome word");
else
System.out.println("The character to be removed  '"+ans1+"'");

}

}