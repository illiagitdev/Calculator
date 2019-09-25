package lesson6;

public class Mode {
    public static void main(String[] args) {
        System.out.println("\n");
        int[] arr1=new int[20];
        fillArrayInt(arr1);
        showArray(arr1);

        /*
         * Масиви - метод повертає моду
         */
        arrayMode(arr1);

        shakerSort(arr1);
        showArray(arr1);

        showDifferent(arr1);
    }

    private static void showDifferent(int[] arr1) {

    }

    private static void shakerSort(int[] arr1) {
        int swap;
        for (int i = 0; i < arr1.length/2; i++) {
            for (int j = 0; j < arr1.length - (1+i); j++) {
                if (arr1[j]>arr1[j+1]) {
                    swap=arr1[j+1];
                    arr1[j+1]=arr1[j];
                    arr1[j]=swap;
                }
            }

            for (int k = arr1.length-(i+2); k >(i+1) ; k--) {
                if (arr1[k+1]<arr1[k]){
                    swap=arr1[k+1];
                    arr1[k+1]=arr1[k];
                    arr1[k]=swap;
                }
            }
        }
    }

    private static void arrayMode(int[] array) {
        int mode=0;
        int tmpMode;
        int count=0;
        int tmpCount=0;

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
        System.out.println("\nMode is: "+mode+" counts "+count+" times.\n");
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
