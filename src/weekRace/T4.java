package weekRace;

import java.util.Arrays;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 11:19 2022/3/20
 * @ Description：射击比赛
 */
public class T4 {
	public static void main(String[] args) {
		int[] nums = new int[]{1,1,0,1,0,0,2,1,0,1,2,0};
		new T4().maximumBobPoints(9, nums);
	}
	public int[] maximumBobPoints(int numArrows, int[] aliceArrows) {
		int len = aliceArrows.length;
		int[] nums = new int[len];
			for (int i = len-1; i >0 ; i--) {
			if (aliceArrows[i] == 0) {
				nums[i] = 1;
				numArrows--;
			} else {
				nums[i] = aliceArrows[i] + 1;
				numArrows-=(aliceArrows[i]+1);
			}
		}
		return nums;
	}
}
