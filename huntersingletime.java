import java.util.Scanner;
public class huntersingletime {
	public void process(String str){
		char ans[];
		ans=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--){
			for(int j=str.length()-1;j>=0;j--){
				if(i!=j&&ans[i]!='\0'&&ans[i]==ans[j]){
					ans[j]='\0';
					
				}
			}
		}
	 
	for(int i=str.length()-1;i>=0;i--)
		if(ans[i]!='\0')
		 System.out.print(ans[i]);

	}
public static void main(String[] args) {
	String str;
	Scanner inp=new Scanner(System.in);
	str=inp.next();
	 huntersingletime obj=new  huntersingletime();
	 obj.process(str);
	
  }
}
