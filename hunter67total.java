import java.util.Scanner;
public class hunter67 {
	private int no;
	 static Scanner in=new Scanner(System.in);
	hunter67(int n){
		no=n;
	}
	void process(){
		String str="\0";
		int total=0,big=0;
			for(int j=0;j<no;j++){
				System.out.println("Enter the Name");
				String str1=in.next();
				int index=str1.length()-1;
				total=0;
			for(int i=str1.length()-1;i>=0;i--){
				if(str1.charAt(i)=='#'){
					total=total+(Integer.parseInt(str1.substring(i+1,index+1)));
					index=i-1;
				}
			}if(big<total){
		str=str1.substring(0,index+1);
			}
		}
			System.out.println(str);
		
	}
public static void main(String[] args) {
System.out.println("Enter the number of student ");
int n=in.nextInt();
hunter67 obj=new hunter67(n);
obj.process();
}
}
