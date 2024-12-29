package ss5_loop.exercise;

import utils.enums.CheckInputLimit;
import utils.InputCommon;

public class Ex16 {

    public static void hinh(char c, int n) {
        System.out.println("Hinh " + c);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                switch (c) {
                    case 'a' -> {
                        if (j <= i) System.out.print("*");
                        else System.out.print(" ");
                    }
                    case 'b' -> {
                        if (j <= n - i - 1) System.out.print("*");
                        else System.out.print(" ");
                    }
                    case 'c' -> {
                        if (j < n - i - 1) System.out.print(" ");
                        else System.out.print("*");
                    }
                    case 'd' -> {
                        if (j > i) System.out.print(" ");
                        else System.out.print("*");
                    }
                    case 'e' -> {
                        if (j > n - i - 1 || (j != 0 && i != 0 && j < n - i - 1))
                            System.out.print(" ");
                        else System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void hinhF(int n) {
        System.out.println("Hinh f");
        for (int i = 0; i < n; i++) { // row
            for (int j = 0; j <= 2 * n - 1; j++) {
                if (j >= n - i - 1 && j <= n + i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void hinhG(int n) {
        System.out.println("Hinh g");
        for (int i = n - 1; i >= 0; i--) { // row
            for (int j = 0; j <= 2 * n - 1; j++) {
                if (j >= n - i - 1 && j <= n + i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputLimit.MIN, 1);

            hinh('a', n);
            hinh('e', n);
            hinh('b', n);
            hinh('c', n);
            hinh('d', n);
            hinhF(4);
            hinhG(4);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
