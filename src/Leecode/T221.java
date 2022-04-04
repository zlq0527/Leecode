package Leecode;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 21:13 2022/3/19
 * @ Description：
 */
public class T221 {
	public static void main(String[] args) {
		char[][] res = new char[][]{
				{'1','0','1','0','0'},
				{'1','0','1','1','1'},
				{'1','1','1','1','1'},
				{'1','0','0','1','0'}
		};
		System.out.println(new T221().maximalSquare(res));
	}
	public int maximalSquare(char[][] matrix) {
		int max=0;
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return max;
		}
		int[][] dp = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == '1') {
					if (i == 0 || j == 0) {
						dp[i][j] = 1;
					} else {
						dp[i][j] = Math.min(Math.min(dp[i][j - 1], dp[i - 1][j - 1]), dp[i - 1][j])+1;
					}
				}
				max = Math.max(dp[i][j], max);
			}
		}
		return max * max;
	}
}
