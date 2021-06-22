package elementarySorts;

import java.util.Arrays;
import java.util.Comparator;
public class Insertion {

    /**
     * Insertion Sort. Rearranges the array in ascending order, using the natural order.
     * @param a the array to be sorted
     */
//    public static void sort(Comparable[] a) {
//        // 将a[]按升序排列
//        int N = a.length;
//        for (int i = 1; i < N; i++) {
//            // 将 a[i] 插入到 a[i-1]、a[i-2]、a[i-3]...之中
//            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
//                exch(a, j, j - 1);
//        }
//    }

    /**
     * informed Insertion Sort with half-exchanges.
     * @param a the array to be sorted
     */
    public static void sort01(int[] a) {
        int N = a.length;

        // put smallest element in position to serve as sentinel
        int exchanges = 0;
        for (int i = N-1; i > 0; i--) {
            if (less(a[i], a[i-1])) {
                exch(a, i, i-1);
                exchanges++;
            }
        }
        if (exchanges == 0) return;

        for (int i = 2; i < N; i++) {
            // save the elem to insert
            int v = a[i];
            int j = i;
            while (j > 0 && less(a[j], a[j - 1])) {
                a[j] = a[j - 1];
                j--;
            }
            // fill the blank
            a[j] = v;
        }
    }

    private static boolean less(int v, int w) {
        return v < w;
    }

    private static boolean less(Object v, Object w, Comparator comparator) {
        return comparator.compare(v, w) < 0;
    }

    // exchange a[i] and a[j]
    private static void exch(Object[] a, int i, int j) {
        Object swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    // exchange a[i] and a[j]  (for indirect sort)
    private static void exch(int[] a, int i, int j) {
        int swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    public static void main(String[] args) {
        int[] a = {5, 3, 2, 4, 1};
        sort01(a);
        System.out.println(Arrays.toString(a));
    }
}
