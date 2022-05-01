package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 18:27 2022/4/4
 * @ Description：
 */
public class of_04_1 {
	public static void main(String[] args) {
		int[][] num = new int[][]{
//				{1, 4, 7, 11, 15},
//				{2, 5, 8, 12, 19},
//				{3, 6, 9, 16, 22},
//				{10, 13, 14, 17, 24},
//				{18, 21, 23, 26, 30}
				{}
		};
		System.out.println(findNumberIn2DArray(num, 13));
	}

	public static boolean findNumberIn2DArray(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return false;
		}
		int a = matrix[0].length - 1;
		int len = matrix.length;
		int i = 0, j = a;
		while (i < len && j >= 0) {
			if (matrix[i][j] == target) {
				return true;
			} else if (matrix[i][j] > target) {
				j--;
			} else {
				i++;
			}
		}
		return false;
	}
}
