package LeetCode;

public class MaxProfit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] { 7, 1, 5, 3, 6, 4 };
		System.out.println(maxProfit(array));

	}

	public static int maxProfit(int[] prices) {
		int maxProfit = 0, j = 0;
        for (int i = 1; i < prices.length; i ++){
          int compare = prices[i] - prices[j];
          if(compare > maxProfit){
        	  maxProfit = compare;
          }     
          if(prices[i] < prices[j])
              j = i;
        }
        return maxProfit;
        
    }

}
