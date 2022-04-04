package Leecode;

import sun.rmi.runtime.Log;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 21:05 2022/4/2
 * @ Description：
 */
public class T507 {
	public static void main(String[] args) {
		System.out.println(checkPerfectNumber(28));
	}
	public static boolean checkPerfectNumber(int num) {
		Set<Integer> set = new HashSet<>();
		long sum = 0;
		for (int i = 1; i <num/2+1; i++) {
			if (num % i == 0) {
				set.add(i);
			}
		}
		for (Integer integer : set) {
			sum += integer;
		}
		if (sum == num) {
			return true;
		}
		return false;
	}
}
