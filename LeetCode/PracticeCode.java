package LeetCode;
import java.util.*;


public class PracticeCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5,b=6;
		System.out.println("Print values of a and b " +a+ " " +b);
		if(a>5)
			System.out.println(a);
		
		do {
			System.out.println(("Piyush Jain"));
		}while(a>5);
		
		while(a==5) {
			System.out.println("b");
			break;
		}
		
		for(int i =0;i<5; i++) {
			System.out.println(i);
		}
		char cal = '+';
		switch(cal) {
		case '+' :
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		default:
			System.out.println("No Operator");
		}
		
		int[] myArray = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<myArray.length;i++) {
			
			System.out.println("enter the array elements: ");
			myArray[i] = sc.nextInt();
		}
		System.out.println(myArray[5]);

	}

}
