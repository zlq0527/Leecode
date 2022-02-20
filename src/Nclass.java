import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Nclass {
	public static void main(String[] args) {
		int nums[] = new int[]{1, 2, 3, 4, 5, 6, 7};
		int c = 3;
		new Nclass().rotate(nums, c);
	}

	public void rotate(int[] nums, int k) {
		String Str = new String("This is text");

		System.out.print("返回值 :");
		System.out.println(Str.substring(4));

		System.out.print("返回值 :");
		System.out.println(Str.substring(4, 10));
	}

}
