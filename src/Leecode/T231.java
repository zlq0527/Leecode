package Leecode;

import java.util.Scanner;

public class T231 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(new T231().isPowerOfTwo(a));
	}

	public boolean isPowerOfTwo(int n) {
		for (int i = 0; i < 64; i++) {
			if (Math.pow(2, i) == n) return true;
		}
		return false;

	}
}
