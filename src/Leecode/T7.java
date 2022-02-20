package Leecode;


import java.util.Scanner;

public class T7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		System.out.println(new T7().reverse2(a));
	}


	public int reverse(int x) {
		long res = 0;
		while (x != 0) {
			res = res * 10 + x % 10;
			x /= 10;
		}
		return (int) res == res ? (int) res : 0;
	}

	public int reverse2(int x) {
		String xString = Integer.toString(x);
		String string = xString;
		int flag = 1;
		if (x < 0) {
			flag = -1;
			string = xString.substring(1);
		}
		try {
			return Integer.valueOf((new StringBuilder(string)).reverse().toString()) * flag;
		} catch (Exception e) {
			return 0;
		}
	}
}
