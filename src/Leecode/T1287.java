package Leecode;

import java.util.HashMap;

/**
 * 给你一个非递减的 有序 整数数组，已知这个数组中恰好有一个整数，它的出现次数超过数组元素总数的 25%。
 * 请你找到并返回这个整数
 * 输入：arr = [1,2,2,6,6,6,6,7,10]
 * 输出：6
 */
public class T1287 {
	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 2, 6, 6, 6, 6, 7, 10};
//        System.out.println(findSpecialInteger(a));
		System.out.println(findSpecialInteger2(a));
	}

	public static int findSpecialInteger2(int[] arr) {
		int len = arr.length / 4;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[i + len]) {
				return arr[i];
			}
		}
		return 1;

	}


	public static int findSpecialInteger(int[] arr) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int length = arr.length / 4;
		for (Integer i : arr) {
			if (!hashMap.containsKey(i)) {
				hashMap.put(i, 1);
			} else
				hashMap.put(i, hashMap.get(i) + 1);
		}
		int max = 0;
		for (Integer c : hashMap.keySet()) {
			if (hashMap.get(c) > length) {
				max = Math.max(max, c);
			}
		}
		return max;
	}
}
