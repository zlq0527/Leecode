package Leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 11:58 2022/4/30
 * @ Description：电话号码的字母组合
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */
public class T17 {

	static List<String> list = new ArrayList<>();
	static StringBuilder res = new StringBuilder();

	public static void main(String[] args) {
		 String[] map = new String[]{
				"", // 0
				"", // 1
				"abc", // 2
				"def", // 3
				"ghi", // 4
				"jkl", // 5
				"mno", // 6
				"pqrs", // 7
				"tuv", // 8
				"wxyz", // 9
		};
		String digits = "";
//		if (digits == null || digits.length() == 0) {
//			return list;
//		}
		dfs(digits,map, 0);
		System.out.println(list);
	}

	public static void dfs(String digits,String[] map, int index) {
		if (index == digits.length()) {//index是层数,也即是输入的数字个数 如输入"23",第一次循环2对应的 字母,下次就index+1,进入3对于的字母
			list.add(new String(res));
			return;
		}
		String str = map[digits.charAt(index) - '0'];
		for (int i = 0; i < str.length(); i++) {
			res.append(str.charAt(i));
			dfs(digits, map,index + 1);
			res.deleteCharAt(res.length() - 1);
		}
	}
}
