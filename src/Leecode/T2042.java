package Leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:28 2022/3/15
 * @ Description：
 */
public class T2042 {
	public static void main(String[] args) {
		System.out.println(areNumbersAscending("98 box has 3 blue 4 red 6 green and 12 yellow marbles"));
	}
	public static boolean areNumbersAscending(String s) {
		String [] split = s.split(" ");
		int sum=-1;
		for (String str : split) {
			if (str.charAt(0) > '0' && str.charAt(0) <= '9') {
				if (Integer.parseInt(str) > sum) {
					sum = Integer.parseInt(str);
				}
				else return false;
			}
		}
		return true;
	}


}
