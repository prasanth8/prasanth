public class hunter72reversetheoddindexword {
public static void main(String[] args) {
	String str;
	int index=0,count=0;
	Scanner in=new Scanner(System.in);
	String[] s=new String[20];
	str=in.nextLine();
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)==' '){
		s[count]=str.substring(index,i);
		index=i;
		count++;
		}
		
	}s[count]=str.substring(index,str.length());
	for(int i=0;i<=count;i++){
		StringBuffer s1=new StringBuffer(s[i]);
		System.out.print((i%2==0)?s1.reverse()+" ":s[i]+" ");}
}
}
