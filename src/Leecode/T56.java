package Leecode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 12:10 2022/3/25
 * @ Description：
 */
public class T56 {
	public static void main(String[] args) {
		int[][] nums = new int[][]{
				{2, 6},
				{15, 18},
				{1, 3},
				{8, 10},
		};
		new T56().merge(nums);
	}
	public int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		for (int i = 0; i < intervals.length; i++) {
			for (int j = 0; j < intervals[0].length; j++) {

			}
		}
		return intervals;
	}
}
