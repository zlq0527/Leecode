package Leecode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:22 2022/3/8
 * @ Description：
 */
public class T2055 {
	public static void main(String[] args) {
		String s = "**|**|***|";
//		int[][] nums = new int[][]{{1,17},{4,5},{14,17},{5,11},{15,16}};
		int[][] nums = new int[][]{{2, 5}, {5, 9}};
		new T2055().platesBetweenCandles(s, nums);
	}

	public int[] platesBetweenCandles(String s, int[][] queries) {
		int[] nums = new int[queries.length];
		int a = 0;
		for (int i = 0; i < queries.length; i++) {
			int l = queries[i][0];
			int r = queries[i][1];
			while (s.charAt(l) != '|') {
				l++;
			}
			while (s.charAt(r) != '|') {
				r--;
			}
			for (int j = l; j < r; j++) {
				if (s.charAt(j) == '*') {
					nums[a] += 1;
				}
			}
			a++;
		}
		return nums;
	}
}
