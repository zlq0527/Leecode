package Leecode;

import java.util.Arrays;

public class add1 {
	public static void main(String[] args) {
		int[] num = new int[]{8, 9, 9, 9};
		new add1().plusOne(num);
	}

	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i]++;
				return digits;
			} else {
				digits[i] = 0;
			}
		}
		int[] temp = new int[digits.length + 1];
		temp[0] = 1;
		return temp;

	}
}
