package Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 电话号码的字母组合
 */
public class Test7 {

	// 数字到号码的映射
	private String[] map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

	// 路径
	private StringBuilder sb = new StringBuilder();

	// 结果集
	private List<String> res = new ArrayList<>();

	public List<String> letterCombinations(String digits) {
		if (digits == null || digits.length() == 0) return res;
		backtrack(digits, 0);
		return res;
	}

	public static void main(String[] args) {
		System.out.println(new Test7().letterCombinations("23"));
	}


	// 回溯函数
	private void backtrack(String digits, int index) {
		if (sb.length() == digits.length()) {
			res.add(sb.toString());
			return;
		}
		String val = map[digits.charAt(index) - '2'];
		for (char ch : val.toCharArray()) {
			sb.append(ch);
			backtrack(digits, index + 1);
			sb.deleteCharAt(sb.length() - 1);
		}
	}

}
