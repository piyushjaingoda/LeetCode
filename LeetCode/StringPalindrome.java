package LeetCode;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "A man, a plan, a canal: Panama";
		System.out.println(s);
		System.out.println(isPalindrome(s));

	}

	public static boolean isPalindrome(String s) {
		
		String str = s.replaceAll("[^a-zA-Z0-9]", "");
		String st = str.toLowerCase();
		System.out.println(st);
		//System.out.println(st);
		StringBuffer str1 = new StringBuffer(st);
		str1.reverse();
		System.out.println(str1);
		String str3 = str1.toString();
		if (str3.equals(st))
			return true;
		return false;

	}

}
