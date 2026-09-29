package lab2;

public class exercice10 {

    public static boolean estCarreMagique(int[][] m) {

        int somme = m[0][0] + m[0][1] + m[0][2];

        for (int i = 0; i < 3; i++) {

            int s = 0;

            for (int j = 0; j < 3; j++) {
                s += m[i][j];
            }

            if (s != somme) {
                return false;
            }
        }

        // Vérifier les colonnes
        for (int j = 0; j < 3; j++) {

            int s = 0;

            for (int i = 0; i < 3; i++) {
                s += m[i][j];
            }

            if (s != somme) {
                return false;
            }
        }

        // Diagonale principale
        int diagonale1 = m[0][0] + m[1][1] + m[2][2];

        if (diagonale1 != somme) {
            return false;
        }

        // Diagonale secondaire
        int diagonale2 = m[0][2] + m[1][1] + m[2][0];

        if (diagonale2 != somme) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int[][] m = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };

        if (estCarreMagique(m)) {
            System.out.println("Carre magique");
        } else {
            System.out.println("Pas un carre magique");
        }
    }
}