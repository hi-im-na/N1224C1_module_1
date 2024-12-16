package ss4_condition_structure.exercise;

import utils.CheckInputType;
import utils.InputCommon;

public class Ex10 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap vao 1 so nguyen: ");
            int n = ic.checkInputInt(CheckInputType.MIN, 0);

            for (int i = 0; i <= n / 2; i++) {
                if (i * i == n || n == 1) {
                    System.out.println(n + " la so chinh phuong");
                    return;
                }
            }
            System.out.println(n + " khong phai la so chinh phuong");
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
