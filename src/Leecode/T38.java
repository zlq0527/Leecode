package Leecode;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 12:06 2022/2/21
 * @ Description：
 */
public class T38 {
	public static void main(String[] args) {
		System.out.println(countAndSay(10));
	}
	public static String countAndSay(int n) {
		if(n==1){return "1";}
		String s=countAndSay(n-1);
		StringBuilder ans=new StringBuilder();
		int count=1;
		for(int i=1;i<s.length();i++){
			if(s.charAt(i)==s.charAt(i-1)){count++;}
			else{
				ans.append(count).append(s.charAt(i-1));
				count=1;
			}
		}
		return ans.append(count).append(s.charAt(s.length()-1)).toString();
	}
}
