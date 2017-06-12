import java.util.*;
public class hunter33maping {
	public static void main(String[] args) {
	String number;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Phone Number");
	number=in.next();
	Map<Integer,String> m=new HashMap<Integer,String>();
	m.put(2,"ABC");
	m.put(3,"DEF");
	m.put(4,"GHI");
	m.put(5,"JKL");
	m.put(6,"MNO");
	m.put(7,"PQRS");
	m.put(8,"TUV");
	m.put(9,"WXYZ");
	for(int i=0;i<number.length();i++)
	{
		for(Map.Entry j:m.entrySet()){
			int temp=(int) j.getKey();
			if(Character.getNumericValue(number.charAt(i))==0||Character.getNumericValue(number.charAt(i))==1){
				System.out.print("NULL  ");
				break;
			}
			if(temp==Character.getNumericValue(number.charAt(i))){
				System.out.print(j.getValue()+" ");
			}
		}
		
	}}

}
