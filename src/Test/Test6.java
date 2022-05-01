package Test;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		int[] test = new int[10];
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = a * a;
		int c = a * a * a;
		while (b != 0) {
			test[b % 10] = 1;
			b /= 10;

		}
		while (c != 0) {
			test[c % 10] = 1;
			c /= 10;
		}
		for (int i = 0; i < test.length; i++) {
			if (test[i] != 1) {
				System.out.println("false");
			}
		}
		System.out.println("true");
	}
}
