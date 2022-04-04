package sort;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 08:47 2022/3/18
 * @ Description：选择排序 首先 随机数组首元素, 然后循环,选择最小的元素 进行交换, 每次都从数组中找到最小的元素.
 */
public class Selection_sort {
	public static void main(String[] args) {
		int temp=0 ;
		int[] res = new int[]{3,44,38,5,47,15};
		for (int i = 0; i < res.length; i++) {
			int min = i;
			for (int k = i+1; k < res.length; k++) {
				if (res[k] < res[min]) {
					min = k;
				}
			}
			temp = res[i];
			res[i] = res[min];
			res[min] = temp;

		}
	}
}
