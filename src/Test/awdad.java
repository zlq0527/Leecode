package Test;
import java.util.ArrayList;
import java.util.List;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 18:25 2022/4/11
 * @ Description：
 */
public class awdad {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int n = 16141;
		for (int i = 1; i < Math.pow(10, 8); i++) {
			if (n*i > Math.pow(10, 8)) {
				break;
			}
			list.add(n * i);
		}
		System.out.println(list);
	}
}
