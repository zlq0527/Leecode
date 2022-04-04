package Leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 14:46 2022/3/4
 * @ Description：
 */
public class T38_1 {
	public static void main(String[] args) {
		new T38_1().countAndSay(10);
	}
	Map<Integer, Integer> map = new HashMap<>();
	StringBuilder stringBuilder = new StringBuilder();
	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}
		String s=countAndSay(n - 1);
		StringBuilder ans=new StringBuilder();
		int count=1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i - 1) == s.charAt(i)) {
				count++;
			} else {
				ans.append(count).append(s.charAt(i - 1));
				count=1;
			}
		}
		return ans.append(count).append(s.charAt(s.length()-1)).toString();
	}
}
