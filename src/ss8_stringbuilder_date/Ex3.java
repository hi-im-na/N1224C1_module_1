package ss8_stringbuilder_date;

public class Ex3 {

    public static double castA(byte a) {
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;
        return f;
    }

    public static byte castBC(double a) {
        float b = (float) a;
        long c = (long) b;
        int d = (int) c;
        short e = (short) d;
        byte f = (byte) e;
        return f;
    }

    public static void castD() {
        /**
         * ép kiểu tường minh: khi ép kiểu từ kiểu dữ liệu lớn về kiểu dữ liệu nhỏ hơn
         * ép kiểu không tường minh: khi ép kiểu từ kiểu dữ liệu nhỏ thành kiểu dữ liệu lớn hơn, không cần thêm từ khóa
         */
    }

    public static void castE() {
        /**
         * Dùng các kí tự L, D, F, ... sau các số khi khai báo biến để rõ ràng kiểu dữ liệu
         * L: long, D: double, F: float, ...
         *
         * Java tự hiểu các số thuộc kiểu dữ liệu gì mà không càn dùng chữ khi khai báo biến.
         * nếu là số nguyên, kiểu ngầm định là int
         * nếu là số thực, kiểu ngầm định là double
         */
    }

    public static void main(String[] args) {
        byte a = 127;
        System.out.println(castA(a)); // a: do chinh xac khong doi
        System.out.println(castBC(127.0)); // b: do chinh xac khong doi
        System.out.println(castBC(128.1)); // c: do chinh xac thay doi
    }

}
