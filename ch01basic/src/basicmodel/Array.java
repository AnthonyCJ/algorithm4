package basicmodel;


public class Array {
    /**
     * 数组初始化方法
     */
    public static void arrayInit() {
        // 完整模式
        double[] a;
        a = new double[5];
        for (int i = 0; i < 5; i++)
            a[i] = 0.0;
        // 简化写法
        double[] b = new double[5];
        // 声明 + 初始化
        int[] c = { 1, 1, 2, 3, 5, 8 };

        double[][] d = new double[3][3];
    }

    public static void anotherName() {
        int[] a = { 1, 2, 3 };
        int[] b = a;
        b[2] = 4;
        System.out.println(a[2]);
    }

    /**
     * 找出数组最大元素
     * @param a array to find the max element
     */
    public static void findMaxElem(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            max = Math.max(a[i], max);
            // max = (a[i] > max) ? a[i] : max;
        }
    }
    /**
     * 计算数组元素平均值
     * @param a array for average
     * @return double average
     */
    public static double average(double[] a) {
         double sum = 0;
         for (double elem : a) {
             sum += elem;
         }
         return sum / a.length;
    }

    /**
     * 数组元素逆序
     * @param a array to be reversed
     */
    public static void arrayReverse(int[] a) {
        int temp;
        for (int i = 0; i < a.length / 2; i++) {
            temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    /**
     * 数组元素逆序
     * @param a array to be reversed
     * @param start index to start
     * @param end index to end
     */
    public static void arrayReverse(int[] a,int start, int end) {
         int temp;
         for (int i = start; i <= (start + end) / 2; i++) {
             temp = a[i];
             a[i] = a[end - i + start];
             a[end - i + start] = temp;
         }
    }
}
