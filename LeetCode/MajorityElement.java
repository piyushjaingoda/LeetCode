package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3, 4, 5, 6, 6, 6, 6,7,7,7,7,7,7};
		int k = majorityElement(nums);
		System.out.println(k);

	}

	public static int majorityElement(int[] nums) {
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
}
	/*
	 * int[] count = new int[10]; int counst = 1; //System.out.println(nums.length);
	 * if(nums.length==1) { count[nums[0]]=1; }
	 * 
	 * // Map<Integer, Integer > count=new HashMap<Integer,Integer>(); for (int i =
	 * 0; i <nums.length - 1; i++) { int number = nums[i];
	 * 
	 * 
	 * if (nums[i] != nums[i + 1]) { count[number]=counst; counst = 1;
	 * 
	 * } else { counst++; count[number] = counst;
	 * 
	 * }
	 * 
	 * } int max = count[0]; int repnum = 0; for (int i = 0; i < count.length - 1;
	 * i++) { if (count[i] > count[i + 1] && count[i]> max) { max = count[i]; repnum
	 * = i; //System.out.println("max number  is "+repnum); }
	 * System.out.println("number " + count[i] + " index " + i);
	 * 
	 * }
	 * 
	 * return repnum;
	 */
