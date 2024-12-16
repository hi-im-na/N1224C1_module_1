package ss4_condition_structure.exercise;

import utils.InputCommon;

public class Ex3 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so a: ");
            int a = ic.checkInputInt();

            System.out.print("Nhap so b: ");
            int b = ic.checkInputInt();

            // cach 1: temp
            int temp = a;
            a = b;
            b = temp;

            // cach 2: without temp
//            a = a + b;
//            b = a - b;
//            a = a - b;

            System.out.printf("gia tri cua a = %d, b = %d", a, b);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
