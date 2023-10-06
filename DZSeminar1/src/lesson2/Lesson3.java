package lesson2;

public class Lesson3 {
    public static int[] comparator(int[] a, int[] b) {

        if (a.length == b.length) {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                try {
                    c[i] = a[i] / b[i];
                } catch (ArithmeticException e) {
//                    System.out.println(e);
                    throw new RuntimeException();
                }

            }
            return c;
        }
        else {
            return new int[1];
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{4, 5, 6};
        int[] b = new int[]{1, 2, 0};
        int[] result = comparator(a,b);
        System.out.println(result[0]);
    }
}
