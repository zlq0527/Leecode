package wangyi;

import java.util.Scanner;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 16:16 2022/3/27
 * @ Description：
 */
public class Test4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int[][] res = new int[a][b];
		while (scanner.hasNextInt()) {
			for (int i = 0; i < res.length; i++) {
				for (int j = 0; j < res[0].length; j++) {
					res[i][j] = scanner.nextInt();
				}
			}
		}
	}
}
