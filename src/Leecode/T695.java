package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 16:01 2022/3/18
 * @ Description：
 */
public class T695 {
	public static void main(String[] args) {
		int[][] nums = new int[][]{
				{0,0,1,0,0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,0,0,1,1,1,0,0,0},
				{0,1,1,0,1,0,0,0,0,0,0,0,0},
				{0,1,0,0,1,1,0,0,1,0,1,0,0},
				{0,1,0,0,1,1,0,0,1,1,1,0,0},
				{0,0,0,0,0,0,0,0,0,0,1,0,0},
				{0,0,0,0,0,0,0,1,1,1,0,0,0},
				{0,0,0,0,0,0,0,1,1,0,0,0,0}
		};
		System.out.println(new T695().maxAreaOfIsland(nums));
	}

	static int maxarea;
	public int maxAreaOfIsland(int[][] grid) {
		int res = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					bfs(grid, i, j);
					res = Math.max(res, maxarea);
					maxarea=0;
				}
			}
		}
		return  res;
	}

	public void bfs(int [][] grid, int i, int j) {
		if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0||grid[i][j]!=1) {
			return;
		}
		grid[i][j] = 2;
		maxarea++;
		bfs(grid, i + 1, j);
		bfs(grid, i - 1, j);
		bfs(grid, i, j + 1);
		bfs(grid, i, j - 1);
	}
}
