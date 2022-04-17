package mt;

import java.util.Scanner;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:09 2022/4/16
 * @ Description：
 */
public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int d = scanner.nextInt();
		int res = c * 60 + d - (a * 60 + b);
		System.out.println(res);
	}
}
