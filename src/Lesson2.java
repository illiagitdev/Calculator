public class Lesson2 {
    public static void main(String[] args) {
        int[] mas = new int[Integer.MAX_VALUE/4000];
        long time = System.currentTimeMillis();
        for (int i = 0; i < mas.length; ) {
            mas[i] = ++i + 1;
        }
        System.out.println(System.currentTimeMillis()-time);

        mas = new int[Integer.MAX_VALUE/4000];
        time = System.currentTimeMillis();
        mas[0] = 0;
        for (int i = 1; i < mas.length; i++) {
            mas[i] =  mas[i-1] + 1;
        }
        System.out.println(System.currentTimeMillis()-time);

//        for (int i = 0; i < 5; i++) {
//            System.out.println(mas[i]);
//        }
    }
}
