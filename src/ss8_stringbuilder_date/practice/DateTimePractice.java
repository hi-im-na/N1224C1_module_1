package ss8_stringbuilder_date.practice;

import utils.DateInputFormat;
import utils.InputCommon;

import java.time.LocalDate;

public class DateTimePractice {
    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.println("Nhap vao ngay thang nam: ");
            LocalDate date = ic.checkInputDate(DateInputFormat.DD_MM_YYYY);
            System.out.println("Ngay vua nhap: " + date);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
