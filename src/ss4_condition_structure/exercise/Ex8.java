package ss4_condition_structure.exercise;

import utils.enums.CheckInputLimit;
import utils.InputCommon;

public class Ex8 {
    public static int getDaysOfMonth(int month, int year) {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))
                    yield 29;
                else
                    yield 28;
            }
            default -> 31;
        };
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap vao thang: ");
            int month = ic.checkInputInt(1, 12);
            System.out.print("Nhap vao nam: ");
            int year = ic.checkInputInt(CheckInputLimit.MIN, 0);

            int daysOfMonth = getDaysOfMonth(month, year);

            System.out.println("Thang " + month + " nam " + year + " co " + daysOfMonth + " ngay");

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
