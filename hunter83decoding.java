import java.util.Scanner;
public class hunter83encoder {
	public void process(String str){
		int index=0;
		if(str.contains("x")){
			index=str.indexOf("x");
			}
			for(int i=0;i<str.length();i++){
				if(i==(index-1)){
					for(int j=0;j<Character.getNumericValue(str.charAt(i))-1;j++){
						System.out.print(str.charAt(i+2));
					}
					i=i+2;
				}
				System.out.print(str.charAt(i));
			}
	}
public static void main(String[] args) {
	String str;
	
	System.out.println("Enter the string ");
	Scanner in=new Scanner(System.in);
	str=in.next();
	
	hunter83encoder obj=new hunter83encoder();
	obj.process(str);
}
}
