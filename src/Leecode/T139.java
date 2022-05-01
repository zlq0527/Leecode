package Leecode;
import java.util.Arrays;
import java.util.List;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 10:52 2022/3/18
 * @ Description：
 */
public class T139 {
	public static void main(String[] args) {
		String s = "aaaaaaaaaaaaaaaaaaaaaaaaaab";
		List<String> list = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
		System.out.println(wordBreak(s, list));
	}
	static  boolean flag;
	public static boolean wordBreak(String s, List<String> wordDict) {
		StringBuilder stringBuilder = new StringBuilder();
		bactrace(s, stringBuilder, wordDict);
		if (flag) {
			return true;
		} else {
			return false;
		}
	}

	public static void bactrace(String s, StringBuilder stringBuilder, List<String> wordDict) {
		if (!s.startsWith(String.valueOf(stringBuilder))) {
			return;
		}
		if (s.contains(stringBuilder) && s.length() == stringBuilder.length()) {
			flag= true;
			return;
		}
		if (stringBuilder.length() > s.length()) {
			return;
		}
		for (int i = 0; i < wordDict.size(); i++) {
			if (flag) {
				return;
			}
			int a = stringBuilder.length();
			stringBuilder.append(wordDict.get(i));
			bactrace(s,stringBuilder,wordDict);
			stringBuilder.delete(a,stringBuilder.length());
		}
	}
}
