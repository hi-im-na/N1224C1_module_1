package ss3_java_overview.exercise;

public class Ex7 {
    public static void cauA(int i, int j) {
        int a = i++ + j++;
        System.out.printf("a = %d, i = %d, j = %d\n", a, i, j);
    }

    public static void cauB(int i, int j) {
        int a = i++ + ++j;
        System.out.printf("a = %d, i = %d, j = %d\n", a, i, j);
    }

    public static void cauC(int i, int j) {
        int a = ++i + j++;
        System.out.printf("a = %d, i = %d, j = %d\n", a, i, j);
    }

    public static void cauD(int i, int j) {
        int a = ++i + ++j;
        System.out.printf("a = %d, i = %d, j = %d\n", a, i, j);
    }

    public static void cauE(int i, int j) {
        int a = i++ + j++ + i++ + j++;
        System.out.printf("a = %d, i = %d, j = %d\n", a, i, j);
    }

    public static void cauF(int i, int j) {
        int a = ++i + ++j + i++ + j++;
        System.out.printf("a = %d, i = %d, j = %d\n", a, i, j);
    }

    public static void cauG(int i) {
        int a = i++ + ++i - i-- - --i;
        System.out.printf("a = %d, i = %d\n", a, i);
    }

    public static void cauH() {
        int a = 10;
        a += a++ + ++a;
        System.out.printf("a = %d\n", a);
    }

    public static void main(String[] args) {
        int i = 1, j = 1;
        cauA(i, j);
        cauB(i, j);
        cauC(i, j);
        cauD(i, j);
        cauE(i, j);
        cauF(i, j);
        cauG(i);
        cauH();
    }
}
