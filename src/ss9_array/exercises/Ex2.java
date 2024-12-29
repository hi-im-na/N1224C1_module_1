package ss9_array.exercises;

import utils.enums.CheckInputLimit;
import utils.enums.GenderTypeVienamese;
import utils.InputCommon;

public class Ex2 {
    protected static String[] name;
    protected static int[] age;
    protected static String[] gender;
    protected static int[] salary;
    protected static double[] gpa;

    protected static void input(int n, InputCommon ic) {
        for (int i = 0; i < n; i++) {
            System.out.println(" ----------------- ");
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) + ":");
            System.out.print("Nhap ten: ");
            name[i] = ic.checkInputString();
            System.out.print("Nhap tuoi: ");
            age[i] = ic.checkInputInt(CheckInputLimit.MIN, 1);
            System.out.print("Nhap gioi tinh (nam/ nu/ khac): ");
            gender[i] = ic.checkInputEnum(GenderTypeVienamese.class);
            System.out.print("Nhap luong co ban: ");
            salary[i] = ic.checkInputInt(CheckInputLimit.MIN, 0);
            System.out.print("Nhap diem trung binh: ");
            gpa[i] = ic.checkInputDouble(CheckInputLimit.MIN, 0);
        }
    }

    protected static void displayIthEmployee(int n) {
        System.out.println(" ----------------- ");
        System.out.println("Ten nhan vien: " + name[n]);
        System.out.println("Tuoi: " + age[n]);
        System.out.println("Gioi tinh: " + gender[n]);
        System.out.println("Luong co ban: " + salary[n]);
        System.out.println("Diem trung binh: " + gpa[n]);
    }

    public static void main(String[] args) {
        try (InputCommon ic = new InputCommon()) {
            System.out.print("Nhap so nhan vien muon nhap: ");
            int n = ic.checkInputInt(CheckInputLimit.MIN, 1);

            name = new String[n];
            age = new int[n];
            gender = new String[n];
            salary = new int[n];
            gpa = new double[n];

            input(n, ic);
            for (int i = 0; i < n; i++) {
                displayIthEmployee(i);
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}