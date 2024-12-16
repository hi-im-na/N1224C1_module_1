package ss4_condition_structure.exercise;

import utils.InputCommon;

public class Ex5 {

    public static void simpleEquation(int a, int b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo so nghiem");
                return;
            }
            System.out.println("Phuong trinh vo nghiem");
            return;
        }

        System.out.println("Nghiem cua phuong trinh la: " + (-b / a));
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so a: ");
            int a = ic.checkInputInt();
            System.out.print("Nhap so b: ");
            int b = ic.checkInputInt();

            simpleEquation(a, b);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
