import java.util.Scanner;
public class hunter1duplicate {
	public void printduplicate(int n,int[] inp){
	int flag=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(inp[i]==inp[j]&&inp[i]!='\0'){
						flag=1;
					inp[j]='\0';
				}
			}if(flag==1)
				System.out.print(inp[i]);
			flag=0;
		}
	}
  public void reading(int n){
	 int[] inp=new int[n];
	 System.out.println("Enter the element");
	 Scanner in1=new Scanner(System.in);
	 for(int i=0;i<n;i++)
		 inp[i]=in1.nextInt();
	 printduplicate(n,inp);
  }
	
	public static void main(String[] args) {
	int n;
	System.out.println("Enter the number of element");
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	hunter1duplicate obj=new hunter1duplicate();
	obj.reading(n);
	

	
	}
}
