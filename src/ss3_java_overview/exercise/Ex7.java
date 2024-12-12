package ss3_java_overview.exercise;

public class Ex7 {
    public static void calc(char chr) {
        int a, i = 1, j = 1;
        switch (chr) {
            case 'a' -> a = i++ + j++;
            case 'b' -> a = i++ + ++j;
            case 'c' -> a = ++i + j++;
            case 'd' -> a = ++i + ++j;
            case 'e' -> a = i++ + j++ + i++ + j++;
            case 'f' -> a = ++i + ++j + i++ + j++;
            case 'g' -> {
                a = i++ + ++i - i-- - --i;
                System.out.printf("a = %d, i = %d\n", a, i);
                return;
            }
            case 'h' -> {
                a = 10;
                a += a++ + ++a;
                System.out.printf("a = %d\n", a);
                return;
            }
            default -> {
                return;
            }
        }
        System.out.printf("a = %d, i = %d, j = %d\n", a, i, j);
    }


    public static void main(String[] args) {
        for (char chr = 'a'; chr <= 'h'; chr++) { // in ra ket qua tu cau a -> h
            calc(chr);
        }
    }
}
