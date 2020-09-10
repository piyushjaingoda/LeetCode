package LeetCode;

import java.util.*;

public class ExaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> name = new LinkedList<String>();
		name.add("Piyush");
		name.add("Jain");
		name.add("Goda");
		System.out.println(name);
		for (int i = 0; i < name.size(); i++) {
			System.out.println("Index " + i + ",number is " + name.get(i));
		}
		name.remove(1);
		name.add("pj");
		for (int i = 0; i < name.size(); i++) {
			System.out.println("Index " + i + ",number is " + name.get(i));
		}
	}

}
