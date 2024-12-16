package ss4_condition_structure.exercise;

import utils.CheckInputType;
import utils.InputCommon;

public class Ex11 {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            // input
            System.out.print("Nhap vao ngay: ");
            int day = ic.checkInputInt(1, 31);
            System.out.print("Nhap vao thang: ");
            int month = ic.checkInputInt(1, 12);
            System.out.print("Nhap vao nam: ");
            int year = ic.checkInputInt(CheckInputType.MIN, 0);

            // check valid day
            int daysOfMonth = Ex8.getDaysOfMonth(month, year);
            if (day > daysOfMonth) {
                System.out.println("Ngay khong hop le");
                return;
            }

            // get next date and previous date
            int nextDateDay = day + 1;
            int nextDateMonth = month;
            int nextDateYear = year;

            int previousDateDay = day - 1;
            int previousDateMonth = month;
            int previousDateYear = year;

            if (day == 1) { // start of month
                nextDateDay = 2;

                if (month == 1) {   // start of year
                    if (year == 0) {
                        System.out.println("Khong co ngay truoc do");
                        return;
                    }
                    previousDateDay = Ex8.getDaysOfMonth(12, year - 1);
                    previousDateMonth = 12;
                    previousDateYear = year - 1;
                } else {
                    previousDateDay = Ex8.getDaysOfMonth(month - 1, year);
                    previousDateMonth = month - 1;
                }
            } else if (day == daysOfMonth) { // end of month
                previousDateDay = day - 1;
                nextDateDay = 1;

                if (month == 12) { // end of year
                    nextDateMonth = 1;
                    nextDateYear = year + 1;
                } else {
                    nextDateMonth = month + 1;
                }
            }

            System.out.printf("Ngay truoc do la %d/%d/%d\n", previousDateDay, previousDateMonth, previousDateYear);
            System.out.printf("Ngay ke tiep la %d/%d/%d\n", nextDateDay, nextDateMonth, nextDateYear);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
