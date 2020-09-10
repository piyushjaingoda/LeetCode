package LeetCode;

import java.util.*;

public class ExaArrayLisy {

	public static void main(String[] Args) {
		ArrayList<Integer> n = new ArrayList<Integer>();
		n.add(1);
		n.add(2);
		n.add(3);
		for (int i = 0; i < n.size(); i++) {
			System.out.println("Index " + i + ",number is " + n.get(i));
		}
		System.out.println("............................");
		n.add(1, 4);
		n.add(2, 6);
		for (int i = 0; i < n.size(); i++) {
			System.out.println("Index " + i + ",number is " + n.get(i));
		}
		System.out.println("............................");
		n.remove(2);
		n.remove(3);
		for (int i = 0; i < n.size(); i++) {
			System.out.println("Index " + i + ",number is " + n.get(i));
		}

	}

}
