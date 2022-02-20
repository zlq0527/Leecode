import java.util.ArrayList;
import java.util.List;

public class Test9 {
	private List<StringBuilder> list = new ArrayList<>();

	public List<StringBuilder> test() {
		String abc = "abcdef";
		backtrack(abc, 0);
		return list;
	}

	public void backtrack(String demo, int indedx) {
		StringBuilder sb = null;
		//终止条件
		//if判断如果符合条件则把结果放入结果集中。
		if (sb.length() == 2) {
			list.add(sb);
			return;
		}

		//for循环把循环到的节点放到sb中，
		for (Character a : demo.toCharArray()) {
			//处理条件
			//递归
			//回溯操作 撤销上步

			sb.append(a);
			backtrack(demo, indedx + 1);
			sb.deleteCharAt(sb.length() - 1);
		}
	}
}
