package Leecode;

/**
 * 蓝桥杯  卡片
 */
public class Test11 {
	public static void main(String[] args) {
		int res[] = new int[10];
		for (int i = 0; i <= 9; i++) {
			res[i] = 2021;
		}
		for (int i = 1; i < 20201; i++) {
			int t = i;
			while (t > 0) {
				res[t % 10]--;
				if (res[t % 10] <= 0) {
					System.out.println(i);
					return;
				}
				t /= 10;
			}

		}

	}
}
