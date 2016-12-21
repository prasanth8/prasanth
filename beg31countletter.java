import java.io.*;
import java.util.*;
public class beg31countletter {
public static void main(String[] args)throws Exception {
	String str;
	int count=0;
	BufferedReader bu=new BufferedReader(new InputStreamReader(System.in));
	str=bu.readLine();
	for(int i=0;i<str.length();i++){
		count++;
	}System.out.println(count);
}
}