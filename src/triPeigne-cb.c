#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <time.h>
void randomArray(int *array, int n);
void triPeigne(int *arr, int n);
void printArray(int *arr, int n);

int main(){
    int n = 1000000 ;


   int array[n];

   randomArray(array, n);

    double seconds;
    double temps1, temps2;

    temps1 = clock();
    printf("\ntemps1 = %lf \n", temps1);
    triPeigne(array, n);

    temps2 = clock();
    printf("temps2 = %lf \n\n", temps2);
    seconds = (double)(temps2 - temps1) / CLOCKS_PER_SEC;

    //printArray(array, n);
    printf("\n tri peigne: %lf seconds\n", seconds);

    return 0;
}


void randomArray(int *arr, int n) {


        for (int i = 0 ; i < n ; i++)
        {
            arr[i] = rand(); // tirage aléatoire
            //printf("array[%d] = %d \n", i, arr[i]);
        }

}
void triPeigne(int *arr, int n) {

        int arrlength = n;
        int ecart = arrlength;
        double shrink = 1.3; // Offre les performances optimales
        bool echange = true;

        while (ecart > 1 || echange)
        {
            if (ecart > 1)
            {
                ecart = (int) (ecart / shrink);
            }

            int i = 0;
            echange = false;
            while (i + ecart < arrlength)
            {
                if (arr[i] > arr[i + ecart])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + ecart];
                    arr[i + ecart] = temp;
                    echange = true;
                }
                i++;
            }

        }
}

void printArray(int *arr, int n) {
        for (int i = 0 ; i < n ; i++){
            printf("array[%d] = %d \n", i, arr[i]);
        }

}





