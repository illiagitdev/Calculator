package lesson6;

public class Mode {
    public static void main(String[] args) {
        System.out.println("\n");
        int[] arr1 = new int[15];
        fillArrayInt(arr1);
        showArray(arr1);

        /*
         * Масиви - метод повертає моду
         */
        arrayMode(arr1);

        //creating two linked arrays
        //1 - contains unique values
        //2 - contains number of unique values in the array
        shakerSort(arr1);
        showArray(arr1);
        int size=countDifferent(arr1);
        System.out.println("Number of different values: "+size);
        int[] uniqueArray = new int[size];
        int[] uniqueCounter =new int[size];
        int unique =separator(arr1,uniqueArray,uniqueCounter);
        showArray(uniqueArray);
        showArray(uniqueCounter);


        System.out.println();
        showDifferent(arr1);
    }

    /**
     * поверта два масиви: з унікальними елементами та з числом повторів цих елементів,
     * на входатри масиви - базовий +2 і число яке вказує кількість унікальних елементів
     */
    private static int separator(int[] array, int[] uniqueArray, int[] uniqueCounter) {
        int counter = 1;
        int k=0;
        uniqueArray[k]=array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (i == (array.length - 2)) {
                System.out.println("Element " + array[array.length - 1] + " counts: " + counter);
            }

            if (array[i + 1] == array[i]) {
                counter++;
                continue;
            } else {
                uniqueCounter[k]=counter;
                uniqueArray[++k]=array[i+1];
                System.out.println("Element " + array[i] + " counts: " + counter);
                counter = 1;
            }

        }
        return 0;
    }

    /**
     * Works with sorted array
     */
    private static int countDifferent(int[] arr1) {
        int counter = 1;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i]!=arr1[i+1]){
                counter++;
            }
        }
        return counter;
    }

    /**
     * For sorted arrays. Виводить елемент і число його повторів у масиві
     */
    private static void showDifferent(int[] arr1) {
        int counter = 1;
        for (int i = 0; i < arr1.length - 1; i++) {
            if (arr1[i + 1] == arr1[i]) {
                counter++;
            } else {
                System.out.println("Element " + arr1[i] + " counts: " + counter);
                counter = 1;
            }

            if (i == (arr1.length - 2)) {
                System.out.println("Element " + arr1[arr1.length - 1] + " counts: " + counter);
            }
        }
    }

    private static void shakerSort(int[] arr1) {
        int swap;
        for (int i = 0; i < arr1.length / 2; i++) {
            for (int j = 0; j < arr1.length - (1 + i); j++) {
                if (arr1[j] > arr1[j + 1]) {
                    swap = arr1[j + 1];
                    arr1[j + 1] = arr1[j];
                    arr1[j] = swap;
                }
            }

            for (int k = arr1.length - (i + 2); k > (i + 1); k--) {
                if (arr1[k + 1] < arr1[k]) {
                    swap = arr1[k + 1];
                    arr1[k + 1] = arr1[k];
                    arr1[k] = swap;
                }
            }
        }
    }

    /**
     * повертає моду, або першу моду на яку попаде перевірка(решта мод ігнорується)
     */
    private static void arrayMode(int[] array) {
        int mode = 0;
        int tmpMode;
        int count = 0;
        int tmpCount = 0;

        for (int value : array) {
            tmpMode = value;
            for (int i : array) {
                if (tmpMode == i) {
                    tmpCount++;
                }
            }
            if (count < tmpCount) {
                count = tmpCount;
                mode = tmpMode;
            }
            tmpCount = 0;
        }
        System.out.println("\nMode is: " + mode + " counts " + count + " times.\n");
    }

    private static void showArray(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
    }

    private static void fillArrayInt(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);
        }
    }

}
