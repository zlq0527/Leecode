package Offer;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 11:41 2022/2/25
 * @ Description：
 */
public class of_04 {

	public static void main(String[] args) {
		int num[][] = new int[][]{
//				{1, 4, 7, 11, 15},
//				{2, 5, 8, 12, 19},
//				{3, 6, 9, 16, 22},
//				{10, 13, 14, 17, 24},
//				{18, 21, 23, 26, 30},
				{}
		};
		int target = 10;
		System.out.println(findNumberIn2DArray(num, target));
	}

	public static boolean findNumberIn2DArray(int[][] matrix, int target) {
		if(matrix == null || matrix.length == 0) {
			return false;
		}
		int r = matrix[0].length-1;
		int row=0;
		while (row<matrix.length&&r>=0) {
			if (matrix[row][r]>target) {
				r--;
			} else if (matrix[row][r]<target) {
				row++;
			}else return true;
		}
		return false;
	}
}
