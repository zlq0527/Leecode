package Leecode;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 22:27 2022/5/5
 * @ Description：
 */
public class T383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] res = new int[26];
		for (Character i : magazine.toCharArray()) {
			res[i - 'a']++;
		}
		for (Character i : ransomNote.toCharArray()) {
			res[i - 'a']--;
			if (res[i - 'a'] < 0) {
				return false;
			}
		}
		return true;


	}
}
