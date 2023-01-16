#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
int* randomArray(int n) {

        int t[n];
        for (int i = 0 ; i < (arrsizeof(t) / sizeof(t[0])) ; i++)
            t[i] = rand(); // tirage aléatoire
        return t;
}
int* triPeigne(int arr[]) {

        int arrlength = arrsizeof(arr) / sizeof(arr[0]);
        int ecart = arrlength;
        double shrink = 1.3; // Offre les performances optimales
        bool echange = true;

        while (ecart > 1 || echange) {
            if (ecart > 1) {
                ecart = (int) (ecart / shrink);
            }

            int i = 0;
            echange = false;
            while (i + ecart < arrlength) {
                if (arr[i] > arr[i + ecart]) {
                    int temp = arr[i];
                    arr[i] = arr[i + ecart];
                    arr[i + ecart] = temp;
                    echange = true;
                }
                i++;
            }

        }
        return arr;
}

int main(){
    int n = 100000;
    int* array = randomArray(n);
    time_t seconds;
    time_t temps;

    temps = time(NULL);
    array = triPeigne(array);
    seconds = time(NULL) - temps;
    printf("tri peigne: %d seconds\n", seconds);

    return 0;
}



