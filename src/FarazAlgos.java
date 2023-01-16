import java.util.Arrays;
import java.util.Random;

public class FarazAlgos {

        public static void main(String[] args) {
//        int[] données = générerDonnéesEntreBornes(50, 0, 20);
//        System.out.println(Arrays.toString(données));

            //int[] données = générerDonnées(10000000);
            int[] données = générerDonnées(200000);

            long tempsDébut = System.nanoTime();
            //Arrays.sort(données); // trie le tableau en utilisant un algorithme de type Quicksort
            triCocktail(données);
            //TriInsertion(données);
            long tempsFin = System.nanoTime();


            System.out.println("Temps de calcul en millisecondes: " + ((tempsFin - tempsDébut) / 1000000) );
//        System.out.println(Arrays.toString(données));
        }

        /*
            Retourne un tableau de int de longueur n rempli avec des valeurs aléatoires
            (valeurs comprises entre Integer.MIN_VALUE=-2^31 et Integer.MAX_VALUE=2^31-1 inclus).
        */
        public static int[] générerDonnées(int n) {
            Random random = new Random();
            int[] t = new int[n];
            for (int i = 0 ; i < t.length ; i++)
                t[i] = random.nextInt(); // tirage aléatoire d'un int quelconque (compris entre -2^31 et 2^31-1)
            return t;
        }

        /*
            Retourne un tableau de int de longueur n rempli avec des valeurs aléatoires comprises entre min et max inclus.
        */
        public static int[] générerDonnéesEntreBornes(int n, int min, int max) {
            Random random = new Random();
            int[] t = new int[n];
            for (int i = 0 ; i < t.length ; i++)
                t[i] = random.nextInt(max-min+1)+min; // nextInt(borne) retourne un int compris entre 0 inclus et borne exclus.
            return t;
        }


        public static void TriInsertion (int[] tab) {
            int pivot;
            int position;
            for (int i = 0 ; i < tab.length ; i++ ) {
                position = i ;
                pivot = tab[i] ;
                while ( position > 0 && tab[position-1] > pivot ) {
                    tab[position] = tab[position-1];
                    tab[position] = tab[position-1];
                    position-- ;
                }
                tab[position] = pivot ;
            }

    }
    public static int[] triCocktail(int[] tableau) {
        boolean trie = true;
        int stockage = 0;
        int start = 0;
        int end = (tableau.length - 2);

        while ( trie == true ) {
            trie = false;
            for (int i = start; i < end; i++) {
                if (tableau[i] > tableau[i+1]) {
                    stockage = tableau[i] ;
                    tableau[i] = tableau[i+1];
                    tableau[i+1] = stockage;
                    trie = true;
                }
            }
            end--;
            for (int i = end; i >= start; i--) {
                if (tableau[i] > tableau[i+1]) {
                    stockage = tableau[i];
                    tableau[i] = tableau[i+1];
                    tableau[i+1] = stockage;
                    trie = true;
                }
            }
            start++;
        }
        return tableau;
    }




}
