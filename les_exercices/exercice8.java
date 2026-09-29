package lab2;

public class exercice8 {

    public static void afficherElementsManquants(int[] t) {

        int n = t.length;

        boolean[] vu = new boolean[n + 1];

        // Marquer les nombres présents
        for (int i = 0; i < t.length; i++) {

            if (t[i] >= 1 && t[i] <= n) {
                vu[t[i]] = true;
            }
        }

        // Afficher les nombres manquants
        boolean trouve = false;

        for (int i = 1; i <= n; i++) {

            if (!vu[i]) {
                System.out.print(i + " ");
                trouve = true;
            }
        }

        if (!trouve) {
            System.out.println("Aucun élément manquant");
        }
    }

   /* public static void main(String[] args) {

        int[] t = {1, 3, 3, 5};

        afficherElementsManquants(t);
    }*/
    public static void main(String[] args) {

        
        int[] t1 = {1, 3, 3, 5};
        System.out.print("Test 1 : ");
        afficherElementsManquants(t1);


        
        int[] t2 = {1, 2, 3, 4};
        System.out.print("Test 2 : ");
        afficherElementsManquants(t2);


        
        int[] t3 = {3, 3, 3};
        System.out.print("Test 3 : ");
        afficherElementsManquants(t3);


        int[] t4 = {1, 1, 1, 1};
        System.out.print("Test 4 : ");
        afficherElementsManquants(t4);


    
        int[] t5 = {4, 2, 2, 1, 5};
        System.out.print("Test 5 : ");
        afficherElementsManquants(t5);


        int[] t6 = {1};
        System.out.print("Test 6 : ");
        afficherElementsManquants(t6);


        
        int[] t7 = {1, 2, 3, 6};
        System.out.print("Test 7 : ");
        afficherElementsManquants(t7);
    }
}
