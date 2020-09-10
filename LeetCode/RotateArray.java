package LeetCode;

import java.util.*;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(Arrays.toString(array));
		rotateArray(array, 3);
		System.out.println(Arrays.toString(array));

	}

	public static void rotateArray(int[] nums, int k) {
		
		for (int i = 0; i < k; i++) {
			int temp = nums[nums.length - 1];
			for (int j = nums.length - 1; j >= 0; j--) {
				
				if (j == 0)
					nums[j] = temp;
				
				else {
					
					nums[j] = nums[j - 1];
				}
			}

		}
	}

}
