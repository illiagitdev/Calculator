package tasks;

public class SheikSotr {
    public static void main(String[] args) {
        /*        Creates array and fill it with random numbers         */
        int testArray[] = fillArray(15);
        showArray(testArray);

        testArray = bubbleSort(testArray);
        showArray(testArray);


        /*        new array for shaker sorting      */
        int array1[] = fillArray(20);
        showArray(array1);

        /**
         * Shaker sorting
         */
        int tmp;
        for (int i = 0; i < array1.length - 1; i++) {
            for (int j = i; j < array1.length - (i + 1); j++) {
                if (array1[j] > array1[j + 1]) {
                    tmp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j + 1] = tmp;
                }
            }

            for (int j = array1.length - (i + 2); j > i; j--) {
                if (array1[j - 1] > array1[j]) {
                    tmp = array1[j];
                    array1[j] = array1[j - 1];
                    array1[j - 1] = tmp;
                }
            }
        }

        showArray(array1);
    }

    /**
     * Straightforward bubble sorting
     */
    private static int[] bubbleSort(int[] array) {
        int swap;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        return array;
    }

    /**
     * Prints array of integers
     */
    private static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * Generates array of integers with defined size
     */
    private static int[] fillArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
        }
        return array;
    }
}
