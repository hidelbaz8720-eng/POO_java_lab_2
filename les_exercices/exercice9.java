package lab2;

public class exercice9{
	public static int differenceDiagonales(int[][] m) {
	    int n = m.length;

	    int sommePri = 0;
	    int sommeSec = 0;

	    for (int i = 0; i < n; i++) {
	        sommePri += m[i][i];
	        sommeSec += m[i][n - 1 - i];
	    }

	    int diff = sommePri- sommeSec;
	    int absDiff = Math.abs(diff);

	    System.out.println("Somme diagonale principale : " + sommePri);
	    System.out.println("Somme diagonale secondaire : " + sommeSec);
	    System.out.println("Différence absolue : " + absDiff);

	    return absDiff;
	}
	public static void main(String[] args) {
		int[][] m1 = {
			    {1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
			};

			System.out.println("Test 1 :");
			differenceDiagonales(m1);
			int[][] m2 = {
				    {1, 3, 5},
				    {2, 4, 6},
				    {7, 8, 9}
				};

				System.out.println("Test 2 :");
				differenceDiagonales(m2);
	}
}
