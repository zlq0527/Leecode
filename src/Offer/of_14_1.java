package Offer;

import java.util.Scanner;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:17 2022/2/28
 * @ Description：
 */
public class of_14_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		System.out.println(cuttingRope(i));
	}
	public static int cuttingRope(int n) {
		if (n == 2) {
			return 1;
		}
		if (n == 3) {
			return 2;
		}
		if (n == 4) {
			return 4;
		}
		int res=1;
		while (n != 0) {
			if (n >= 3) {
				res*=3;
				n-=3;
			}
			if (n == 2) {
				res *= 2;
				n -= 2;
			}
			if (n == 4) {
				res*=4;
				n-=4;
			}
		}

		return res;
	}
}
