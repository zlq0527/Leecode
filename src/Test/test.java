package Test;
import java.util.*;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:15 2022/2/27
 * @ Description：
 */
public class test {
	public static void main(String[] args) {
		int[] num = new int[4];
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while (i!=4) {
			num[i++] = scanner.nextInt();
		}
		String s1 = scanner.next();
		int sum = 0;
		char[] chars = s1.toCharArray();
		for (int j = 0; j < chars.length; j++) {
			if (chars[j] == '1') {
				sum += num[0];
			}else if (chars[j] == '2') {
				sum += num[1];
			}
			else if (chars[j] == '3') {
				sum += num[2];
			}
			else if (chars[j] == '4') {
				sum += num[3];
			}
		}
		System.out.println(sum);
	}
}
