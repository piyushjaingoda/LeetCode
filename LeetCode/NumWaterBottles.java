package LeetCode;

public class NumWaterBottles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(numWaterBottles(17, 3));

	}

	public static int numWaterBottles(int numBottles, int numExchange) {
		int sum = numBottles;
		int empty = numBottles;
		int fullBottle = (empty) / numExchange;

		do {
			sum = sum + fullBottle;
			empty = (empty % numExchange) + fullBottle;
			fullBottle = (empty) / numExchange;
		}while(empty >= numExchange);

		return sum;
	}

}
