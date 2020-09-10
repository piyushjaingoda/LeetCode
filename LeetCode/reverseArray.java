package LeetCode;
import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(array));
		reverse(array);
		System.out.println(Arrays.toString(array));
		

	}
	public static void reverse(int[] array) {
		int max_index = array.length - 1;
		//int halflength = array.length / 2;
		for(int i =0; i<array.length/2;i++) {
				int swap = array[i];
				array[i]= array[max_index -i];
				array[max_index -i]= swap;
		}
		//System.out.println(array);
	}

}
