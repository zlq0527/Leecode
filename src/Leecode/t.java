package Leecode;


import java.util.Arrays;

public class t {
	public static void main(String[] args) {
//        String a[] =new String[]{"aaabaaa"};
//        System.out.println(new t().firstPalindrome(a));
//        String s="LeetcodeHelpsMeLearn";
//        int []a=new int[]{8,13,15};
//        System.out.println(new t().addSpaces(s, a));
//        System.out.println(new t().addSpaces2(s, a));
		int a[] = new int[]{3, 2, 1, 4};
		System.out.println(new t().getDescentPeriods(a));

	}

	/**
	 * 周赛第三题
	 *
	 * @param prices
	 * @return
	 */
	public long getDescentPeriods(int[] prices) {

		long ans = 1;
		int cnt = 1;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i + 1] - prices[i] == -1) cnt++;
			else cnt = 1;
			ans += cnt;

		}
		return ans;
	}

	/**
	 * 周赛第二题 方法2
	 *
	 * @param s
	 * @param spaces
	 * @return
	 */
	public String addSpaces2(String s, int[] spaces) {
		StringBuilder sb = new StringBuilder();
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (j < spaces.length && i == spaces[j]) {
				sb.append(' ');
				j++;
			}
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}

	/**
	 * 周赛第二题 方法1
	 *
	 * @param s
	 * @param spaces
	 * @return
	 */
	public String addSpaces(String s, int[] spaces) {
		StringBuilder stringBuilder = new StringBuilder();
		int start = 0;
		for (int i = 0; i < spaces.length; i++) {
			stringBuilder.append(s.substring(start, spaces[i]));
			stringBuilder.append(' ');
			start = spaces[i];
		}
		stringBuilder.append(s.substring(start));
		return stringBuilder.toString();

	}


	/**
	 * 周赛第一题
	 *
	 * @param words
	 * @return
	 */


	public String firstPalindrome(String[] words) {

		for (int i = 0; i < words.length; i++) {
			int length = 0;

			if (words[i].length() == 1) {
				return words[i];
			}
			char[] chars = words[i].toCharArray();
			int left = 0;
			int right = chars.length - 1;
			while (left <= right) {
				if (chars[left++] != chars[right--]) {
					break;
				}
				length++;
				if (length == (chars.length - 1) / 2 + 1) {
					return words[i];
				}
			}
		}
		return "";

	}
}
