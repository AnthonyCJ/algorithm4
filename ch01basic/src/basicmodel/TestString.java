package basicmodel;

import java.lang.Integer;
import java.lang.Double;

public class TestString {
    /**
     * 类型转换
     */
    public static void integerTransform() {
        // 字符串转整型
        int n = Integer.parseInt("3");
        System.out.println((n + 1));
        // 整型转字符串
        String s = Integer.toString(5);
        System.out.println(s);
    }

    public static void doubleTransform() {
        // 字符串转浮点数
        double d = Double.parseDouble("1.5");
        System.out.println((d + 0.25));
        // 浮点数转字符串
        String s = Double.toString(7.5);
        System.out.println(s);
    }

    public static void main(String[] args) {
        integerTransform();
        doubleTransform();
    }
}
