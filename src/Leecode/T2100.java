package Leecode;
import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 15:38 2022/3/6
 * @ Description：
 */
public class T2100 {
	public List<Integer> goodDaysToRobBank(int[] security, int time) {
		int n = security.length;
		int[] left = new int[n];
		int[] right = new int[n];
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < security.length; i++) {
			if (security[i] <= security[i - 1]) left[i] = left[i - 1] + 1;
			if (security[n - i - 1] <= security[n - i]) right[n - i - 1] = right[n - i] + 1;
		}
		for (int i = time; i < n - time; i++) {
			if (left[i] >= time && right[i] >= time) {
				list.add(i);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] nums = new int[]{5, 3, 3, 3, 5, 6, 2};
		int time = 2;
		System.out.println(new T2100().goodDaysToRobBank(nums, time));
	}
}
