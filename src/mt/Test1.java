package mt;

import java.util.Scanner;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:30 2022/4/16
 * @ Description：
 */
public class Test1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		int res = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				res++;
			}
		}
		System.out.println(res);

	}
}
