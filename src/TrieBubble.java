public class TrieBubble {
    public static void main(String[] args) {

        int arr[] = {5,1,4,2,8};

        int[] arrSorted = triBubble(arr);
    }

    public static int[] triBubble(int[] arr) {
        int swap = 0;
        boolean order;
        do {
            order = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = swap;
                    order = false;
                }
            }
        } while (!order);

        return arr;
    }




}
