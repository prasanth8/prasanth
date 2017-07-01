package prasanth;

import java.io.*;
import java.util.*;

public class hunter107arrangingstring {
public static void main(String[] args) throws IOException {
	String sample="";
	String str[];
	int i=0;
	FileReader file=new FileReader("C:/Users/appu/Desktop/test.txt");
	BufferedReader in=new BufferedReader(file);
	String s;
	while((s=in.readLine())!=null){
		sample+=s.toLowerCase();
		i++;
	}
	StringBuffer out=new StringBuffer(sample);//removing extra symbols
	for(int j=0;j<out.length();j++){
		if(out.charAt(j)==('.')||out.charAt(j)==(',')||out.charAt(j)==('"')||out.charAt(j)==(':')||out.charAt(j)==('\'')){
			out.deleteCharAt(j);
		}
	}str=(out.toString()).split(" ");
	HashSet<String> hash=new HashSet<>();//removing duplicates
	for(int j=0;j<str.length;j++)
		hash.add(str[j]);
	TreeSet<String> tree=new TreeSet<>();//put string in ascending order
	tree.addAll(hash);
	Iterator<String> im=tree.iterator();
	while(im.hasNext()){
		System.out.println(im.next());
	}
}
}
