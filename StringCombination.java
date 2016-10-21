package logicalbuilding;

import java.util.ArrayList;

public class StringCombination {
	public static long output1;
	public static ArrayList<String> output2;

	public static void main(String[] args) {
		output2 = new ArrayList<String>();
		findingStringCombinations(1, 3);
		for (String str : output2) {
			System.out.println(str);
		}
		System.out.println(output1);
	}

	public static void findingStringCombinations(int input1, int input2) {
		int diff = input2 - input1 + 1;
		String string = "";
		int in1 = input1;
		for (int i = input1; i <= input2; i++) {
			char ch = (char) (i + 96);
			output2.add(Character.toString(ch));
		}
		for (int i = 0; i < output2.size(); i++) {
			for (int j = 0; j < diff; j++) {
				if (!output2.get(i).contains(output2.get(j))) {
					String str = output2.get(i) + output2.get(j);
					output2.add(str);
				}
			}
		}
		output1 = output2.size();
	}

}
