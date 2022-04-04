package Offer;

import com.sun.rowset.internal.Row;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:58 2022/3/29
 * @ Description：
 */
public class T47 {
	public static void main(String[] args) {
		int[][] num = new int[][]{
				{1, 3, 1},
				{1, 5, 1},
				{4, 2, 1}
		};
		System.out.println(maxValue(num));
	}

	public static int maxValue(int[][] grid) {
		int line = grid.length;
		int column = grid[0].length;
		for (int j = 1; j < column; j++) {
			grid[0][j] += grid[0][j - 1];
		}
		for (int i = 1; i < line; i++) {
			grid[i][0] += grid[i - 1][0];
		}
		for (int i = 1; i < line; i++) {
			for (int j = 1; j < column; j++) {
				grid[i][j] = grid[i][j] + Math.max(grid[i - 1][j], grid[i][j - 1]);
			}
		}
		return grid[line - 1][column - 1];

	}


}
