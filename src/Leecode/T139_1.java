package Leecode;

import java.util.Arrays;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 12:38 2022/3/18
 * @ Description：给你一个字符串 s 和一个字符串列表 wordDict 作为字典。请你判断是否可以利用字典中出现的单词拼接出 s 。
 * 动态规划,dp数组 dp[i]的含义是: s中 以i-1结尾的字符串是否可以被wordDict拼接
 *
 */
public class T139_1 {
	public static void main(String[] args) {
		String s = "catcat";
		List<String> list = Arrays.asList("cats", "dog", "sand", "and","cat","og");
		System.out.println(wordBreak(s, list));
	}

	public static boolean wordBreak(String s, List<String> wordDict) {
		boolean dp[] = new boolean[s.length() + 1];
		dp[0] = true;
		for (int i = 1; i <= s.length(); i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] && wordDict.contains(s.substring(j,i))) {
					dp[i]=true;
					break;
				}
			}
		}
		return dp[s.length()];
	}
}
