package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 13:36 2022/2/19
 * @ Description：
 */
public class T12 {
	public static void main(String[] args) {
		System.out.println(intToRoman(4));
	}
	public static String intToRoman(int num) {
		int[] values = new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String reps[] = new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		String res = "";
		for (int i = 0; i < 13; i++) {
			while (num >= values[i]) {
				num-=values[i];
				res += reps[i];
			}
		}
		return res;
	}
}
