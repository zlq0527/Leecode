package Leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 20:44 2022/4/30
 * @ Description：Leecode 复原ip地址
 * 回溯法 切割字符串之后判断是否IsValid(合法)然后拼接一个逗号,根据逗号的个数进行终止条件 如果剩下的字符串合法并且逗号个数为3,保存到结果集
 * https://leetcode-cn.com/problems/restore-ip-addresses/
 */
public class T93 {
	List<String> list = new ArrayList<>();
	public static void main(String[] args) {
		System.out.println(new T93().restoreIpAddresses("101023"));
	}
	public List<String> restoreIpAddresses(String s) {
		if (s.length() > 12) {
			return list;
		}
		backtracing(s, 0, 0);
		return list;
	}
	public void backtracing(String s, int index, int pointNum) {
		if (pointNum == 3) {
			if (isValid(s, index, s.length() - 1)) {
				list.add(s);
			} else {
				return;
			}
		}
		for (int i = index; i < s.length(); i++) {
			if (isValid(s, index, i)) {
				s = s.substring(0, i + 1) + "." + s.substring(i + 1);
				pointNum++;
				if (pointNum > 3) {
					return;
				}
				backtracing(s, i + 2, pointNum);
				pointNum--;
				s = s.substring(0, i + 1) + s.substring(i + 2);// 回溯删掉逗点
			} else {
				break;
			}
		}
	}
	public boolean isValid(String s, int start, int end) {
		if (start>end) {
			return false;
		}
		if (s.charAt(start) == '0' && start != end) {
			return false;
		}
		int num = 0;
		for (int i = start; i <= end; i++) {
			if (s.charAt(i) > '9' || s.charAt(i) < '0') { // 遇到⾮数字字符不合法
				return false;
			}
			num = num * 10 + (s.charAt(i) - '0');
			if (num > 255) { // 如果⼤于255了不合法
				return false;
			}
		}
		return true;
	}
}
