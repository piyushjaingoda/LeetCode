package LeetCode;

public class ReverseString {
	public static void reverseString(char[] s) {
		int left, right = 0; 
        right = s.length - 1; 
  
        for (left = 0; left < right; left++, right--) { 
            // Swap values of left and right 
            char temp = s[left]; 
            s[left] = s[right]; 
            s[right] = temp; 
        } 
  
        for (char c : s) 
            System.out.print(c); 
        System.out.println(); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ch = { "H", "e", "l", "l", "o" };
		char[] s = s.length;
		System.out.println(s);
		reverseString(s);

	}

}
