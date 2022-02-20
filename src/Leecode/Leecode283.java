package Leecode;

import java.util.ArrayList;
import java.util.List;

public class Leecode283 {
	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 3, 0, 4, 5, 0, 7};
		new Leecode283().moveZeroes(a);
	}

	public void moveZeroes(int[] nums) {
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[j++] = nums[i];
			}
		}
		while (j < nums.length) {
			nums[j++] = 0;
		}
		for (int i : nums) {
			System.out.println(i);
		}

	}
//    public void moveZeroes(int[] nums) {
//        int aa=0;
//        List<Integer> list=new ArrayList<>();
//        for (int num : nums) {
//            if (num != 0) {
//                list.add(num);
//            }else aa++;
//        }
//        while (aa--!=0){
//            list.add(0);
//        }
//        Object []a=list.toArray();
//        for (Object i : a) {
//            System.out.println(i);
//        }
//
//
//    }
}
