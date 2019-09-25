package lesson6;

public class Mode {
    public static void main(String[] args) {
        System.out.println("\n");
        int[] arr1 = new int[20];
        fillArrayInt(arr1);
        showArray(arr1);

        /*
         * Масиви - метод повертає моду
         */
        arrayMode(arr1);

        shakerSort(arr1);
        int uniqueArray=new int[countDifferent(arr1)];
        showArray(arr1);


        System.out.println();
        showDifferent(arr1);
    }

    private static int countDifferent(int[] arr1) {

        return 0;
    }

    //todo:перегрузити щоб повертав два масиви: з унікальними елементами та з числом повторів цих елементів, на входатри масиви - базовий +2 і число яке вказує кількість унікальних елементів
    /**
     * For sorted arrays. Виводить елемент і число його повторів у масиві
     *
     * @param arr1
     */
    private static int[] showDifferent(int[] arr1) {
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
        return
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
