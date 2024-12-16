package ss4_condition_structure.exercise;

import utils.InputCommon;

public class Ex4 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so a: ");
            int a = ic.checkInputInt();
            System.out.print("Nhap so b: ");
            int b = ic.checkInputInt();

            int max, min;
            // cach 1: if else
//            if (a > b) {
//                max = a;
//                min = b;
//            } else {
//                max = b;
//                min = a;
//            }

            // cach 2: ternary operator
            max = (a > b) ? a : b;
            min = (a < b) ? a : b;

            // cach 3: Math library
//            max = Math.max(a, b);
//            min = Math.min(a, b);

            System.out.printf("So lon nhat la: %d; So nho nhat la: %d", max, min);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
