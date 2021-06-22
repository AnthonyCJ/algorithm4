package basicmodel;

public class FormatIO {
    public static void testIO() {
        int a = 1234;
        double b = 2.5678;
        String string = "Hello, World!";
//        System.out.printf("%-3d%-3d\n", a, a);
//        System.out.printf("%-6.3f%.3f\n", b, b);
        System.out.printf("%14s\n", string);
        System.out.printf("%-14s\n", string);
        System.out.printf("%14.5s", string);
    }
    public static void main(String[] args) {
        testIO();
    }
}
