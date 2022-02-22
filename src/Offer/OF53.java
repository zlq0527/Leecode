package Offer;

/**
 * @ Author     ：赵棱泉.
 * @ Date       ：Created in 10:44 2022/2/21
 * @ Description：
 */
public class OF53 {
	public static void main(String[] args) {
		int[] nums = new int[]{2,2,2};
		System.out.println(search(nums, 2));

	}
	public static int search(int[] nums, int target) {
		int l=0;
		int r=nums.length-1;
		if (nums[0] > target) {
			return 0;
		}
		if(r==-1){
			return 0;
		}
		while (l<r) {
			int mid=l+(r-l)/2;
			if (nums[mid] < target) {
				l=mid+1;
			} else {
				r=mid-1;
			}
		}
		int res=0;
		int t=nums[l]==target?l:l+1;
		while (t<nums.length&&nums[t]==target)
		{
			res++;
			t++;
		}
		return res;
	}
}
