package Test;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:43 2022/4/10
 * @ Description：
 */
public class Test10 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		for (int i = 0; i < 6; i++) {
			list.remove(i);
		}

	}
}
