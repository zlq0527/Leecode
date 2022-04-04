package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 15:39 2022/3/18
 * @ Description：岛屿数量
 */
public class T200 {
	public static void main(String[] args) {
		char[][] nums = new char[][]{
				{'1', '1', '1', '1', '0'},
				{'1', '1', '0', '1', '0'},
				{'1', '1', '0', '0', '0'},
				{'0', '0', '0', '0', '0'}
		};
		System.out.println(new T200().numIslands(nums));
	}

	public int numIslands(char[][] grid) {
		int res = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					bfs(grid, i, j);
					res++;
				}
			}
		}
		return  res;
	}

	public void bfs(char[][] grid, int i, int j) {
		if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0||grid[i][j]!='1') {
			return;
		}
		grid[i][j] = '2';
		bfs(grid, i + 1, j);
		bfs(grid, i - 1, j);
		bfs(grid, i, j + 1);
		bfs(grid, i, j - 1);
	}
}
