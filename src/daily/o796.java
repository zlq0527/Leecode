package daily;

import java.awt.geom.GeneralPath;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 09:58 2022/4/18
 * @ Description：
 */
public class o796 {
	public static void main(String[] args) {
		System.out.println(rotateString("eabc", "abce"));
	}
	public static boolean rotateString(String s, String goal) {
		int k = s.length()-1;
		for(int i=1;i<s.length();i++){
			String s1=s.substring(0,i);
			if(goal.contains(s1)){
				continue;
			}else{
				k=i-1;
				break;
			}
		}
		System.out.println(s.substring(k));
		if (goal.contains(s.substring(k))) {
			return true;
		}
		return false;


	}
}
