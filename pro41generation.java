package guvi;

import java.util.*;

class generation implements Comparable<generation>{
	String generation;
	String species;
	generation(String generation,String species){
		this.generation=generation;
		this.species=species;
	}
	public int compareTo(generation e){
		System.out.println("Ok");
		return species.compareTo(e.species);
	}
}




public class pro41generation {

	
	public static void main(String[] args) {
		ArrayList<generation> al=new ArrayList<>();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Of species");
		int n;
		n=in.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter the Generation and Species");
			String str=in.next();
			String str1=in.next();
			al.add(new generation(str,str1));
		}
Collections.sort(al);
	for(generation e:al)
		System.out.println(e.generation+" "+e.species);
		System.out.println("Enter the species to show the generation");
		String find=in.next();
	for(generation e1:al)
		if(e1.species.equals(find))
			System.out.println(e1.generation+"    "+e1.species);
	}
}
