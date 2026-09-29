# TP 2 — Tableaux en Java

Ce projet regroupe une série de **10 exercices en Java** réalisés dans le cadre du module **Fondamentaux et Concepts Avancés de la Programmation Java**.

L'objectif principal est de pratiquer la manipulation des **tableaux, matrices et algorithmes**, tout en analysant leur logique et leur complexité.

## 📚 Exercices réalisés

### Exercice 1 — Sous-suite maximale croissante

Recherche de la plus longue sous-suite croissante dans un tableau d'entiers.
<img width="1366" height="768" alt="Capture d&#39;écran 2026-09-29 200909" src="https://github.com/user-attachments/assets/b499023a-4fc6-41a8-bd7b-ef9888a75be3" />

### Exercice 2 — Tableau pivot

Recherche d'un élément pivot dans un tableau selon les conditions définies par l'exercice.
<img width="1366" height="768" alt="Capture d&#39;écran 2026-09-29 204639" src="https://github.com/user-attachments/assets/7e8327d4-5d08-49a2-80cc-2b29fc19287a" />

### Exercice 3 — Matrice spirale

Parcours et affichage des éléments d'une matrice suivant un ordre en spirale.
<img width="1366" height="768" alt="Capture d&#39;écran 2026-09-29 205135" src="https://github.com/user-attachments/assets/0ff862b5-ef04-4e70-be99-551b126d8b9b" />

### Exercice 4 — Rectangle maximal de 1

Recherche du plus grand rectangle composé uniquement de `1` dans une matrice binaire.
<img width="1366" height="768" alt="Capture d&#39;écran 2026-09-29 212430" src="https://github.com/user-attachments/assets/84fda95c-4292-4c01-9f82-602dfb409151" />

### Exercice 5 — Permutation circulaire

Réalisation d'une rotation circulaire des éléments d'un tableau vers la gauche ou vers la droite.

### Exercice 6 — Sous-tableau de somme maximale

Utilisation de l'algorithme de **Kadane** pour trouver le sous-tableau dont la somme est maximale.
<img width="1366" height="768" alt="Capture d&#39;écran 2026-09-29 213318" src="https://github.com/user-attachments/assets/3fb2c78b-5672-409a-abcb-573c7f4531bc" />

### Exercice 7 — Élément majoritaire

Recherche d'un élément apparaissant strictement plus de `n/2` fois dans un tableau avec l'algorithme de **Boyer-Moore**.
<img width="1366" height="768" alt="Capture d&#39;écran 2026-09-29 220633" src="https://github.com/user-attachments/assets/e320acf7-6e19-4aa7-99bb-c9d01518cd93" />

### Exercice 8 — Nombres absents

Identification des nombres absents d'un tableau en utilisant différentes techniques de manipulation des tableaux.
<img width="1366" height="768" alt="Capture d&#39;écran 2026-09-29 214737" src="https://github.com/user-attachments/assets/dc97d122-eb3b-468d-8274-2d4dc1e9c5ff" />

### Exercice 9 — Somme diagonale

Calcul de la somme des éléments des diagonales d'une matrice carrée.
<img width="1366" height="768" alt="Capture d&#39;écran 2026-09-29 215811" src="https://github.com/user-attachments/assets/cb318801-2b33-43e8-9f08-84f7fa21f054" />

### Exercice 10 — Carré magique 3×3

Vérification d'une matrice `3×3` afin de déterminer si toutes ses lignes, colonnes et diagonales possèdent la même somme.
<img width="1366" height="768" alt="Capture d&#39;écran 2026-09-29 215546" src="https://github.com/user-attachments/assets/6dcef020-e18e-47f8-a402-03eebd52d300" />

## 🧠 Exercice 7 — Questions de réflexion

### 1. Pourquoi ne peut-il pas y avoir deux éléments majoritaires différents dans le même tableau ?

Un élément majoritaire doit apparaître **strictement plus de n/2 fois**.

Si deux éléments différents étaient majoritaires, chacun devrait apparaître plus de n/2 fois. Leur nombre total d'occurrences serait donc supérieur à `n`, ce qui est impossible puisque le tableau contient seulement `n` éléments.

Donc, **il ne peut y avoir qu'un seul élément majoritaire**.

---

### 2. En quoi l'algorithme de Boyer-Moore est-il plus efficace en mémoire qu'une solution avec `HashMap` ?

Avec une `HashMap`, on doit stocker chaque valeur ainsi que son nombre d'occurrences.

La mémoire utilisée dépend donc du nombre de valeurs différentes présentes dans le tableau :

```text
Mémoire : O(k)
```

où `k` représente le nombre de valeurs différentes.

Avec **Boyer-Moore**, on utilise seulement quelques variables :

```java
int candidat;
int compteur;
```

La mémoire supplémentaire est donc constante :

```text
Mémoire : O(1)
```

Boyer-Moore est donc plus efficace en mémoire.

---

### 3. Pourquoi la deuxième passe de vérification est-elle indispensable ?

La première passe de Boyer-Moore permet seulement de trouver un **candidat potentiel**.

Le candidat obtenu n'est pas forcément réellement majoritaire.

Il faut donc parcourir une deuxième fois le tableau pour compter le nombre réel d'occurrences du candidat.

Si :

```text
occurrences > n/2
```

alors le candidat est majoritaire.

Sinon, il n'existe pas d'élément majoritaire et la fonction retourne `-1`.

---

### 4. Que se passerait-il si on renvoyait directement le candidat sans vérifier ?

Le programme pourrait retourner une valeur qui **n'est pas réellement majoritaire**.

Par exemple :

```text
t = [1, 2, 3, 2, 4]
```

Il n'existe aucun élément apparaissant plus de `5/2` fois.

Pourtant, Boyer-Moore peut terminer avec un candidat.

Sans la deuxième passe, le programme retournerait ce candidat comme s'il était majoritaire, ce qui serait incorrect.

La vérification finale est donc nécessaire.

---

### 5. Comment adapterais-tu la définition si on parlait d'un élément « dominant » apparaissant au moins `n/3` fois ?

La condition changerait.

Au lieu de vérifier :

```java
occurrences > n / 2
```

on vérifierait :

```
```

## 🛠️ Technologies utilisées

* **Java**
* Tableaux à une dimension
* Tableaux à deux dimensions
* Boucles `for`
* Méthodes Java
* Conditions
* Algorithmes de recherche et de parcours
* Manipulation de matrices
* Analyse de complexité algorithmique

## 🎯 Objectifs

Ce TP permet de renforcer les compétences en
