package ss7_debug_string;

import utils.InputCommon;

public class Ex3 {


    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap chuoi 1: ");
            String str1 = ic.checkInputString();

            System.out.print("Nhap chuoi 2: ");
            String str2 = ic.checkInputString();

            switch (str1.compareTo(str2)) {
                case 0 -> System.out.println("Chuoi 1 va chuoi 2 giong nhau");
                case 1 -> System.out.println("Chuoi 1 lon hon chuoi 2");
                case -1 -> System.out.println("Chuoi 1 nho hon chuoi 2");
            }

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
