package daily;

import java.util.*;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 16:02 2022/2/15
 * @ Description：
 */
public class A {
//	public static List<Integer> luckyNumbers(int[][] matrix) {
//		return ;
//
//	}
//	00 01 02
//	10 11 12
//	20 21 22

	public static void main(String[] args) {
		int[][] res = new int[][]{{1, 10, 4, 2}, {9, 3, 8, 7}, {15, 16, 17, 12}};
		int[] max = new int[res.length];
		int[] min = new int[res[0].length];
		int m = Integer.MAX_VALUE;
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				m = Math.min(m, res[i][j]);
			}
			max[i] = m;
			m = Integer.MAX_VALUE;
		}
		int m1 = Integer.MIN_VALUE;
		for (int i = 0; i < res[0].length; i++) {
			for (int j = 0; j < res.length; j++) {
				m1 = Math.max(m1, res[j][i]);
			}
			min[i] = m1;
			m1 = Integer.MIN_VALUE;
		}

		for (int i : max) {
			System.out.println(i);
		}
		System.out.println("---------");
		for (int i : min) {
			System.out.println(i);
		}
		System.out.println("----------");
		List<Integer> list = new ArrayList();
		for (int i = 0; i < max.length; i++) {
			for (int j = 0; j < min.length; j++) {
				if (max[i] == min[j]) {
					list.add(max[i]);
				}
			}
		}
		System.out.println(list);
	}
}
