package Offer;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 12:55 2022/2/25
 * @ Description：
 */
public class of_05 {
	public static void main(String[] args) {
		String s = "We are happy.";
		System.out.println(replaceSpace(s));
	}
	public static String replaceSpace(String s) {
		StringBuilder sb = new StringBuilder();
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == ' ') {
				sb.append("%20");
			}else  sb.append(chars[i]);
		}
		return sb.toString();
	}
}
