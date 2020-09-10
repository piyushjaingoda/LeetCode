package LeetCode;

public class MaxThreeMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = new int[] { 8, 1, 9 };
		System.out.println(largestMultipleOfThree(digits));

	}

	public static String largestMultipleOfThree(int[] digits) {
		int sum = 0;
		if (digits.length == 0)
			return null;
		if (digits.length == 1) {
			sum += digits[0];
			if (sum % 3 == 0)
				return Integer.toString(digits[0]);
			else
				return null;
		}
		for (int i = 0; i < digits.length; i++) {
			sum += digits[i];
			if (sum % 3 == 0)
				return Integer.toString(digits[i]);
		}

		return null;
	}

}
