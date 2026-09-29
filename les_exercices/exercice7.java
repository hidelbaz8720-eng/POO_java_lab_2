package lab2;

public class exercice7{
	public static int elementMajoritaire(int[] t) {
	    int candidat = 0;
	    int compteur = 0;

	    for (int x : t) {

	        if (compteur == 0) {
	            candidat = x;
	            compteur = 1;
	        } else {
	            if (x == candidat) {
	                compteur++;
	            } else {
	                compteur--;
	            }
	        }
	    }

	    
	    int occ = 0; //occurence

	    for (int x : t) {
	        if (x == candidat) {
	            occ++;
	        }
	    }

	   
	    if (occ > t.length / 2) {
	        return candidat;
	    }

	    return -1;
	}
	public static void main(String[] args) {
		int[] t1 = {2, 2, 1, 2, 3, 2, 2};

		System.out.println(elementMajoritaire(t1));
		
        int[] t7 = {3, 3, 4, 3, 5};
        int[] t2 = {2, 2, 1, 2, 3, 2, 2};
        int[] t3 = {1, 2, 3, 4};
        int[] t4 = {1, 2, 2, 3};
        int[] t5 = {-1, -1, -1, 2, 3};
        int[] t6 = {10};

        System.out.println(elementMajoritaire(t7));
        System.out.println(elementMajoritaire(t2));
        System.out.println(elementMajoritaire(t3));
        System.out.println(elementMajoritaire(t4));
        System.out.println(elementMajoritaire(t5));
        System.out.println(elementMajoritaire(t6));
    }

	}
	

