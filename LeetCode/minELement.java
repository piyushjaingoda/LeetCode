package LeetCode;
import java.util.*;

public class minELement {
	static Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = readIntegers(5);
		System.out.println(array);
		System.out.println(findMin(array));

	}
	public static int[] readIntegers(int count) {
		int[] array = new int[count];
		System.out.println("enter numbers:");
		for(int i=0;i<array.length;i++) {
			
			int n = sc.nextInt();
			sc.nextLine();
			array[i]=n;
		}
		
		return array;
	}
	public static int findMin(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int i=0;i<array.length-1;i++) {
			if(array[i]<min)
				min = array[i];
		}
		return min;
	}

}
