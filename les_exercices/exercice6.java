package lab2;

public class exercice6 {
	public static int maxSubarraySum(int[] t) {
		int currentSum = t[0];
		int maxSum = t[0] ;
		int n=t.length;
		for(int i=1 ; i < n ; i ++) {
			currentSum = Math.max(t[i], currentSum + t[i]);
			maxSum = Math.max(maxSum, currentSum);
		}
	    // à compléter
	    return maxSum;
	}
	public static void main(String[] args ) {
		int []t = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubarraySum(t));
		
	     int[] t1 = {1, 2, 3, 4};
	        int[] t2 = {-1, -2, -3};
	        int[] t3 = {5};
	        int[] t4 = {-7};
	        int[] t5 = {-2, -1, 3, 4, -5};
	        int [] t6 = {1, -1, 1, -1, 1};
	        System.out.println(maxSubarraySum(t1));
	        System.out.println(maxSubarraySum(t2));
	        System.out.println(maxSubarraySum(t3));
	        System.out.println(maxSubarraySum(t4));
	        System.out.println(maxSubarraySum(t5));
	        System.out.println(maxSubarraySum(t6));

	}
}
