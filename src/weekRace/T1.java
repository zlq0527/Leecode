package weekRace;

import Leecode.Test9;

import java.util.Scanner;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 21:44 2022/3/19
 * @ Description：
 */
public class T1 {
	public static void main(String[] args) {
//		mpmp
		System.out.println(new T1().maximumSubsequenceCount("mpmp", "mp"));
	}

	public long maximumSubsequenceCount(String text, String pattern) {
		char s1 = pattern.charAt(0);
		char s2 = pattern.charAt(1);
		int ans = 0;
		int numa = 0;
		int numb = 0;
		if (s1 == s2) {
			for (char i : text.toCharArray()) {
				if (i == s1) {
					ans++;
				}
			}
			return (ans * ans + ans)/2;
		}

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == s1 ) {
				numa += 1;

			} else if (text.charAt(i) == s2) {
				numb += 1;
				ans += numa;
			}
		}
		ans = Math.max(numa, numb) + ans;
		return ans;
	}


}
