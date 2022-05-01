package Leecode;
import java.util.*;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:36 2022/2/28
 * @ Description：
 */
public class T39 {
	static List<List<Integer>> list = new ArrayList<>();
	public static void main(String[] args) {
		int[] nums = new int[]{5,2,12,3,4,1,12};
		System.out.println(combinationSum(nums, 7));
	}
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<Integer> list2 = new ArrayList<>();
		if (candidates.length == 1 && candidates[0] != target) {
			return new ArrayList<>();
		}
		backtrace(candidates, 0, target, list2);
		return list;
	}
	public static void backtrace(int[] nums,int i,  int target, List<Integer> list2) {
		if (target < 0) {
			return;
		}
		if (target == 0) {
			list.add(new ArrayList<>(list2));
			return;
		} else {
			for (int start=i; start < nums.length; start++) {
				if (target < 0) {
					break;
				}
				list2.add(nums[start]);
				backtrace(nums, start,target - nums[start], list2);
				list2.remove(list2.size() - 1);
			}
		}
	}
}
