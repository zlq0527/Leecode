package Leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 16:14 2022/3/4
 * @ Description：
 */
public class T22 {
	public static void main(String[] args) {
		System.out.println(new T22().generateParenthesis(3));
	}
	List<String> list = new ArrayList<>();
	public List<String> generateParenthesis(int n) {
		backtrace(new StringBuilder(""),0,0,n);
		return list;
	}
	public void backtrace(StringBuilder res,int open,int close,int max) {
		if (res.length() == max * 2) {
			list.add(res.toString());
		}
		if (open < max) {
			res.append("(");
			backtrace(res,open+1,close,max);
			res.deleteCharAt(res.length() - 1);
		}
		if (close < open) {
			res.append(")");
			backtrace(res,open,close+1,max);
			res.deleteCharAt(res.length() - 1);
		}
	}
}
