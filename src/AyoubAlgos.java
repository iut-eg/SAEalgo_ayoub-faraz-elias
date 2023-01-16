
import java.util.Arrays;
public class AyoubAlgos {


public static int[] triCocktail(int[] triTableau) {

        boolean TableauTrie = true;
        int debut = 0;
        int fin = triTableau.length;

        while (TableauTrie) {

            TableauTrie = false;

            for (int i = debut; i < fin - 1; ++i) {
                if (triTableau[i] > triTableau[i + 1]) {
                    int swap = triTableau[i];
                    triTableau[i] = triTableau[i + 1];
                    triTableau[i + 1] = swap;
                    TableauTrie = true;
                }
            }

            if (!TableauTrie)
                break;
            
            TableauTrie = false;
            
            fin = fin - 1;
            
            for (int i = fin - 1; i >= debut; i--) {
                if (triTableau[i] > triTableau[i + 1]) {
                    int swap = triTableau[i];
                    triTableau[i] = triTableau[i + 1];
                    triTableau[i + 1] = swap;
                    TableauTrie = true;
                }
            }
            
            debut = debut + 1;
        }

        return triTableau;
    }
    
    public static int[] triPeigne(int[] triTableau) {

        int ecart = triTableau.length;
        double shrink = 1.3; // Offre les performances optimales
        boolean echange = true;

        while (ecart > 1 || echange) {
            if (ecart > 1) {
                ecart = (int) (ecart / shrink);
            }

            int i = 0;
            echange = false;
            while (i + ecart < triTableau.length) {
                if (triTableau[i] > triTableau[i + ecart]) {
                    int temp = triTableau[i];
                    triTableau[i] = triTableau[i + ecart];
                    triTableau[i + ecart] = temp;
                    echange = true;
                }
                i++;
            }

        }
        return triTableau;
    }
        
public static int[] triComptage(int[] triTableau) {

        // Il nous faut pour cet algo la plus grande valeur

        // Prend la plus grande valeur du tableau
        int max = Arrays.stream(triTableau).max().getAsInt();


        int[] compte = new int[max+1];


        for (int i : triTableau) {
            compte[i]++;
        }


        int[] tableauApresTri = new int[triTableau.length];
        int sortieIndice = 0;


        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < compte[i]; j++) {
                tableauApresTri[sortieIndice++] = i;
            }
        }


        for (int i = 0; i < triTableau.length; i++) {
            triTableau[i] = tableauApresTri[i];
        }

        return triTableau;

    }

}