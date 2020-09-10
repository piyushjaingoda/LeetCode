package LeetCode;

public class QuadraticEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
		float b = 4.564f;
		double c = a * a + 2 * a * b + b * b;
		int d = (int) c;
		System.out.println("Double value is: " + c + "\ninteger value is: " + d);
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		int value = 1234;
		int sum = 0;
		while (value > 0) {
			int temp = value % 10;
			sum = sum + temp;
			value = value / 10;

		}
		char m ='a';
		m++;
		System.out.println(+m);
		System.out.println(+sum);
		if(isPrime(10))
			System.out.println("Prime");
		else
			System.out.println("not prime");
	}
	

	public static boolean isPrime(int n) {
		boolean isPrime = true;
		for (int i = 2; i <= n / 2; i++) {
			int temp = n % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;

	}

}
