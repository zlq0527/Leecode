package Leecode;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 17:56 2022/2/6
 * @ Description：最长公共前缀
 */
public class commonpre {
	public static void main(String[] args) {
		String[] str = new String[]{"flower", "flabc", "flaaa"};
		System.out.println(new commonpre().longestCommonPrefix(str));
	}

	public String longestCommonPrefix(String[] strs) {
		String res = strs[0];
		for (int i = 1; i < strs.length; i++) {
			while (strs[i].indexOf(res) != 0) {
				res = res.substring(0, res.length() - 1);
			}
		}
		return res;
	}

}
