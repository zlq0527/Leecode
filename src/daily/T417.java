package daily;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.jar.JarEntry;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:26 2022/4/27
 * @ Description：
 */
public class T417 {
	public static void main(String[] args) {
		int[][] nums = new int[][]{
				{1, 2, 2, 3, 5},
				{3, 2, 3, 4, 4},
				{2, 4, 5, 3, 1},
				{6, 7, 1, 4, 5},
				{5, 1, 1, 2, 4}
//				{1,1},
//				{1,1},
//				{1,1}
		};
		int m = nums.length;
		int n = nums[0].length;
		boolean[][] visited1 = new boolean[m][n];
		boolean[][] visited2 = new boolean[m][n];
		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < m; i++) {
			dfs(nums,i,0,visited1);
			dfs(nums,i,n-1, visited2);
		}
		for (int i = 0; i < n; i++) {
			dfs(nums, 0,i, visited1);
			dfs(nums, m-1,i, visited2);
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

	private static int[][] direction = new int[][]{
			{1, 0}, {0, 1}, {-1, 0}, {0, -1}
	};

	public static void dfs(int[][] nums, int i, int j, boolean[][] visited) {
		visited[i][j] = true;
		for (int[] ints : direction) {
			int newm = ints[0] + i;
			int newn = ints[1] + j;
			if (!(0 <= newm && newm < nums.length && 0 <= newn && newn < nums[0].length) || visited[newm][newn] || nums[i][j] > nums[newm][newn]) {
				continue;
			}
			dfs(nums, newm, newn, visited);
		}

	}
}
