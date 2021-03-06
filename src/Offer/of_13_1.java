package Offer;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 15:07 2022/2/27
 * @ Description：
 */
public class of_13_1 {
	public static void main(String[] args) {
		System.out.println(new of_13_1().movingCount(3,2,17));
	}
	public int movingCount(int m, int n, int k) {
		boolean[][] visited = new boolean[m][n];
		return dfs(0, 0, m, n, k, visited);
	}

	private int dfs(int i, int j, int m, int n, int k, boolean visited[][]) {
		if (i < 0 || i >= m || j < 0 || j >= n || (i/10 + i%10 + j/10 + j%10) > k || visited[i][j]) {
			return 0;
		}
		visited[i][j] = true;
		return dfs(i + 1, j, m, n, k, visited) + dfs(i - 1, j, m, n, k, visited) +
				dfs(i, j + 1, m, n, k, visited) + dfs(i, j - 1, m, n, k, visited) + 1;
	}
}
