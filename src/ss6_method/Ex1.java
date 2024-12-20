package ss6_method;

import ss4_condition_structure.exercise.Ex5;
import ss4_condition_structure.exercise.Ex6;
import utils.InputCommon;

public class Ex1 {
    public static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char) (c + 32);
        }
        return c;
    }

    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap ky tu c: ");
            char c = ic.checkInputString().charAt(0);

            System.out.println("Chuyen thanh ky tu thuong: " + toLowerCase(c));
            System.out.print("Giai phuong trinh bac nhat: ");
            Ex5.simpleEquation(5, 6);
            System.out.print("Giai phuong trinh bac hai: ");
            Ex6.quadraticEquation(1, 2, 1);
            System.out.println("Gia tri nho nhat trong 4 so nguyen: " + min(new int[]{2, 5, 1, 4}));
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
