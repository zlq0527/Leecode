package Leecode;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 09:44 2022/3/2
 * @ Description：
 */
public class T2186 {
	public static void main(String[] args) {
		System.out.println(new T2186().minSteps("leetcode", "coats"));
	}
	public int minSteps(String s, String t) {
		int res=0;
		int res1 [] =new int [26];
		int res2 [] =new int [26];
		for(int i=0;i<s.length();i++){
			res1[s.charAt(i)-'a']++;
		}
		for(int i=0;i<t.length();i++){
			res2[t.charAt(i)-'a']++;
		}
		for(int i=0;i<26;i++){
			res+=Math.abs(res1[i]-res2[i]);
		}
		return res;
	}
}
