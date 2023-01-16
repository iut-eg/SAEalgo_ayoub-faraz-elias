import java.util.Arrays;
import java.util.Random;
public class BenchmarkOrder {

        public static void main(String[] args) {
            int arrayChoice = 4;
            int n=0;
            int[] array;
            

            switch (arrayChoice) {
                case 0:
                int[] array0 = {5, 1, 4, 2, 8, 89, 24, 36, 5, 1, 5, 68, 24, 786, 255, 9, 544, 47, 55, 59, 2, 525, 8, 99484, 48, 45, 4, 48, 54};
                array = array0;
                n = array.length;
                break;
            
            case 1: //100 k
                n = 100000;
                int[] array1 = FarazAlgos.générerDonnées(n);
                array = array1;
                break;
            
            case 2: //200 k
                n = 200000;
                int[] array2 = FarazAlgos.générerDonnées(n);
                array = array2;
            break;
            case 3: //10 M's
                n = 10000000;
                int[] array3 = FarazAlgos.générerDonnées(n);
                FarazAlgos.générerDonnées(n);
                array = array3;
                break;
            case 4: //100 M's
                n = 100000000;
                int[] array4 = FarazAlgos.générerDonnées(n);
                FarazAlgos.générerDonnées(n);
                array = array4;
                break;
            default:
                System.err.println("default case");
                array = new int[0];
            }
            


            for (int i = 0; i < 40; i++){
                System.out.print('-');}

            System.out.println("\nNombre de data = " + n + "\n");

                for (int algo = 1; algo <= 3; algo++){

                    long tempsDébut = System.nanoTime();
                    switch (algo) {
                        case 1:
                            System.out.println("Java default sort");
                            Arrays.sort(array);


                            break;
                        case 2:
                            System.out.println("Bubble sort");
                            TrieBubble.triBubble(array);

                            break;
                        case 3:
                            System.out.println("Faraz Cocktail sort");
                            FarazAlgos.triCocktail(array);
                           
                            break;
                    

                    }
                    long tempsFin = System.nanoTime();

                    //printab(array);
                    System.out.println("Temps de calcul en millisecondes: " + ((tempsFin - tempsDébut) / 1000000));
                }
        }


            public static void printab(int[] t){

                for (int i = 0; i < t.length; i++) {
                    System.out.print(t[i] + ",  "); // tirage aléatoire d'un int quelconque (compris entre -2^31 et 2^31-1)
                }
                System.out.println();
            }

}

