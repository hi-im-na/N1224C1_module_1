package ss5_loop.exercise;

import utils.CheckInputType;
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


    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so n: ");
            int n = ic.checkInputInt(CheckInputType.MIN, 1);

            hinh('a', n);
            hinh('e', n);
            hinh('b', n);
            hinh('c', n);
            hinh('d', n);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
