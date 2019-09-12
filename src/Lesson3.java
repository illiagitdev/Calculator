public class Lesson3 {
    public static void main(String[] args) {
//        int i = 11;
//        if (i > 5) {
//            System.out.println("Number above 5!");
//        }else {
//            System.out.println("lol");
//        }
//        if (i>7){
//            System.out.println(i+2);
//        }else if (i>10){
//            System.out.println(i+10);
//        }else {
//            System.out.println("if nothing works)");
//        }

        int[] arr = new int[15];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100 - 50);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // BUBBLE SORTING
//        int swap;
//        for (int i = 0; i <arr.length ; i++) {
//            for (int j = 0; j <(arr.length-i-1) ; j++) {
//                if (arr[j]>arr[j+1]){
//                    swap=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=swap;
//                }
//            }
//        }
//
//        System.out.println();
//        for (int i = 0; i <arr.length ; i++) {
//            System.out.print(arr[i]+" ");
//        }

        System.out.println("Max element in array");

        int max = arr[0];

        inner:
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                continue inner;
            }
        }
        System.out.println("\nMax element in array : " + max);


    }
}
