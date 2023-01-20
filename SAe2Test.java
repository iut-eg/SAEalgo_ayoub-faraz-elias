import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SAe2Test {

    @Test
    void triInsertion() {

        int[] tabDécroissant = {6,5,4,3,2,1};
        int[] resultatDécroissant = {1,2,3,4,5,6};
        SAe2.triInsertion(tabDécroissant);
        assertArrayEquals(tabDécroissant, resultatDécroissant);

        int[] tabMoyen = {1, 5, 10, 5, 4, 0, 9};
        int[] resultatMoyen = {0, 1, 4, 5, 5, 9, 10};
        SAe2.triInsertion(tabMoyen);
        assertArrayEquals(tabMoyen, resultatMoyen);

        int[] tabMoyen2 = {-10, 10, 50, -50, 0, 7, -10};
        int[] resultatMoyen2 = {-50 ,-10, -10, 0, 7, 10, 50};
        SAe2.triInsertion(tabMoyen2);
        assertArrayEquals(tabMoyen2, resultatMoyen2);

        int[] tabNull = {0,0,0,0,0};
        int[] resultatNull = {0,0,0,0,0};
        SAe2.triInsertion(tabNull);
        assertArrayEquals(tabNull, resultatNull);

        int[] tabCroissant = {1,2,3,4,5,9,13,25};
        int[] resultatCroissant = {1,2,3,4,5,9,13,25};
        SAe2.triInsertion(tabCroissant);
        assertArrayEquals(tabCroissant, resultatCroissant);
    }

    @Test
    void triCocktail1() {

        int[] tabDécroissant = {6,5,4,3,2,1};
        int[] resultatDécroissant = {1,2,3,4,5,6};
        SAe2.triCocktail1(tabDécroissant);
        assertArrayEquals(tabDécroissant, resultatDécroissant);

        int[] tabMoyen = {1, 5, 10, 5, 4, 0, 9};
        int[] resultatMoyen = {0, 1, 4, 5, 5, 9, 10};
        SAe2.triCocktail1(tabMoyen);
        assertArrayEquals(tabMoyen, resultatMoyen);

        int[] tabMoyen2 = {-10, 10, 50, -50, 0, 7, -10};
        int[] resultatMoyen2 = {-50 ,-10, -10, 0, 7, 10, 50};
        SAe2.triCocktail1(tabMoyen2);
        assertArrayEquals(tabMoyen2, resultatMoyen2);

        int[] tabNull = {0,0,0,0,0};
        int[] resultatNull = {0,0,0,0,0};
        SAe2.triCocktail1(tabNull);
        assertArrayEquals(tabNull, resultatNull);

        int[] tabCroissant = {1,2,3,4,5,9,13,25};
        int[] resultatCroissant = {1,2,3,4,5,9,13,25};
        SAe2.triCocktail1(tabCroissant);
        assertArrayEquals(tabCroissant, resultatCroissant);
    }

    @Test
    void triBubble() {

        int[] tabDécroissant = {6,5,4,3,2,1};
        int[] resultatDécroissant = {1,2,3,4,5,6};
        SAe2.triBubble(tabDécroissant);
        assertArrayEquals(tabDécroissant, resultatDécroissant);

        int[] tabMoyen = {1, 5, 10, 5, 4, 0, 9};
        int[] resultatMoyen = {0, 1, 4, 5, 5, 9, 10};
        SAe2.triBubble(tabMoyen);
        assertArrayEquals(tabMoyen, resultatMoyen);

        int[] tabMoyen2 = {-10, 10, 50, -50, 0, 7, -10};
        int[] resultatMoyen2 = {-50 ,-10, -10, 0, 7, 10, 50};
        SAe2.triBubble(tabMoyen2);
        assertArrayEquals(tabMoyen2, resultatMoyen2);

        int[] tabNull = {0,0,0,0,0};
        int[] resultatNull = {0,0,0,0,0};
        SAe2.triBubble(tabNull);
        assertArrayEquals(tabNull, resultatNull);

        int[] tabCroissant = {1,2,3,4,5,9,13,25};
        int[] resultatCroissant = {1,2,3,4,5,9,13,25};
        SAe2.triBubble(tabCroissant);
        assertArrayEquals(tabCroissant, resultatCroissant);

    }

    @Test
    void triCocktail2() {

        int[] tabDécroissant = {6,5,4,3,2,1};
        int[] resultatDécroissant = {1,2,3,4,5,6};
        SAe2.triCocktail2(tabDécroissant);
        assertArrayEquals(tabDécroissant, resultatDécroissant);

        int[] tabMoyen = {1, 5, 10, 5, 4, 0, 9};
        int[] resultatMoyen = {0, 1, 4, 5, 5, 9, 10};
        SAe2.triCocktail2(tabMoyen);
        assertArrayEquals(tabMoyen, resultatMoyen);

        int[] tabMoyen2 = {-10, 10, 50, -50, 0, 7, -10};
        int[] resultatMoyen2 = {-50 ,-10, -10, 0, 7, 10, 50};
        SAe2.triCocktail2(tabMoyen2);
        assertArrayEquals(tabMoyen2, resultatMoyen2);

        int[] tabNull = {0,0,0,0,0};
        int[] resultatNull = {0,0,0,0,0};
        SAe2.triCocktail2(tabNull);
        assertArrayEquals(tabNull, resultatNull);

        int[] tabCroissant = {1,2,3,4,5,9,13,25};
        int[] resultatCroissant = {1,2,3,4,5,9,13,25};
        SAe2.triCocktail2(tabCroissant);
        assertArrayEquals(tabCroissant, resultatCroissant);

    }

    @Test
    void triPeigne() {

        int[] tabDécroissant = {6,5,4,3,2,1};
        int[] resultatDécroissant = {1,2,3,4,5,6};
        SAe2.triPeigne(tabDécroissant);
        assertArrayEquals(tabDécroissant, resultatDécroissant);

        int[] tabMoyen = {1, 5, 10, 5, 4, 0, 9};
        int[] resultatMoyen = {0, 1, 4, 5, 5, 9, 10};
        SAe2.triPeigne(tabMoyen);
        assertArrayEquals(tabMoyen, resultatMoyen);

        int[] tabMoyen2 = {-10, 10, 50, -50, 0, 7, -10};
        int[] resultatMoyen2 = {-50 ,-10, -10, 0, 7, 10, 50};
        SAe2.triPeigne(tabMoyen2);
        assertArrayEquals(tabMoyen2, resultatMoyen2);

        int[] tabNull = {0,0,0,0,0};
        int[] resultatNull = {0,0,0,0,0};
        SAe2.triPeigne(tabNull);
        assertArrayEquals(tabNull, resultatNull);

        int[] tabCroissant = {1,2,3,4,5,9,13,25};
        int[] resultatCroissant = {1,2,3,4,5,9,13,25};
        SAe2.triPeigne(tabCroissant);
        assertArrayEquals(tabCroissant, resultatCroissant);

    }

    @Test
    void triComptage() {

        int[] tabDécroissant = {6,5,4,3,2,1};
        int[] resultatDécroissant = {1,2,3,4,5,6};
        SAe2.triComptage(tabDécroissant);
        assertArrayEquals(tabDécroissant, resultatDécroissant);

        int[] tabMoyen = {1, 5, 10, 5, 4, 0, 9};
        int[] resultatMoyen = {0, 1, 4, 5, 5, 9, 10};
        SAe2.triComptage(tabMoyen);
        assertArrayEquals(tabMoyen, resultatMoyen);

        int[] tabNull = {0,0,0,0,0};
        int[] resultatNull = {0,0,0,0,0};
        SAe2.triComptage(tabNull);
        assertArrayEquals(tabNull, resultatNull);

        int[] tabCroissant = {1,2,3,4,5,9,13,25};
        int[] resultatCroissant = {1,2,3,4,5,9,13,25};
        SAe2.triComptage(tabCroissant);
        assertArrayEquals(tabCroissant, resultatCroissant);

    }
}