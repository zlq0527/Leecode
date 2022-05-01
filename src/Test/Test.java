package Test;

import Leecode.Main;

/**
 * @ Author     ：zhaolengquan.
 * @ Date       ：Created in 18:15 2022/4/11
 * @ Description：
 */
public class Test {
	class A {
		int num;
	}
	public static void main(String[] args) {
		A[] a1= new A[10];
		a1[0].num = 10;
		for(int i = 2; i < 10; ++i){
			a1[i].num = a1[i-1].num * a1[i-2].num;
		}
		System.out.print(a1[9].num);
	}
}
