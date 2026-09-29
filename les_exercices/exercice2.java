package lab2;

public class exercice2 {

    public static void afficherPivots(int[] t) {

        int n = t.length;

        if (n < 3) {
            System.out.println("Aucun pivot");
            return;
        }

        System.out.print("Pivots : ");

        for (int i = 1; i < n - 1; i++) {

            boolean pivot = true;

            // Vérifier à gauche
            for (int j = 0; j < i; j++) {

                if (t[j] > t[i]) {
                    pivot = false;
                    break;
                }
            }

            // Vérifier à droite
            for (int j = i + 1; j < n; j++) {

                if (t[j] < t[i]) {
                    pivot = false;
                    break;
                }
            }

            if (pivot) {
                System.out.print(t[i] + " ");
            }
        }

        System.out.println();
    }

    public static void main(String[] args) {

        /*int[] t = {2, 4, 3, 5, 6};

        afficherPivots(t);*/
        int[] t1 = {2, 4, 3, 5, 6};
        int[] t2 = {1, 2, 3, 4, 5};
        int[] t3 = {5, 4, 3, 2, 1};
        int[] t4 = {3, 3, 3, 3};
        int[] t5 = {7, 1, 5, 2, 6, 3, 4};
        afficherPivots(t1);
        System.out.println();
        afficherPivots(t2);
        System.out.println();
        afficherPivots(t3);
        System.out.println();
        afficherPivots(t4);
        System.out.println();
        afficherPivots(t5);
    }
}