#include <stdio.h>

main(){

    int[] array = randomArray(100000);
    time_t seconds;
    time_t temps;

    temps = time(NULL);
    array = triPeigne(array);
    seconds = time(NULL) - temps;


}

int[] triPeigne(int[] *triTableau) {

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

int[] randomArray(int n) {
        Random random = new Random();
        int[] t = new int[n];
        for (int i = 0 ; i < t.length ; i++)
            t[i] = random.nextInt(); // tirage aléatoire d'un int quelconque (compris entre -2^31 et 2^31-1)
        return t;
    }