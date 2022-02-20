package Leecode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CZB {
	public static void main(String[] args) {
//        System.out.println(new CZB().score());
		new CZB().score2();
	}

	public void score2() {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		List list = new ArrayList();
		while (a-- > 0) {
			int aa = scanner.nextInt();
			int page = scanner.nextInt();
			if (page < 16) {
				aa -= 10;
				aa = Math.max(aa, 0);
			} else if (page > 20) {
				aa -= (page - 20);
				aa = Math.max(aa, 0);
			}
			list.add(aa);
		}
		for (Object i : list) {
			System.out.println(i);
		}
	}

	/**
	 * 第一题
	 *
	 * @return
	 */
	public int score() {
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		int h = scanner.nextInt();
		int e = scanner.nextInt();
		int c = (int) (t * 0.2 + h * 0.3 + e * 0.5);
		System.out.println(c);
		return c;
	}


}
