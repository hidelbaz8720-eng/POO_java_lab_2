package lab2;

	public class exercice1{
		
	    public static int longueurLIS(int[] t) {
	    	int n = t.length;
	    	if(n==0) {
	    		return 0 ;
	    		}
	    	int [] dp = new int[n];
	    	for (int i =0 ; i<n ; i++) {
	    		dp[i]=1;
	    	}
	    	for(int i =1 ;i < n ; i++) {
	    		for (int j = 1 ;j <i ; j ++) {
	    			if (t[j]<t[i]) {
	    				if(dp[j]+ 1 >dp[i]) {
	    					dp[i]=dp[j]+1;
	    				}
	    			}
	    		}
	    	}
	    	int max = 1 ; 
	    	for (int v : dp) {
	    		if (v > max) {
	    			max =v ;
	    		}
	    	}
	    	return max ; 			
	    		
	    }

	    public static void main(String[] args) {
	        //int[] t = {2, 1, 4, 2, 3, 5, 1, 7};
	    	

	        int[][] tests = {
	                {},                             // tableau vide
	                {5},                            // un seul élément
	                {5, 4, 3, 2, 1},                // strictement décroissant
	                {1, 2, 3, 4, 5},                // strictement croissant
	                {2, 1, 4, 2, 3, 5, 1, 7},       // exemple donné
	                {3, 3, 3, 3},                   // tous égaux
	                {10, 9, 2, 5, 3, 7, 101, 18}    // exemple classique
	            };

	            for (int[] t : tests) {
	                System.out.println("LIS = " + longueurLIS(t));
	            }
		        //System.out.println(longueurLIS(t)); // doit afficher 5
	           
	        }
	    }
	

