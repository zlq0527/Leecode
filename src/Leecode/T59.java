package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:56 2022/4/27
 * @ Description：螺旋矩阵
 */
public class T59 {
	public static void main(String[] args) {
		nums(4);
	}

	public static void nums(int n) {
		int[][] nums = new int[n][n];
		int loop = n / 2;
		int StartX = 0;
		int StartY = 0;
		int offset = 1;
		//填充数字
		int count = 1;
		while (loop > 0) {
			int i = StartX;
			int j = StartY;
			for (; j < StartY + n - offset; j++) {
				nums[i][j] = count++;
			}
			for (; i < StartX + n - offset; i++) {
				nums[i][j] = count++;
			}
			for (; j > StartY; j--) {
				nums[i][j] = count++;
			}
			for (; i > StartX; i--) {
				nums[i][j] = count++;
			}
			loop--;
			StartX++;
			StartY++;
			offset += 2;
		}
		if (n % 2 == 1) {
			nums[n/2][n/2]=count;
		}
	}
}
