package daily;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:52 2022/5/5
 * @ Description：优先队列PriorityQueue 小Demo
 */
public class PQueue {
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(i->i));
		queue.add(5);
		queue.add(3);
		queue.add(9);
		queue.add(1);
//		while (!queue.isEmpty()) {
//			System.out.println(queue.poll());
//		}
		System.out.println(("赵棱泉").hashCode());

	}

}
