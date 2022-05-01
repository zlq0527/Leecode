package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:40 2022/4/29
 * @ Description：
 */
public class T417_1 {
	public static void main(String[] args) {
		int[][] nums = new int[][]{
				{1, 2, 2, 3, 5},
				{3, 2, 3, 4, 4},
				{2, 4, 5, 3, 1},
				{6, 7, 1, 4, 5},
				{5, 1, 1, 2, 4}
		};
		int m = nums.length;
		int n = nums[0].length;
		boolean[][] visited1 = new boolean[m][n];
		boolean[][] visited2 = new boolean[m][n];
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			dfs(nums, i, 0, visited1);
			dfs(nums, i, n - 1, visited2);
		}
		for (int i = 0; i < n; i++) {
			dfs(nums, 0, i, visited1);
			dfs(nums, m - 1, i, visited2);
		}
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (visited1[i][j] && visited2[i][j]) {
					list.add(Arrays.asList(i, j));
				}
			}
		}
		System.out.println(list);
	}

	public static void dfs(int[][] nums, int i, int j, boolean[][] visited) {
		if (visited[i][j]) {
			return;
		}
		visited[i][j] = true;
		if (i - 1 >= 0 && nums[i][j] <= nums[i - 1][j]) dfs(nums, i - 1, j, visited);
		if (i + 1 < nums.length && nums[i][j] <= nums[i + 1][j]) dfs(nums, i + 1, j, visited);
		if (j - 1 >= 0 && nums[i][j]<= nums[i][j - 1]) dfs(nums, i, j - 1, visited);
		if (j + 1 < nums[0].length && nums[i][j] <= nums[i][j + 1]) dfs(nums, i, j + 1, visited);
	}
}
