package lab2;

import java.util.Stack;

public class excice4 {

    static class Rectangle {
        int top;
        int left;
        int bottom;
        int right;
        int area;

        Rectangle(int top, int left, int bottom, int right, int area) {
            this.top = top;
            this.left = left;
            this.bottom = bottom;
            this.right = right;
            this.area = area;
        }

        void afficher() {
            System.out.println("Aire : " + area);
            System.out.println("Top : " + top);
            System.out.println("Left : " + left);
            System.out.println("Bottom : " + bottom);
            System.out.println("Right : " + right);
        }
    }

    public static Rectangle trouverMaxRectangle(int[][] m) {

        int lignes = m.length;
        int colonnes = m[0].length;

        int[] hauteur = new int[colonnes];

        Rectangle max = new Rectangle(0, 0, 0, 0, 0);

        for (int i = 0; i < lignes; i++) {

            // Calcul des hauteurs
            for (int j = 0; j < colonnes; j++) {

                if (m[i][j] == 1) {
                    hauteur[j]++;
                } else {
                    hauteur[j] = 0;
                }
            }

            Stack<Integer> pile = new Stack<>();

            for (int j = 0; j <= colonnes; j++) {

                int h;

                if (j == colonnes) {
                    h = 0;
                } else {
                    h = hauteur[j];
                }

                while (!pile.empty() && h < hauteur[pile.peek()]) {

                    int index = pile.pop();

                    int haut = hauteur[index];

                    int droite = j - 1;

                    int gauche;

                    if (pile.empty()) {
                        gauche = 0;
                    } else {
                        gauche = pile.peek() + 1;
                    }

                    int largeur = droite - gauche + 1;

                    int aire = haut * largeur;

                    if (aire > max.area) {

                        int bas = i;
                        int hautLigne = i - haut + 1;

                        max = new Rectangle(
                                hautLigne,
                                gauche,
                                bas,
                                droite,
                                aire
                        );
                    }
                }

                if (j < colonnes) {
                    pile.push(j);
                }
            }
        }

        return max;
    }
    public static void afficherRectangle(int[][] m, Rectangle r) {

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[0].length; j++) {

                if (i >= r.top && i <= r.bottom &&
                    j >= r.left && j <= r.right) {

                    System.out.print("X ");
                } else {
                    System.out.print(m[i][j] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] m = {
            {0, 1, 1, 0, 1},
            {1, 1, 1, 1, 0},
            {1, 1, 1, 1, 0},
            {1, 1, 0, 0, 1}
        };

        Rectangle resultat = trouverMaxRectangle(m);

        resultat.afficher();
        System.out.println("\nRectangle maximal :");

        afficherRectangle(m, resultat);
    }
}