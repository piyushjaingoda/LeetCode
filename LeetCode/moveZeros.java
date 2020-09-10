package LeetCode;

public class moveZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = {1,0,2,0,0,3};
		moveZero(myArray);
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
			}
	}

	public static void moveZero(int[] nums) {
		if (nums == null || nums.length == 0)
			System.out.println("Array is empty");
		else {
			int j = 0;
		    for(int i = 0; i < nums.length; i++) {
		        if(nums[i] != 0) {
		            int temp = nums[j];
		            nums[j] = nums[i];
		            nums[i] = temp;
		            j++;
		        }
		    }
		}
	}

}
