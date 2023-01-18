#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>
void randomArray(int *array, int n);

int main(){
    int n = 100000;


   int array[n];
   printf("The array has %zu elements\n", sizeof array / sizeof *array);

   randomArray(array, n);
    /*
    time_t seconds;
    time_t temps;

    temps = time(NULL);
    array = triPeigne(array);
    seconds = time(NULL) - temps;
    printf("tri peigne: %ld seconds\n", seconds);
    */
    return 0;
}


void randomArray(int *array, int n) {


        for (int i = 0 ; i < n ; i++){
            array[i] = rand(); // tirage aléatoire
            printf("array[%d] = %d \n", i, array[i]);
        }

}/*
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

*/


