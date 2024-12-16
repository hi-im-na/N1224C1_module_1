package ss4_condition_structure.exercise;

import utils.InputCommon;

public class Ex6 {

    public static void quadraticEquation(int a, int b, int c) {
        if (a == 0) {
            Ex5.simpleEquation(a, b);
            return;
        }
        int delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phuong trinh vo so nghiem");
        } else if (delta == 0) {
            System.out.println("Phuong trinh co 1 nghiem duy nhat x = " + (-b / (2 * a)));
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Phuong trinh co 2 nghiem x1 = %f, x2 = %f", x1, x2);
        }
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so a: ");
            int a = ic.checkInputInt();
            System.out.print("Nhap so b: ");
            int b = ic.checkInputInt();
            System.out.print("Nhap so c: ");
            int c = ic.checkInputInt();

            quadraticEquation(a, b, c);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
