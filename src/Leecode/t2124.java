package Leecode;

import java.util.ArrayList;
import java.util.List;

public class t2124 {

	public static void main(String[] args) {
		String[] bank = new String[]{"011001", "000000", "010100", "001000"};
		System.out.println(numberOfBeams(bank));
	}

	public static int numberOfBeams(String[] bank) {
		List<Integer> list = new ArrayList<>();
		for (String s : bank) {
			int count = count(s);
			if (count == 0) {
				continue;
			}
			list.add(count);
		}
		int sum = 0;

		for (int i = 0; i < list.size() - 1; i++) {
			sum += list.get(i) * list.get(i + 1);
		}
		return sum;
	}

	public static int count(String num) {
		int count = 0;
		for (int i = 0; i < num.length(); i++) {
			if (num.charAt(i) == '1') {
				count++;
			}
		}
		return count;

	}
}
