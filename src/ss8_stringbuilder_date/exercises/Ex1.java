package ss8_stringbuilder_date.exercises;

public class Ex1 {
    // d
    public static void cauD() {
        String a = "A"; // doi tuong 1
        String b = new String("A"); // doi tuong 2
        String c = "A"; // doi tuong 1
        b.concat("B"); // khong co bien tham chieu den doi tuong moi
        String d = c.concat("C"); // doi tuong 3
        StringBuffer e = new StringBuffer("E"); // doi tuong 4
        e.append("F"); // ko tao doi tuong moi
        StringBuffer g = new StringBuffer("G"); // doi tuong 5
        g.append("H"); // ko tao doi tuong moi
        System.out.println(a + b + c + d + e + g);
    }

    /**
     * so sanh su khac nhau giua equals() va == khi dung String, StringBuilder, StringBuffer
     */
    public static void cauE() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        StringBuffer sbf1 = new StringBuffer("Hello");
        StringBuffer sbf2 = new StringBuffer("Hello");

        // so sanh equals()
        System.out.println("So sanh equals()");

        // so sanh String
        System.out.println("So sanh String: ");
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // true

        // so sanh StringBuilder
        System.out.println("So sanh StringBuilder: ");
        System.out.println("sb1.equals(sb2): " + sb1.equals(sb2)); // false

        // so sanh StringBuffer
        System.out.println("So sanh StringBuffer: ");
        System.out.println("sbf1.equals(sbf2): " + sbf1.equals(sbf2)); // false

        // so sanh ==
        System.out.println("So sanh == ");

        // so sanh String
        System.out.println("So sanh String: ");
        System.out.println("s1 == s2: " + (s1 == s2)); // true
        System.out.println("s1 == s3: " + (s1 == s3)); // false
        System.out.println("s3 == s4: " + (s3 == s4)); // false

        // so sanh StringBuilder
        System.out.println("So sanh StringBuilder: ");
        System.out.println("sb1 == sb2: " + (sb1 == sb2)); // false

        // so sanh StringBuffer
        System.out.println("So sanh StringBuffer: ");
        System.out.println("sbf1 == sbf2: " + (sbf1 == sbf2)); // false
    }

    public static void main(String[] args) {
        String s = "Hello World";
        StringBuilder sb = new StringBuilder(s);
        StringBuffer sbf = new StringBuffer(s);

        // a
        System.out.println(sb.substring(6));
        System.out.println(sbf.substring(6));
        sb = new StringBuilder(s);
        sbf = new StringBuffer(s);

        // b
        System.out.println("Thay \'o\' bang \'f\': " + sb.replace(4, 5, "f"));
        System.out.println("Thay \'o\' bang \'f\': " + sbf.replace(4, 5, "f"));
        sb = new StringBuilder();
        sbf = new StringBuffer();

        // c
        String strHello = "Hello";
        String strWorld = "World";
        System.out.println("Noi chuoi: " + sb.append(strHello).append(" ").append(strWorld));
        System.out.println("Noi chuoi: " + sbf.append(strHello).append(" ").append(strWorld));

        // e
        cauE();
    }
}
