package LanQCode;

import java.util.Scanner;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 19:52 2022/3/5
 * @ Description：
 */
public class T3174 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();//3
		int b = scanner.nextInt();//4
		int[][] nums = new int[a][b];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < b; j++) {
				nums[i][j]= scanner.nextInt();
			}
		}
		int[][] nums2 = new int[b][a];//4 3
		int c=0;//4
		for (int i = 0; i < nums2.length; i++) {
			int d=a-1;//3
			if (i != 0) {
				c++;
			}
			for (int j = 0; j < nums2[0].length; j++) {

				nums2[i][j]=nums[d--][c];
			}
		}

		for (int i = 0; i < nums2.length; i++) {
			for (int j = 0; j < nums2[0].length; j++) {
				System.out.print(nums2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
