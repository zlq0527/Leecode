package daily;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:33 2022/3/28
 * @ Description：
 */
public class T693 {
	public static void main(String[] args) {
		String s = Integer.toBinaryString(5);
		for (int i = 0; i < s.length()-1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				System.out.println("false");
			}

		}
		System.out.println("true");
	}
}
