package ss4_condition_structure.exercise;

import utils.enums.CheckInputLimit;
import utils.InputCommon;

public class Ex7 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap tham nien cong tac: ");
            double basicSalary = 650000;
            double factor;
            int yearsWorked = ic.checkInputInt(CheckInputLimit.MIN, 1); // month

            if (yearsWorked < 12) factor = 1.92;
            else if (yearsWorked < 36) factor = 2.34;
            else if (yearsWorked < 60) factor = 3;
            else factor = 4.5;

            System.out.println("Luong cua nhan vien la: " + (basicSalary * factor));

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}
