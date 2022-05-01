package weekRace;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 23:22 2022/3/19
 * @ Description：
 */
public class T2 {
	public static void main(String[] args) {
		int[] nums = new int[]{6,58,10,84,35,8,22,64,1,78,86,71,77};
		System.out.println(new T2().halveArray(nums));
	}
	PriorityQueue<Double> queue = new PriorityQueue<Double>((a, b) -> Double.compare(b,a));
	public int halveArray(int[] nums) {
		int len = nums.length;
		int res = 0;
		if (len == 1) {
			return 1;
		}
		double sum = 0;
		double target = 0;
		for (int i : nums) {
			sum += (double) i;
			queue.add(((double) i));
		}
		while (target < sum / 2) {
			double poll = queue.poll();
			target += poll / 2;
			queue.add(poll / 2);
			res++;
		}
		return res;
	}
}
