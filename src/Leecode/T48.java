package Leecode;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:29 2022/3/19
 * @ Description：
 */
public class T48 {
	public static void main(String[] args) {
		int[][] res = new int[][]{
				{5, 1, 9, 11},
				{2,4,8,10},
				{13,3,6,7},
				{15,14,12,16}
		};
		new T48().rotate(res);
	}
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		int[][] matrix_new = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix_new[j][n - i - 1] = matrix[i][j];
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = matrix_new[i][j];
			}
		}
	}
}
