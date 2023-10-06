package lesson2;

public class Lesson2 {
    public static int[] comparator(int[] a, int[] b) {

        if (a.length == b.length) {
            int[] c = new int[a.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] - b[i];
            }
            return c;
        }
        else {
            return new int[1];
        }

    }

    public static void main(String[] args) {
        int[] a = new int[]{4, 5, 6};
        int[] b = new int[]{1, 2, 6, 7};
        int[] result = comparator(a,b);
        System.out.println(result[0]);
    }
}
